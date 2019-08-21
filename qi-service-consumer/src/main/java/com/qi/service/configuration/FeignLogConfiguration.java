package com.qi.service.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：qixianchuan
 * @date ：Created in 2019-08-21 15:11
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Configuration
public class FeignLogConfiguration {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
