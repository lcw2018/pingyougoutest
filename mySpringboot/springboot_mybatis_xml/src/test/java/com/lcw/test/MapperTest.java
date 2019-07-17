package com.lcw.test;

import com.lcw.SpringbootMybatisXmlApplication;
import com.lcw.dao.UserMapper;
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


@RunWith(SpringRunner.class) //SpringRunner继承自SpringJUnit4ClassRunner，使用哪一个Spring提供的测试引擎都可以
//public final class SpringRunner extends SpringJUnit4ClassRunner
@SpringBootTest(classes = SpringbootMybatisXmlApplication.class)
//@SpringBootTest的属性指定的是引导类的字节码对象
public class MapperTest {


    @Autowired
    UserMapper userMapper;

    @Test
    public void findAllUser() {

        List<User> users = userMapper.findAllUser();
        System.out.println(users);
       //[User{id=1, username='zhangsan', password='123', name='张三'}, User{id=2, username='lisi', password='123', name='李四'}]
    }


}
