import com.example.spring.lab.Account;
import com.example.spring.lab.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by zzhang4 on 2020/12/10
 */
public class SpringTest {

    @Test
    public void testCase1(){
        //with this, it can even work without any xml configuration, ...
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        assertNotNull("spring container should not be null", ctx);
        Account account = ctx.getBean(Account.class);
        System.out.println(account);
        ctx.close();
    }
}
