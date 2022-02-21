package org.seckill.exception;

/**
 * @author GaoMing
 * @date 2021/10/12 - 21:34
 * 秒杀业务相关异常
 */
public class SeckillException extends RuntimeException{
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
