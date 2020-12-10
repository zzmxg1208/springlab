import com.exmaple.spring.lab.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zzhang4 on 2020/12/10
 */
public class SpringTest {
    @Test
    public void testCase(){
        ClassPathXmlApplicationContext ctxt = new ClassPathXmlApplicationContext("beam.xml");

        User user = ctxt.getBean(User.class);
        System.out.println(user);
        ctxt.close();
    }
}
