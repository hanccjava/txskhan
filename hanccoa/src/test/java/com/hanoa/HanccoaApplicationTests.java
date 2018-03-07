package com.hanoa;

import com.hanoa.dao.vo.Depts;
import com.hanoa.dao.vo.Emp;
import com.hanoa.mapper.DeptMapper;
import com.hanoa.mapper.EmpMapper;
import com.hanoa.mapper.UserMapper;
import com.hanoa.service.DeptService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HanccoaApplicationTests {
    public final static Logger LOGGER = Logger.getLogger(HanccoaApplicationTests.class);

    @Resource
    private UserMapper userMapper;
    @Resource
    private DeptMapper deptMapper;
    @Resource
    private EmpMapper empMapper;
    @Resource
    private DeptService deptService;


    @Test
    public void contextLoads() {
    }


    @Test
    public void findByNameTest() {
        //  String id = UUID.randomUUID().toString();
        String id = "8";
        String name = "推广部";
        String age = "2";
    //   userMapper.insertUser(id, name, age);
//        User user = userMapper.findByName(name);
//        System.out.println(user.toString());
        Depts depts = new Depts();
        depts.setId(UUID.randomUUID().toString());
        depts.setName(name);
        depts.setLeaderId("03");
        deptMapper.insert(depts);
        System.out.println(depts.getId());
//        LOGGER.info(user);
      //  userMapper.deleteUser(id);
    }
    @Test
    public void findDeptAndEmp(){
//        List<Depts> list = deptMapper.findAll();
//        System.out.println(list);
      //  List<Emp> list1 = empMapper.findAllManager();
        Map<String, Object> map = deptService.getDeptList();
        List<Emp> list1 = (List<Emp>) map.get("allEmps");
        System.out.println(list1);
//
    }
}
