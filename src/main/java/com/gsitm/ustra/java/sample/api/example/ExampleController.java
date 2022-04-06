package com.gsitm.ustra.java.sample.api.example;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("U.STRA Examples for API")
@RestController
@RequestMapping("/api/example")
public class ExampleController {

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/common/code")
    @ApiOperation(value = "전체 코드 목록 조회", notes = "<strong>코드 전체 목록</string>을 반환")
    public List<ExampleModel> getAll(@ApiParam("사용 여부") String useYn) {

        ExampleModel.Criteria criteria = new ExampleModel.Criteria();
        criteria.setUseYn(useYn);

        return this.exampleService.getAll(criteria);
    }
}
