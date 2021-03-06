package com.example.test;


import com.example.test.bean.UserBean;
import com.example.test.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DbProjApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        UserBean userBean = userService.loginIn("zian","123456");
        System.out.println("该用户ID为：");
        System.out.println(userBean.getId());
    }

}
