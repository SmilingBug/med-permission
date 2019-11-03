package com.med.yuntai.permission.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hos-permission
 * @description: 接口测试类
 * @author: yang Qiankun
 * @create: 2019-10-21 21:36
 **/
@RestController
@Api(tags = "hello测试接口",description = "提供测试用途")
public class HelloController {

    @GetMapping(value = "/hello")
    @ApiOperation("hello for test!")
    public Object hello() {
        return "hello yangqk!";
    }
}
