import com.wyx.pojo.User;
import com.wyx.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) //启动Spring容器
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml",
        "classpath:applicationContext_service.xml"})
public class MyTest {

    @Autowired
    UserService userService;

    @Test
    public void testSelectUserPage(){
        List<User> list = userService.selectUserPage(null,"男",0);
        list.forEach(user -> System.out.println(user));
    }

    @Test
    public void testCreateUser(){
        int count = userService.createUser(new User("15968162087363012","身份证","112344198709094532","上官飞燕","男","25","不便分类的其他从业人员"));
        System.out.println(count);
    }

    @Test
    public void testDeleteUserById(){
        int count = userService.deleteUserById("15968162087363012");
        System.out.println(count);
    }

    @Test
    public void testGetRowCount(){
        int count = userService.getRowCount(null,null);
        System.out.println(count);
    }
}
