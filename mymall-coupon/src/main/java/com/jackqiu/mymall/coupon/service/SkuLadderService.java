package com.jackqiu.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackqiu.common.utils.PageUtils;
import com.jackqiu.mymall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-24 08:12:45
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

