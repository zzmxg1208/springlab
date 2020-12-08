import com.example.spring.lab.Account;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by zzhang4 on 2020/12/8
 */
public class SpringTest {
    @Test
    public void testCase(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        assertNotNull("spring container should not be null", ctx);
        //By using Spring framework, it is no need to create the bean with the 'new' operator.
        Account account = ctx.getBean(Account.class);
        System.out.println(account);
        ctx.close();
    }

}
