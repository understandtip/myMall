package com.jackqiu.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackqiu.common.utils.PageUtils;
import com.jackqiu.mymall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-23 19:45:44
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

