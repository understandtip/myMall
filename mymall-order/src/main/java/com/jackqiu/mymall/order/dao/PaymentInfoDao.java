package com.jackqiu.mymall.order.dao;

import com.jackqiu.mymall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-24 10:19:54
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
