package com.hc.dao;

import com.hc.pojo.User;

import java.util.List;

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


}
