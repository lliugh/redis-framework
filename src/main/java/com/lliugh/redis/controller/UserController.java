package com.lliugh.redis.controller;

import com.lliugh.redis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lliugh & guohaoliu@gmail.com & http://github.com/lliugh
 * @(#)UsersController.java 1.0 23/11/2015
 * <p/>
 * 用户信息缓存
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService userService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Object getUser(@PathVariable("id") long id) {
        String user = userService.find(id);
        return DataEvent.wrap("user", user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public Object insertUser(@PathVariable("id") long id, @RequestBody String user) {
        System.out.println("here");
        if (userService.insertUser(id, user) != null) {
            return DataEvent.wrap("message", "保存成功");
        }
        return DataEvent.wrap("message", "保存失败");
    }
}
