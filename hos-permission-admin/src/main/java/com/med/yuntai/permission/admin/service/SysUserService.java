package com.med.yuntai.permission.admin.service;

import com.med.yuntai.permission.admin.model.SysUser;
import com.med.yuntai.permission.core.service.CurdService;

import java.util.List;

/**
 * @program: hos-permission
 * @description: 用户信息
 * @author: yang Qiankun
 * @create: 2019-10-23 22:48
 **/
public interface SysUserService extends CurdService<SysUser> {

    List<SysUser> findAll();
}
