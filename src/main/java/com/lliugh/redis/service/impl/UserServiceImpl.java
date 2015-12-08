package com.lliugh.redis.service.impl;

import com.lliugh.redis.dao.IUserDao;
import com.lliugh.redis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lliugh & guohaoliu@gmail.com & http://github.com/lliugh
 * @(#)UserService.java 1.0 07/12/2015
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    public String find(Long id) {
        return userDao.get(String.valueOf(id));
    }

    public String insertUser(Long uid, String user) {
        return userDao.add(String.valueOf(uid), user);
    }

//    @Override
//    public int updateUser(Long Uid, String user) {
//        return 0;
//    }
//
//    @Override
//    public int deleteUser(Long id) {
//        return 0;
//    }
}
