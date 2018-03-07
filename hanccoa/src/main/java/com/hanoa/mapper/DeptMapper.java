package com.hanoa.mapper;

import com.hanoa.dao.vo.Depts;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by txsk on 2018/2/22.
 */
@org.apache.ibatis.annotations.Mapper
public interface DeptMapper extends Mapper<Depts> {
    /**
     * 查询所有部门信息
     * @return
     */
    @Select("SELECT id,name,leaderId FROM dept")
    List<Depts> findAll();

}
