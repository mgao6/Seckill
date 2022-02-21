package org.seckill.exception;

/**
 * @author GaoMing
 * @date 2021/10/12 - 21:30
 * 重复秒杀异常（运行期异常）
 */
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
