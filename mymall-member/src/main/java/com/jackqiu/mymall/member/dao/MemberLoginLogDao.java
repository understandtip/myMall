package com.jackqiu.mymall.member.dao;

import com.jackqiu.mymall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author jackqiu
 * @email 3376600870@qq.com
 * @date 2023-07-24 10:09:43
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
