package com.jackqiu.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jackqiu.common.utils.PageUtils;
import com.jackqiu.mymall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-24 10:09:43
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

