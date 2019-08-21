package com.qi.service.controller;

import com.qi.service.pojo.User;
import com.qi.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-21 10:21
 * @description：UserController
 * @modified By：
 * @version: $version$
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id) {
        User user = this.userService.queryById(id);
        return user;
    }
}
