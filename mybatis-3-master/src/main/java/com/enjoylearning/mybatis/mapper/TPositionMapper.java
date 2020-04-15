package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.TPosition;
import java.util.List;

public interface TPositionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TPosition record);

    TPosition selectByPrimaryKey(Integer id);

    List<TPosition> selectAll();

    int updateByPrimaryKey(TPosition record);
}