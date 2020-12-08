import com.example.spring.lab.Account;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zzhang4 on 2020/12/8
 */
public class SpringTest {
    @Test
    public void testCase1(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Account account = (Account)ctx.getBean("account");
        System.out.println(account);
        ctx.close();
    }
}
