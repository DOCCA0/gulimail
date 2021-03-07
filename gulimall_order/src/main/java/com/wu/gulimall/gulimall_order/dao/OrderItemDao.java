package com.wu.gulimall.gulimall_order.dao;

import com.wu.gulimall.gulimall_order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wucao
 * @email 2947323341@qq.com
 * @date 2021-03-07 21:29:53
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
