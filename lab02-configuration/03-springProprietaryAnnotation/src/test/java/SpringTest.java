import com.example.spring.lab.Account;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Created by zzhang4 on 2020/12/8
 */
public class SpringTest {
    @Test
    public void testCase1(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext  = new ClassPathXmlApplicationContext("bean.xml");
        assertNotNull("spring container should not be null", classPathXmlApplicationContext);
        Account account = classPathXmlApplicationContext.getBean("account2.3",Account.class);
        System.out.println(account);
        classPathXmlApplicationContext.close();
    }
}
