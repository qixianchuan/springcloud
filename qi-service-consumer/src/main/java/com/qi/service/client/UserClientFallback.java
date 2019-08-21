package com.qi.service.client;

import com.qi.service.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-21 14:54
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Component
public class UserClientFallback implements UserClient {

    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setUsername("服务器繁忙，请稍后再试！");
        return user;
    }
}
