package org.example;

import org.apache.ibatis.session.SqlSession;
import org.example.dao.UserMapper;
import org.example.pojo.User;
import org.example.utils.MybatisUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test01() {
        // 获取sqlSession
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 执行sql
        // 1. getMapper(推荐)
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey(1);
        System.out.println(user);

        // 2. selectOne
        User one = sqlSession.selectOne("org.example.dao.UserMapper" +
                ".selectByPrimaryKey", 1);
        System.out.println(one);

        sqlSession.close();
    }


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
