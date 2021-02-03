package com.luo;


import com.luo.entity.User;
import com.luo.mapper.UserMapper;
import com.luo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot1000ApplicationTests {



    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;



    @Test
    public void testInsert(){
        User user = new User();
        user.setName("luoshunhua");
        user.setAge(3);
        user.setEmail("111");


        userMapper.insert(user);




    }
}
