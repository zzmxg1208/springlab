import com.example.spring.lab.Account;
import com.example.spring.lab.SpringConfi;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zzhang4 on 2020/12/14
 */
public class Test {
    @org.junit.Test
    public void testCase(){
        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(SpringConfi.class);

        Account account = (Account) ctxt.getBean("acct5.1");
        account.setId(999);
        Account account2 = (Account) ctxt.getBean("acct5.1");
        System.out.println(account);
        System.out.println(account2);
        ctxt.close();
    }
}
