import com.example.spring.config.SpringConfig;
import com.example.spring.lab.USER;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zzhang4 on 2020/12/10
 */
public class SpringTest {
    @Test
    public void testCase1(){
        AnnotationConfigApplicationContext configApplicationContext  = new AnnotationConfigApplicationContext(SpringConfig.class);

        USER user = configApplicationContext.getBean(USER.class);
        System.out.println("USER: "+user);

        //UserConfig config = configApplicationContext.getBean(UserConfig.class);
		//System.out.println(config);

        configApplicationContext.close();
    }
}
