import com.example.spring.lab.TravelService;
import com.example.spring.lab.TravelServiceConfig;
import com.example.spring.lab.domain.Account;
import com.example.spring.lab.domain.Product;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zzhang4 on 2020/12/13
 */
public class TravelSericeTest {
    @Test
    public void testCase1(){
        AnnotationConfigApplicationContext ctxt = new AnnotationConfigApplicationContext(TravelServiceConfig.class);
        TravelService travelService = ctxt.getBean(TravelService.class);
        travelService.makeATrip();

        Account Account = ctxt.getBean(Account.class);
        System.out.println(Account);
        ctxt.close();
    }
}
