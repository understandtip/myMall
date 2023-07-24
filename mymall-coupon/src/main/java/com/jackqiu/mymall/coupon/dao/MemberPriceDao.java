package com.jackqiu.mymall.coupon.dao;

import com.jackqiu.mymall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-24 08:12:45
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
