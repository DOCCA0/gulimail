package com.wu.gulimall.gulimall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.gulimall.gulimall_common.common.utils.PageUtils;
import com.wu.gulimall.gulimall_product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author chenshun
 * @email 2947323341@qq.com
 * @date 2021-03-05 21:27:42
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

