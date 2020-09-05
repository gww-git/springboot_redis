package com.sz.demo;

import com.sz.demo.config.conf.RedisClientTemplate;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private RedisClientTemplate redisClientTemplate;

    //集群
    @Test
    public void test1(){
        System.out.println(redisClientTemplate.getRedis("name"));
    }


    public void test2(){
        Jedis jedis=new Jedis("192.168.182.130",7001);
        System.out.println(jedis.get("name"));
    }

}
