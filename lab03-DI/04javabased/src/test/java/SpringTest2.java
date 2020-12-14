import com.example.spring.config.SpringConfig2;
import com.example.spring.lab.USER;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zzhang4 on 2020/12/12
 */
public class SpringTest2 {
    @Test
    public void testCase1(){
        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(SpringConfig2.class);
        USER user  = ctxt.getBean(USER.class);
        user.setId(199);
        System.out.println(user);
        ctxt.close();
    }
}
