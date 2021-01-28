package com.wander.securitydemo01.mapper;

import com.wander.securitydemo01.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户mapper
 *
 * @author admin 2021/01/27/ 17:52
 */
@Mapper
public interface UserMapper {

    /**
     * 添加User
     * @param user user对象
     */
    @Insert("insert into user (name, password) values (#{name}, #{password})")
    void insertUser(User user);

    /**
     * 通过name查询user
     * @param name 名字
     * @return user对象
     */
    @Select("select name, password from user where name = #{name}")
    User selectUserByName(@Param("name") String name);
}
