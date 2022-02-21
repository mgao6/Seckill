package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * @author GaoMing
 * @date 2021/10/9 - 20:20
 */
public interface SuccessKilledDao {

    // 插入购买明细，可过滤重复
    // @return 插入的行数
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    // 根据ID查询SuccessKilled并携带秒杀产品对象实体
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
