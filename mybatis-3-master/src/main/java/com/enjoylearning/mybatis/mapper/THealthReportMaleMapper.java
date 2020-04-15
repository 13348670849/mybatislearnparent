package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.THealthReportMale;
import java.util.List;

public interface THealthReportMaleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(THealthReportMale record);

    THealthReportMale selectByPrimaryKey(Integer id);

    List<THealthReportMale> selectAll();

    int updateByPrimaryKey(THealthReportMale record);
}