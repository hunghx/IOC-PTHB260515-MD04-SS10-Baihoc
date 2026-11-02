package ra.edu.orderservice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.edu.orderservice.kafka.OrderProducer;

@RestController
//@RefreshScope
@RequiredArgsConstructor
public class TestApi {
//    @Value("${app.username:abc}")
//    private String username;
//
    private final OrderProducer orderProducer;
    @GetMapping("/info")
    public String info() {
        orderProducer.sendOrderCreated();
        return "Hello World";
    }

}
