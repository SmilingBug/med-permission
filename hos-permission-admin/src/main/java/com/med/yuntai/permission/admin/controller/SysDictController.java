package com.med.yuntai.permission.admin.controller;

import com.med.yuntai.permission.admin.model.SysDict;
import com.med.yuntai.permission.admin.service.SysDictService;
import com.med.yuntai.permission.core.http.HttpResult;
import com.med.yuntai.permission.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: med-permission
 * @description: SysDictController
 * @author: yang Qiankun
 * @create: 2019-11-03 10:57
 **/
@RestController
@RequestMapping("dict")
public class SysDictController {

    @Autowired
    private SysDictService sysDictService;

    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody SysDict sysDict) {
        return HttpResult.ok(sysDictService.save(sysDict));
    }


    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysDict> sysDicts) {
        return HttpResult.ok(sysDictService.delete(sysDicts));
    }


    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysDictService.findPage(pageRequest));
    }


    @GetMapping(value = "/findByLabel")
    public HttpResult findByLabel(@RequestParam String label) {
        return HttpResult.ok(sysDictService.findByLabel(label));
    }
}
