package org.TeamS.sugar.service.impl;

import org.TeamS.sugar.entity.User;
import org.TeamS.sugar.mapper.UserMapper;
import org.TeamS.sugar.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(String id) {

        User user = userMapper.getUserById(id);

        return user;
    }

}
