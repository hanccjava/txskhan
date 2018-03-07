package com.hanoa.controller;

import com.hanoa.dao.vo.Emp;
import com.hanoa.service.DeptService;
import com.hanoa.util.JsonResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by hpy on 2018/3/6.
 */
@RestController
@RequestMapping(value = "dept")
public class DeptController {
    @Resource
    private DeptService deptService;

    /**
     * 查询所有部门信息和部门领导姓名
     *
     * @return 查询结果
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public JsonResponse selectAllDepts() {
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> mapService = deptService.getDeptList();
        map.put("allDepts",mapService.get("allDepts"));
        List<Emp> list = (List<Emp>) mapService.get("allEmps");
        Map<String,String> empMap = new HashMap<>();
        //迭代输出每个部门领导信息
        Iterator<Emp> iterator = list.iterator();
        while (iterator.hasNext()){
            Emp emp = iterator.next();
            empMap.put(emp.getId(),emp.getName());
        }
        map.put("allEmps",empMap);
        return new JsonResponse<>().createSuccess(map);
    }
}

