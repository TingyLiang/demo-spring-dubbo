package pri.robin.demospingdubbo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pri.robin.demospingdubbo.provider.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProviderApp.class)
@ImportResource({"classpath:dubbo.xml"})
public class DemoSpingDubboApplicationTests {
    @Autowired
    CustomerService service;

    @Test
    public void contextLoads() {

    }

    /**
     * 这里是远程调用的测试，
     * "compute-service:onReceive" 是应用方的服务名+方法
     */
    @Test
    public void testRreceive() {
        Assert.assertEquals("compute-service:onReceive", "message from comsumer", service.onReceive("message from comsumer"));
    }

}
