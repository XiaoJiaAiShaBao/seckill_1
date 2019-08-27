package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.Seckill;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 小青年
 * @date 2019/8/25 - 10:01
 */

/**
 * 配置spring和junit整合，Junit启动时加载springIOC容器
 * spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉Junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {

    //注入Dao实现类依赖
    @Resource
    private SeckillDao seckillDao;

    @Test
    public void testQueryById() {
        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println(seckill);
    }

    @Test
    public void testQueryAll() {
        /*
        Caused by: org.apache.ibatis.binding.BindingException: Parameter 'offset' not found. Available parameters are [0, 1, param1, param2]
         */
        //List<Seckill> queryAll(int offset, int limit);
        //Java没有保存形参的记录：queryAll(int offset, int limit) -> query(int arg0, int arg1)
        //解决办法法：当有多个参数时，mybatis提供了一个注解
        List<Seckill> seckills = seckillDao.queryAll(0, 100);
        for(Seckill seckill : seckills){
            System.out.println(seckill);
        }
    }

    @Test
    public void TestReduceNumber() {
        Date killTime = new Date();
        int updateCount = seckillDao.reduceNumber(1000L, killTime);
        System.out.println(updateCount);
    }
}