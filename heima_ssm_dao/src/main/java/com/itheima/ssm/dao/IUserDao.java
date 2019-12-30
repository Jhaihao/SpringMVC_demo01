package com.itheima.ssm.dao;

import com.itheima.ssm.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IUserDao {

    @Select("select * from users where user_name=#{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "user_name"),
            @Result(property = "email", column = "email"),
            @Result(property = "password", column = "password"),
            @Result(property = "phoneNum", column = "phoneNum"),
            @Result(property = "status", column = "status"),
            @Result(property = "roles", column = "id", javaType = java.util.List.class, many = @Many(select = "com.itheima.ssm.dao.IRoleDao.findRoleByUserId"))
    })
    public UserInfo findByUsername(String username) throws Exception;


    /*
    column 数据库字段名
    property 实体类属性类名.

     */

    @Select("select * from users")
    @Results({
            @Result(property = "username", column = "user_name"),
    })
    List<UserInfo> findAll() throws Exception;

    @Insert("insert into users(email,user_name,password,phoneNum,status) values(#{email},#{username},#{password},#{phoneNum},#{status})")
    void save(UserInfo userInfo);


}
