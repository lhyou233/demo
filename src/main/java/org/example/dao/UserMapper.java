package org.example.dao;

import org.example.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> selectAllUsers();

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}