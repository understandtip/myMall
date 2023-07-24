package com.jackqiu.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackqiu.common.utils.PageUtils;
import com.jackqiu.mymall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-24 08:12:45
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
