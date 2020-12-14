import com.example.spring.lab.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zzhang4 on 2020/12/12
 */
public class SpringTest2 {

    @Test
    public void testCase1(){
        ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = ctxt.getBean(User.class);
        user.setId(999);
        System.out.println(user);
        ctxt.close();
    }
}
