package com.qi.service.client;

import com.qi.service.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-21 14:48
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@FeignClient(value = "service-provider") // 标注该类是一个feign接口
public interface UserClient {
    @GetMapping("user/{id}")
    User queryById(@PathVariable("id") Long id);
}
