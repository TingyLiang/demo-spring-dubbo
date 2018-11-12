package pri.robin.demospingdubbo.provider;

import org.springframework.stereotype.Component;

@Component
public class CustomerService implements Service {
    @Override
    public String onReceive(String content) {
        System.out.println("message: " + content);
        return content;
    }
}
