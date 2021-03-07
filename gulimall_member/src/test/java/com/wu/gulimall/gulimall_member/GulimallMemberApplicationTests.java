package com.wu.gulimall.gulimall_member;

import com.wu.gulimall.gulimall_member.entity.UmsMemberEntity;
import com.wu.gulimall.gulimall_member.service.UmsMemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    UmsMemberService umsMemberService;
    @Test
    void contextLoads() {
        UmsMemberEntity umsMemberEntity = new UmsMemberEntity();
        umsMemberEntity.setCity("北京");
        umsMemberService.save(umsMemberEntity);
    }

}
