package com.wu.gulimall.gulimall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.gulimall.gulimall_common.common.utils.PageUtils;
import com.wu.gulimall.gulimall_product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author chenshun
 * @email 2947323341@qq.com
 * @date 2021-03-05 21:27:43
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

