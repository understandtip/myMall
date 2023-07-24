package com.jackqiu.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackqiu.common.utils.PageUtils;
import com.jackqiu.mymall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-23 19:45:44
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

