package com.lliugh.redis.service;

/**
 * @author lliugh & guohaoliu@gmail.com & http://github.com/lliugh
 * @(#)IUserService.java 1.0 07/12/2015
 */

public interface UserService {
    String find(Long id);
    String insertUser(Long Uid,String user) ;
//    int updateUser(Long Uid,String user) ;
//    int deleteUser(Long id) ;
}
