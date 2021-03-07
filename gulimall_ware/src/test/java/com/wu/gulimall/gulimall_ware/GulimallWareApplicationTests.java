package com.wu.gulimall.gulimall_ware;

import com.wu.gulimall.gulimall_ware.entity.WareInfoEntity;
import com.wu.gulimall.gulimall_ware.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {
    @Autowired
    WareInfoService wareInfoService;
    @Test
    void contextLoads() {
        WareInfoEntity wareInfoEntity = new WareInfoEntity();
        wareInfoEntity.setAddress("四川");
        wareInfoService.save(wareInfoEntity);
    }

}
