package com.jackqiu.mymall.product.dao;

import com.jackqiu.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-23 19:45:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
