package com.fd.rookie.service.impl;

import com.fd.rookie.PO.DataSourceType;
import com.fd.rookie.annotation.DataSource;
import com.fd.rookie.entity.User;
import com.fd.rookie.mapper.UserMapper;
import com.fd.rookie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    @DataSource(DataSourceType.ROOKIE)
    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

    @Override
    @DataSource(DataSourceType.LBS)
    public List<User> getUserList() {
        return this.userMapper.selectUserList();
    }

    @Override
    public int addUserBatch(List<User> userList) {
        return this.userMapper.addUserBatch(userList);
    }

    @Override
    public int addUser(User user) {
        return this.userMapper.addUser(user);
    }

    @Override
    public void updateUserBatch(List<User> userList) {
        this.userMapper.updateUserBatch(userList);
    }


}
