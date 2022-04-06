package com.gsitm.ustra.java.sample.api.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExampleService {

    @Autowired private ExampleMapper exampleMapper;

    public List<ExampleModel> getAll(ExampleModel.Criteria criteria) {
        return this.exampleMapper.selectAll(criteria);
    }
}
