package com.hanoa.mapper;

import com.hanoa.dao.vo.Emp;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by txsk on 2018/3/2.
 */
@org.apache.ibatis.annotations.Mapper
public interface EmpMapper extends Mapper<Emp> {
    /**
     * 查询出所有部门领导信息
     * @return 领导信息
     */
    @Select("SELECT id,dept_Id,name FROM emp WHERE id IN(SELECT leaderId FROM dept)")
    List<Emp> findAllManager();

}