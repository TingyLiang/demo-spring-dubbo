package pri.robin.demospingdubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
// 此处不需要重复加载配置文件,
//@ImportResource({"classpath:dubbo.xml"})
/**
 * 同一个spring-boot 应用既可以作为provider，也可以作为consumer，因此不需要对duboo进行重复配置
 */
public class ProviderApp {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ProviderApp.class, args);
    }

    @Bean
    public CountDownLatch closeLatch() {
        return new CountDownLatch(1);
    }
}
