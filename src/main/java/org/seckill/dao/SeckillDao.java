package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author GaoMing
 * @date 2021/10/9 - 20:16
 *
 */
public interface SeckillDao {
    // 减库存
    // @return 如果影响行数>1, 表示更新的记录行数
    int reduceNumber( @Param("killTime") Date killTime, @Param("seckillId") Long seckillId);

    // 根据ID查询秒杀对象
    Seckill queryById(long seckillId);

    // 根据偏移量查询秒杀商品列表
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    // 使用存储过程执行秒杀
    void killByProcedure(Map<String, Object> paramMap);
}
