package com.hanoa.mapper;

import com.hanoa.dao.vo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * Created by txsk on 2018/1/19.
 */
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user(id,name,age) VALUES(#{id},#{name},#{age})")
    int insertUser(@Param("id") String id,@Param("name") String name,@Param("age") String age);

    @Select("SELECT * FROM user WHERE name = #{name}")
    User findByName(@Param("name") String name);

    @Delete("DELETE FROM user WHERE id = #{id}")
    int deleteUser(@Param("id") String id);

    @Update("UPDATE user SET name = #{name},age = #{age} WHERE name = #{name}")
    User updateUser(@Param("name") String name,@Param("age") String age);



}
