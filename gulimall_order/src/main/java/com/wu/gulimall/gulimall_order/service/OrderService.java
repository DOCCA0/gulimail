package com.wu.gulimall.gulimall_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.gulimall.gulimall_common.common.utils.PageUtils;
import com.wu.gulimall.gulimall_order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author wucao
 * @email 2947323341@qq.com
 * @date 2021-03-07 21:29:54
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

