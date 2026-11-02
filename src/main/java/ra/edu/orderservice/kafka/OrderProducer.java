package ra.edu.orderservice.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendOrderCreated() {
        UUID  orderId = UUID.randomUUID();
        kafkaTemplate.send("order-created", orderId.toString(), "Đã tạo đơn hàng thành công với id = "+ orderId.toString());
        System.out.println("Tiếp tục thực hiện tác vụ tiếp theo");
    }

}
