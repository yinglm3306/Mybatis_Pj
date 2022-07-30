package com.hc.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Auther: yingliming
 * @Date: 2022/7/30 0030 - 07 - 30 - 17:28
 * @Description: com.hc.util
 * @Version: 1.0
 **/
public class MybatisUtil {

    public static SqlSessionFactory sqlSessionFactory=null;

    private  MybatisUtil (){
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


    }

    private static class MybatisUtilHolder  {

        private static final MybatisUtil INSTANCE = new MybatisUtil();

    }

    public static MybatisUtil getInstance(){
        return MybatisUtilHolder.INSTANCE;
    }


}
