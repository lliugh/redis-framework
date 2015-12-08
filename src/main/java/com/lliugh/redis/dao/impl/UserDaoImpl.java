package com.lliugh.redis.dao.impl;

import com.lliugh.redis.dao.IUserDao;
import com.lliugh.redis.dao.RedisTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author lliugh & guohaoliu@gmail.com & http://github.com/lliugh
 * @(#)UserDaoImpl.java 1.0 08/12/2015
 */

@Repository
public class UserDaoImpl implements IUserDao {
    @Autowired
    RedisTemplate redisTemplate;

    public String get(String key) {
        return redisTemplate.get(key);
    }

    public String add(String key, String value) {
        return redisTemplate.set(key, value);
    }


}
