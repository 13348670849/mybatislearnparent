package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.TUser;
import java.util.List;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUser record);

    TUser selectByPrimaryKey(Integer id);

    List<TUser> selectAll();

    int updateByPrimaryKey(TUser record);

    List<TUser> selectPosition();

    List<TUser> selectUserPosition();

}