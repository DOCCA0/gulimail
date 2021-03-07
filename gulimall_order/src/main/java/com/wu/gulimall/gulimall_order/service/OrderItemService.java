package com.wu.gulimall.gulimall_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.gulimall.gulimall_common.common.utils.PageUtils;
import com.wu.gulimall.gulimall_order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author wucao
 * @email 2947323341@qq.com
 * @date 2021-03-07 21:29:53
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

