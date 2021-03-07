package com.wu.gulimall.gulimall_order;

import com.wu.gulimall.gulimall_order.entity.OrderEntity;
import com.wu.gulimall.gulimall_order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallOrderApplicationTests {
    @Autowired
    OrderService orderService;
    @Test
    void contextLoads() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setBillType(1);
        orderService.save(orderEntity);
    }

}
