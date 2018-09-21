package com.fd.rookie.mapper;


import com.fd.rookie.entity.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 测试批量插入
     */
    int addUserBatch(List<User> userList);

    /**
     * 测试LAST_INSERT_ID方法
     */
    int addUser(User user);

    void updateUserBatch(List<User> userList);

    List<User> selectUserList();
}