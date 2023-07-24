package com.jackqiu.mymall.ware.dao;

import com.jackqiu.mymall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-24 10:25:43
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
