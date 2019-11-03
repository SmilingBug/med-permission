package com.med.yuntai.permission.admin.service;

import com.med.yuntai.permission.admin.model.SysDict;
import com.med.yuntai.permission.core.service.CurdService;

import java.util.List;

/**
 * @program: med-permission
 * @description: SysDictService
 * @author: yang Qiankun
 * @create: 2019-11-02 23:18
 **/
public interface SysDictService extends CurdService<SysDict> {

    List<SysDict> findByLabel(String label);
}
