package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.TUserRole;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserRoleMapper {
    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("userId") Integer userId);

    int insert(TUserRole record);

    List<TUserRole> selectAll();

    List<TUserRole> selectByUserId( @Param("userId")Integer userId);
}