package com.enjoylearning.mybatis.mapper;

import com.enjoylearning.mybatis.entity.THealthReportFemale;
import java.util.List;

public interface THealthReportFemaleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(THealthReportFemale record);

    THealthReportFemale selectByPrimaryKey(Integer id);

    List<THealthReportFemale> selectAll();

    int updateByPrimaryKey(THealthReportFemale record);
}