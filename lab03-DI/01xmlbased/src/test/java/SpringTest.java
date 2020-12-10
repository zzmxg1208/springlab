import com.example.spring.lab.User;
import com.example.spring.lab.User2;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zzhang4 on 2020/12/10
 */
public class SpringTest {
    @Test
    public void testCase1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("conf/beans.xml");
        Assert.assertNotNull("ctx shouldn't be null", ctx);
        User user = ctx.getBean(User.class);
        System.out.println(user);
        System.out.println();
        User2  user2 = (User2)ctx.getBean("user2_3.1");
        System.out.println(user2);
        ctx.close();
    }
}
