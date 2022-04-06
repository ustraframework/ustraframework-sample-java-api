package com.gsitm.ustra.java.sample.api.example;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExampleMapper {

    List<ExampleModel> selectAll(ExampleModel.Criteria criteria);
}
