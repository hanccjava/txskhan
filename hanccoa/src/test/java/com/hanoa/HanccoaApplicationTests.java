package com.hanoa;

import com.hanoa.mapper.UserMapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HanccoaApplicationTests {
    public final static Logger LOGGER = Logger.getLogger(HanccoaApplicationTests.class);

    @Resource
    private UserMapper userMapper;


    @Test
    public void contextLoads() {
    }

    @Test
    public void findByNameTest() {
      //  String id = UUID.randomUUID().toString();
        String id = "XXXX";
        String name = "XXXX";
        String age = "XXXX";
//        userMapper.insertUser(id, name, age);
//        User user = userMapper.findByName(name);

//        LOGGER.info(user);
        userMapper.deleteUser(id);
        userMapper.updateUser(name,age);


    }
}
