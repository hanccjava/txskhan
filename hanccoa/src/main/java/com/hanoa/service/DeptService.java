package com.hanoa.service;

import java.util.Map;

/**
 * Created by txsk on 2018/3/6.
 */
public interface DeptService {
    /**
     * 列出全部的部门完整信息
     * @return 返回的集合包含有如下数据：
     * 1、key = allDepts、value = 所有的部门信息集合
     * 2、key = allEmps、value = 所有部门领导集合
     */
    public Map<String,Object> getDeptList();
}
