package com.hc.test;

/**
 * @Auther: yingliming
 * @Date: 2022/7/30 0030 - 07 - 30 - 14:02
 * @Description: com.hc.test
 * @Version: 1.0
 **/

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * 开始调用Mybatis框架
 *
 *
 */

public class UserTest {

@Test
public  void  TestUserDao(){
    String resource = "Mybatis-config.xml";
    InputStream inputStream = null;
    try {
        inputStream = Resources.getResourceAsStream(resource);
    } catch (IOException e) {
        e.printStackTrace();
    }
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();
    int rs = sqlSession.selectOne("com.hc.dao.UserMapper.selectUserCount");
    System.out.println(rs);


}


}
