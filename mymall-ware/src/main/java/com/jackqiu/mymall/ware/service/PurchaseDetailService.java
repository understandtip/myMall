package com.jackqiu.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackqiu.common.utils.PageUtils;
import com.jackqiu.mymall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-24 10:25:43
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

