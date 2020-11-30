package com.qfedu.service.impl;

import com.qfedu.dao.UserDao;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectUser() {
        return userDao.selectUser();
    }

    @Override
    public void deleteUser(List list) {
        userDao.deleteUser(list);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User selectUserById(Integer id) {
        return userDao.selectUserById(id);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User findByUser(String loginname, String password) {
        User user = userDao.findByName(loginname);
        System.out.println(user);

        if (user == null) {
            throw new RuntimeException("账户不存在，请先注册！");
        } else if (!user.getPassword().equals(password)) {
            throw new RuntimeException("密码错误，请仔细核对！");
        } else if (user.getStatus() == 1) {
            throw new RuntimeException("您的账户已经在异地登录，请不要重复登录！");
        } else {
            return user;
        }
    }
}
