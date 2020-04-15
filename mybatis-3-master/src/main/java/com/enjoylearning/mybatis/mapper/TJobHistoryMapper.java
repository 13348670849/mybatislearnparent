package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.TJobHistory;
import java.util.List;

public interface TJobHistoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TJobHistory record);

    TJobHistory selectByPrimaryKey(Integer id);

    List<TJobHistory> selectAll();

    int updateByPrimaryKey(TJobHistory record);
}