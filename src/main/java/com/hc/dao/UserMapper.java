package com.hc.dao;

import com.hc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: yingliming
 * @Date: 2022/7/30 0030 - 07 - 30 - 13:43
 * @Description: com.hc.dao
 * @Version: 1.0
 **/
public interface UserMapper {
    public  int selectUserCount();

    public List<User> selectUserList();

    /**
     * 根据用户名查询信息列表
     * @param userName
     * @return
     */
    public List<User> selectUserByName(String userName);


    /**
     * 对象入参
     * @param user
     * @param
     * @return
     */
    public List<User> selectUserByNameRole(User user);

    /**
     *  注解入参
     * @param user_name
     * @param userRole
     * @return
     */
    public List<User> selectUserByNameRole2(@Param("user_name") String user_name, @Param("userRole") Long userRole);

    /**
     * 对象入参
     * @param map
     * @param
     * @return
     */
    public List<User> selectUserByNameRole3(Map map);


    /**
     *  注解入参
     * @param user_name
     * @param userRole
     * @return
     */
    public List<User> selectUserByNameRole4(@Param("user_name") String user_name, @Param("userRole") Long userRole);





}
