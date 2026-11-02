package ra.edu.orderservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ra.edu.orderservice.kafka.OrderProducer;

@SpringBootApplication
public class OrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(OrderProducer producer){
        return args -> {
            System.out.println("Order Service is running...");
            producer.sendOrderCreated();
        };
    }

}
