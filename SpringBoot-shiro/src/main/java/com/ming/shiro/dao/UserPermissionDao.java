package com.ming.shiro.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ming.shiro.pojo.UserPermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserPermissionDao extends BaseMapper<UserPermission> {
}
