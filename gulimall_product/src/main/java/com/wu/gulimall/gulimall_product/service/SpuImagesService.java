package com.wu.gulimall.gulimall_product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.gulimall.gulimall_common.common.utils.PageUtils;
import com.wu.gulimall.gulimall_product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author chenshun
 * @email 2947323341@qq.com
 * @date 2021-03-05 21:27:41
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

