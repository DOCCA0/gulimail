package com.wu.gulimall.gulimall_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.gulimall.gulimall_common.common.utils.PageUtils;
import com.wu.gulimall.gulimall_ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author wucao
 * @email 2947323341@qq.com
 * @date 2021-03-07 21:47:40
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

