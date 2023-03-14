package com.hmdp.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 朱焕杰
 * @version 1.0
 * @date 2023/1/15 16:21
 */
@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        //配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://43.138.17.148:6379").setPassword("123456");
        //创建RedissonClient对象
        return Redisson.create(config);
    }
}
