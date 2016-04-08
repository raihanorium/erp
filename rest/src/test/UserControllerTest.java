import com.raihanorium.erp.rest.model.User;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Raihan on 4/8/2016.
 */
public class UserControllerTest {
    @Test
    public void getUserTest(){
        RestTemplate template = new RestTemplate();
        User user = template.getForObject("http://localhost:8080/rest/user/1", User.class);
        System.out.println(user);
    }
}
