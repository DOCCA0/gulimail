package com.wu.gulimall.gulimall_product;

import com.wu.gulimall.gulimall_product.entity.BrandEntity;
import com.wu.gulimall.gulimall_product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("huawei");
        brandService.save(brandEntity);
    }

}
