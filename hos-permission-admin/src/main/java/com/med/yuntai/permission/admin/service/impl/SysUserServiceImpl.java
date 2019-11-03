package com.med.yuntai.permission.admin.service.impl;

import com.med.yuntai.permission.admin.dao.SysUserMapper;
import com.med.yuntai.permission.admin.model.SysUser;
import com.med.yuntai.permission.admin.service.SysUserService;
import com.med.yuntai.permission.core.page.MybatisPageHelper;
import com.med.yuntai.permission.core.page.PageRequest;
import com.med.yuntai.permission.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: hos-permission
 * @description: 用户信息实现类
 * @author: yang Qiankun
 * @create: 2019-10-23 22:51
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }

    @Override
    public int save(SysUser record) {
        return 0;
    }

    @Override
    public int delete(SysUser record) {
        return 0;
    }

    @Override
    public int delete(List<SysUser> records) {
        return 0;
    }

    @Override
    public SysUser findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest,sysUserMapper);
    }
}
