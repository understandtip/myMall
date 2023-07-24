package com.jackqiu.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackqiu.common.utils.PageUtils;
import com.jackqiu.mymall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-24 10:09:43
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

