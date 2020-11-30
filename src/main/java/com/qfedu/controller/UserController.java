package com.qfedu.controller;

import com.aliyuncs.ecs.model.v20140526.AllocatePublicIpAddressRequest;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import com.qfedu.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.*;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAllByPage")
    @ResponseBody
    public Map<String, Object> findAllByPage(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);

        List<User> users = userService.selectUser();

        PageInfo<User> pageInfo = new PageInfo<>(users);

        HashMap<String, Object> map = new HashMap<>();

        map.put("code", 0);
        map.put("msg", "ok");
        map.put("count", pageInfo.getTotal());
        map.put("data", pageInfo.getList());

        return map;
    }

    @RequestMapping("deleteById")
    public void deleteById(Integer id) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(id);
        userService.deleteUser(list);
    }

    @RequestMapping("deleteByIds")
    @ResponseBody
    public void deleteByIds(Integer[] ids) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer id : ids) {
            list.add(id);
        }
        userService.deleteUser(list);
    }


    @RequestMapping("updateUser")
    @ResponseBody
    public Map<String, Object> updateUser(User user) {

        HashMap<String, Object> map = new HashMap<>();
        try {
            userService.updateUser(user);

            map.put("code", 1);
            map.put("msg", "ok");
            map.put("data", "修改成功！");
        } catch (Exception e) {
            map.put("code", 0);
            map.put("msg", "error");
            map.put("data", "修改失败！");
        }

        return map;
    }

    @RequestMapping("selectUserById")
    @ResponseBody
    public Map<String, Object> selectUserById(Integer id) {
        User user = userService.selectUserById(id);

        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("msg", "ok");
        map.put("data", user);

        return map;
    }

    @RequestMapping("addUser")
    @ResponseBody
    public Map<String, Object> addUser(User user) {
        userService.addUser(user);

        HashMap<String, Object> map = new HashMap<>();

        map.put("code", 1);
        map.put("msg", "ok");
        map.put("data", user);
        return map;
    }

    @RequestMapping("imageLogin")
    public void imageLogin(HttpSession session, HttpServletResponse response) {
        try {
            int width = 100;
            int height = 50;

            BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            Graphics graphics = image.getGraphics();
            graphics.setColor(Color.PINK);
            graphics.fillRect(0, 0, width, height);

            //图片边框
            graphics.setColor(Color.BLUE);
            graphics.drawRect(0, 0, width - 1, height - 1);

            String str = "123456789";

            Random random = new Random();

            StringBuffer sb = new StringBuffer();

            for (int i = 1; i <= 4 ; i++) {
                int index = random.nextInt(str.length());

                char ch = str.charAt(index);

                sb.append(ch);

                //写验证码
                graphics.drawString(ch + "", width/5*i, height / 2);

            }

            String checkCode_session = sb.toString();
            session.setAttribute("checkCode_session", checkCode_session);
            System.out.println(checkCode_session);

            graphics.setColor(Color.GREEN);

            for (int i = 0; i < 10; i++) {
                int x1 = random.nextInt(width);
                int x2 = random.nextInt(width);

                int y1 = random.nextInt(height);
                int y2 = random.nextInt(height);
                graphics.drawLine(x1, x2, y1, y2);
            }

            ImageIO.write(image, "jpg", response.getOutputStream());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("login")
    @ResponseBody
    public Map<String, Object> login(String loginname, String password, String imageCode, HttpSession session) {
        System.out.println("=====");
        System.out.println(loginname);
        System.out.println(password);
        System.out.println(imageCode);
        String checkCode_session = (String) session.getAttribute("checkCode_session");
        System.out.println(checkCode_session);
        HashMap<String, Object> map = new HashMap<>();

        try {
            if (checkCode_session.equalsIgnoreCase(imageCode)) {
                User user = userService.findByUser(loginname, password);
                System.out.println(user);

                System.out.println(user);
                session.setAttribute(StrUtils.LOGIN_USER, user);

                map.put("code", 1);
                map.put("data", user);
            } else {
                map.put("code", 0);
                map.put("data", "验证码输入有误！");
            }
        } catch (Exception e) {
            map.put("code", 0);
            map.put("data", e.getStackTrace());
        }

        return map;
    }
}
