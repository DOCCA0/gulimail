package com.wu.gulimall.gulimall_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.gulimall.gulimall_common.common.utils.PageUtils;
import com.wu.gulimall.gulimall_ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wucao
 * @email 2947323341@qq.com
 * @date 2021-03-07 21:47:41
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

