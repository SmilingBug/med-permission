package com.med.yuntai.permission.admin.service;

import com.med.yuntai.permission.admin.model.SysUser;
import com.med.yuntai.permission.core.page.PageRequest;
import com.med.yuntai.permission.core.service.CurdService;

import java.io.File;
import java.util.List;

/**
 * @program: hos-permission
 * @description: 用户信息
 * @author: yang Qiankun
 * @create: 2019-10-23 22:48
 **/
public interface SysUserService extends CurdService<SysUser> {

    List<SysUser> findAll();

    /**
     * 生成用户信息Excel文件
     * @param pageRequest 要导出的分页查询参数
     * @return
     */
    File createUserExcelFile(PageRequest pageRequest);
}
