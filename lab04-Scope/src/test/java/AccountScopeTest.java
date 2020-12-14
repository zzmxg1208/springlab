import com.example.spring.lab.Account1;
import com.example.spring.lab.Account2;
import com.example.spring.lab.Account3;
import com.example.spring.lab.AccountConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zzhang4 on 2020/12/14
 */
public class AccountScopeTest {
    @Test
    public void TestScope(){
        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(AccountConfig.class);
        Account1 account1_1 = ctxt.getBean(Account1.class);
        Account1 account1_2 = ctxt.getBean(Account1.class);
        System.out.println(account1_1);
        System.out.println(account1_2);

        Account2 account2_1 = ctxt.getBean(Account2.class);
        Account2 account2_2 = ctxt.getBean(Account2.class);
        System.out.println(account2_1);
        System.out.println(account2_2);

        Account3 account3_1 = ctxt.getBean(Account3.class);
        Account3 account3_2 = ctxt.getBean(Account3.class);
        System.out.println(account3_1);
        System.out.println(account3_2);

        ctxt.close();
    }
}
