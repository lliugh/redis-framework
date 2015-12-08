package com.lliugh.redis.dao;

/**
 * @author lliugh & guohaoliu@gmail.com & http://github.com/lliugh
 * @(#)IUserDao.java 1.0 08/12/2015
 */

public interface UserDao {
    /**
     * 主键查找
     *
     * @param key
     * @return
     */
    String get(String key);

    /**
     * 插入数据单个
     *
     * @param key
     * @param value
     * @return
     */
    String add(String key, String value);
}
