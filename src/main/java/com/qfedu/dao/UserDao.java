package com.qfedu.dao;

import com.qfedu.dto.Userdto;
import com.qfedu.entity.User;

import java.util.List;

public interface UserDao {
    User findByName(String loginname); //登录

    void addUser(User user);    // 添加

    void deleteUser(List list);    // 删除

    void updateUser(User user);    // 更新

    List<User> selectUser();    // 查找

    User selectUserById(Integer id);

    List<Userdto> userChart(); //图标需要的管理员  和  数量集合
}
