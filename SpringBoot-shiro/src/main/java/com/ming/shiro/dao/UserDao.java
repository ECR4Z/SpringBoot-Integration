package com.ming.shiro.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ming.shiro.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: UserDao
 * @Description: TODO
 * @Author: ECRZ
 * @Date: 2022/12/29
 */
@Mapper
@Repository
public interface UserDao extends BaseMapper<User> {
    @Select("SELECT * FROM user")
    List<User> queryAllUser();
}
