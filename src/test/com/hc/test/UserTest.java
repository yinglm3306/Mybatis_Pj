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
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * ¿ªÊ¼µ÷ÓÃMybatis¿ò¼Ü
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
        List<User> rs = sqlSession.getMapper(UserMapper.class).selectUserByName("Å·Ñô");
    for (User user:rs) {
        System.out.println(user.toString());
    }

        sqlSession.close();
    }


    @Test
    public  void  TestUserDao06(){

        SqlSessionFactory sqlSessionFactory06 = MybatisUtil.getInstance().sqlSessionFactory;
        SqlSession sqlSession = sqlSessionFactory06.openSession();
        User u = new User();
        u.setUserRole(1L);
        u.setUser_name("Ëï");
        List<User> rs = sqlSession.getMapper(UserMapper.class).selectUserByNameRole(u);
        for (User user:rs) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }


    @Test
    public  void  TestUserDao07(){

        SqlSessionFactory sqlSessionFactory07 = MybatisUtil.getInstance().sqlSessionFactory;
        SqlSession sqlSession = sqlSessionFactory07.openSession();


        List<User> rs = sqlSession.getMapper(UserMapper.class).selectUserByNameRole2("Ëï",1l);
        for (User user:rs) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }

    @Test
    public  void  TestUserDao08(){

        SqlSessionFactory sqlSessionFactory08 = MybatisUtil.getInstance().sqlSessionFactory;
        SqlSession sqlSession = sqlSessionFactory08.openSession();

        HashMap map = new HashMap();
        map.put("user_name","Ëï");
        map.put("userRole",1);
        List<User> rs = sqlSession.getMapper(UserMapper.class).selectUserByNameRole3(map);
        for (User user:rs) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }

    @Test
    public  void  TestUserDao09(){

        SqlSessionFactory sqlSessionFactory09 = MybatisUtil.getInstance().sqlSessionFactory;
        SqlSession sqlSession = sqlSessionFactory09.openSession();


        List<User> rs = sqlSession.getMapper(UserMapper.class).selectUserByNameRole4("Ëï",1l);
        for (User user:rs) {
            System.out.println(user.toString());
        }

        sqlSession.close();
    }




}
