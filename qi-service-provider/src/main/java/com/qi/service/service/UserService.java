package com.qi.service.service;

import com.qi.service.mapper.UserMapper;
import com.qi.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-21 10:20
 * @description：UserService
 * @modified By：
 * @version: $version$
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
