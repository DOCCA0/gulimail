package com.wu.gulimall.gulimall_coupon;

import com.wu.gulimall.gulimall_coupon.controller.CouponController;
import com.wu.gulimall.gulimall_coupon.entity.CouponEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Autowired
    CouponController couponController;
    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponType(1);
        couponController.save(couponEntity);
    }

}
