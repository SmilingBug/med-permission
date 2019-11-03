package com.med.yuntai.permission.admin.service.impl;

import com.med.yuntai.permission.admin.dao.SysDictMapper;
import com.med.yuntai.permission.admin.model.SysDict;
import com.med.yuntai.permission.admin.service.SysDictService;
import com.med.yuntai.permission.core.page.MybatisPageHelper;
import com.med.yuntai.permission.core.page.PageRequest;
import com.med.yuntai.permission.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: med-permission
 * @description: SysDictServiceImpl
 * @author: yang Qiankun
 * @create: 2019-11-02 23:20
 **/
public class SysDictServiceImpl implements SysDictService {
    
    @Autowired
    private SysDictMapper sysDictMapper;
    
    @Override
    public List<SysDict> findByLabel(String label) {
        return sysDictMapper.findByLable(label);
    }

    @Override
    public int save(SysDict record) {
        if (record.getId() == null || record.getId() == 0) {
            return sysDictMapper.insertSelective(record);
        }
        return sysDictMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int delete(SysDict record) {
        return sysDictMapper.deleteByPrimaryKey(record.getId());
    }

    @Override
    public int delete(List<SysDict> records) {
        for (SysDict record : records) {
            delete(record);
        }
        return 1;
    }

    @Override
    public SysDict findById(Long id) {
        return sysDictMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        Object label = pageRequest.getParam("label");
        if (label != null) {
            return MybatisPageHelper.findPage(pageRequest,sysDictMapper,"findPageByLabel",label);
        }
        return MybatisPageHelper.findPage(pageRequest,sysDictMapper);
    }
}
