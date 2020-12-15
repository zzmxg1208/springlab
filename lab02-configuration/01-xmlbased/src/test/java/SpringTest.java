import com.example.spring.lab.Account;
import com.example.spring.lab.ClientService;
import com.example.spring.lab.ClientService2;
import com.sun.security.ntlm.Client;
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
        Account account1 =(Account) ctx.getBean("acct01.1");//use the alias bean name
        account1.setName("Leo");
        System.out.println(account1);

        ClientService clientService = ctx.getBean(ClientService.class);
        System.out.println(clientService);

        ClientService2 clientService1 = (ClientService2)ctx.getBean("clientService2");
        System.out.println(clientService1);
        ctx.close();
    }

}
