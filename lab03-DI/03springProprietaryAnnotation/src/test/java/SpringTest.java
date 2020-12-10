import com.example.spring.lab.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zzhang4 on 2020/12/10
 */
public class SpringTest {
    @Test
    public void testCase1(){
        ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext("bean.xml");

        User user = (User)ctxt.getBean("user2.3.1");
        System.out.println(user);
        ctxt.close();
    }
}
