package testmybatis;


import com.fd.rookie.entity.User;
import com.fd.rookie.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
    @Resource
    private UserService userService;
    @Test
    public void test1(){
        User user = userService.getUserById(27);
        System.out.println(user.getUserName());
    }

    /**
     * 测试批量插入
     */
    @Test
    public void testAddBatch(){
        List<User> users = new ArrayList<User>();
        for (int var1 = 1; var1 < 3; var1++){
            User user = new User();
            user.setUserName("test" + var1);
            user.setPassword("qwe");
            user.setAge(10 + var1);
            users.add(user);
        }
        int key = userService.addUserBatch(users);
//        System.out.println("key = " + key);
    }

    /**
     * 测试批量更新
     */
    @Test
    public void testupdateBatch(){
        List<User> users = new ArrayList<User>();
        for (int var1 = 1; var1 < 5; var1++){
            User user = new User();
            user.setId(10 + var1);
            user.setUserName("update" + var1);
            user.setPassword("asdhjkasd");
            user.setAge(25 + var1);
            users.add(user);
        }
        userService.updateUserBatch(users);
    }
}
