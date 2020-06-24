package com.gec.user.service.impl;

import com.gec.user.dao.UserDao;
import com.gec.user.pojo.User;
import com.gec.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryuserList() {
        return userDao.queryuserList();
    }
}
