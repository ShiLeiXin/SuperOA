package com.qfedu.service;

import com.qfedu.entity.User;
import com.sun.java.swing.plaf.windows.WindowsTextAreaUI;

import java.util.List;

public interface UserService {
     List<User> selectUser();
     void deleteUser(List list);
     void updateUser(User user);
     User selectUserById(Integer id);
     void addUser(User user);
     User findByUser(String loginname, String password);
}
