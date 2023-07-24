package com.jackqiu.mymall.coupon.dao;

import com.jackqiu.mymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-24 08:12:45
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
