package com.hc.test;

/**
 * @Auther: yingliming
 * @Date: 2022/7/30 0030 - 07 - 30 - 14:02
 * @Description: com.hc.test
 * @Version: 1.0
 **/

import com.hc.dao.UserMapper;
import com.hc.pojo.User;
import com.hc.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * 开始调用Mybatis框架
 *
 *
 */

public class UserTest {

    Logger logger= Logger.getLogger(UserTest.class);

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
    logger.debug("result======>"+rs);
}


@Test
    public  void  TestUserDao02(){

        SqlSessionFactory sqlSessionFactory02 = MybatisUtil.getInstance().sqlSessionFactory;
        SqlSession sqlSession = sqlSessionFactory02.openSession();
        int rs = sqlSession.selectOne("com.hc.dao.UserMapper.selectUserCount");
        System.out.println(rs);
        sqlSession.close();
    }

    @Test
    public  void  TestUserDao03(){

        SqlSessionFactory sqlSessionFactory03 = MybatisUtil.getInstance().sqlSessionFactory;
        SqlSession sqlSession = sqlSessionFactory03.openSession();
        int rs = sqlSession.getMapper(UserMapper.class).selectUserCount();
        System.out.println(rs);
        sqlSession.close();
    }



    @Test
    public  void  TestUserDao04(){

        SqlSessionFactory sqlSessionFactory04 = MybatisUtil.getInstance().sqlSessionFactory;
        SqlSession sqlSession = sqlSessionFactory04.openSession();
        List<User> rs = sqlSession.getMapper(UserMapper.class).selectUserList();
        for (User user:rs) {
            System.out.println(user);
        }

        sqlSession.close();
    }

@Test
    public  void  TestUserDao05(){

        SqlSessionFactory sqlSessionFactory05 = MybatisUtil.getInstance().sqlSessionFactory;
        SqlSession sqlSession = sqlSessionFactory05.openSession();
        List<User> rs = sqlSession.getMapper(UserMapper.class).selectUserByName("孙");
    for (User user:rs) {
        System.out.println(user.toString());
    }

        sqlSession.close();
    }




}
