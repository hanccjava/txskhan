package com.hanoa.service.impl;

import com.hanoa.mapper.DeptMapper;
import com.hanoa.mapper.EmpMapper;
import com.hanoa.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by txsk on 2018/3/6.
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;
    @Resource
    private EmpMapper empMapper;
    @Override
    public Map<String, Object> getDeptList() {
        Map<String,Object> map = new HashMap<>();
        //查询所有部门信息
        map.put("allDepts",deptMapper.findAll());
        //查询部门领导信息
        map.put("allEmps",empMapper.findAllManager());
        return map;
    }
}
