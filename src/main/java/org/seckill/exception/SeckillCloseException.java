package org.seckill.exception;

/**
 * @author GaoMing
 * @date 2021/10/12 - 21:32
 * 秒杀关闭异常
 */
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
