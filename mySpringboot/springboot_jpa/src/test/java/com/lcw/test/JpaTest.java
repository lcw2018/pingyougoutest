package com.lcw.test;

import com.lcw.SpringbootJpaApplication;
import com.lcw.dao.UserRepostitory;
import com.lcw.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Create by chuanwen.li on 2019/4/12
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class JpaTest {
    @Autowired
    UserRepostitory userRepostitory;

    @Test
    public void findAll() {

        List<User> users = userRepostitory.findAll();
        System.out.println(users);


    }

}
