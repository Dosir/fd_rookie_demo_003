package com.fd.rookie.service;


import com.fd.rookie.entity.User;

import java.util.List;

public interface UserService {
    User getUserById(int userId);

    List<User> getUserList();

    int addUserBatch(List<User> userList);

    int addUser(User user);

    void updateUserBatch(List<User> userList);
}
