import com.example.spring.config.SpringConfig;
import com.example.spring.config.UserConfigX;
import com.example.spring.lab.USER;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zzhang4 on 2020/12/15
 */
public class UserConfigTest {
    @Test
    public void testCase(){
        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(UserConfigX.class);
        UserConfigX userConfig11 = ctxt.getBean(UserConfigX.class);
        System.out.println(userConfig11);

        USER user = ctxt.getBean(USER.class);
        System.out.println("USER--X: "+user);
        ctxt.close();
    }
}
