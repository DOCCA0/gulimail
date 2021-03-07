package com.wu.gulimall.gulimall_ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.gulimall.gulimall_common.common.utils.PageUtils;
import com.wu.gulimall.gulimall_ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author wucao
 * @email 2947323341@qq.com
 * @date 2021-03-07 21:47:41
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

