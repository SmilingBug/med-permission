package com.med.yuntai.permission.admin.controller;

import com.med.yuntai.permission.admin.service.SysUserService;
import com.med.yuntai.permission.core.http.HttpResult;
import com.med.yuntai.permission.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: hos-permission
 * @description: SysUserController
 * @author: yang Qiankun
 * @create: 2019-10-23 22:54
 **/
@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/findAll")
    public Object findAll() {
        return sysUserService.findAll();
    }

    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysUserService.findPage(pageRequest));
    }
}
