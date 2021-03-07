package com.wu.gulimall.gulimall_order.dao;

import com.wu.gulimall.gulimall_order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wucao
 * @email 2947323341@qq.com
 * @date 2021-03-07 21:29:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
