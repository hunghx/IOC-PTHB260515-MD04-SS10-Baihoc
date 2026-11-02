package ra.edu.orderservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    @KafkaListener(
            topics = "order-created",
            groupId = "order-service-group"
    )
    public void handleMessageAfterOrderCreated(String message){
        System.out.println("Consumer bắt đầu xử lý ....");
        System.out.println("Message nhận được từ Kafka : "+ message);
        System.out.println("Kết thúc xử lý !");
    }
}
