package org.seckill.exception;

/**
 * @author 小青年
 * @date 2019/8/25 - 11:48
 */

/**
 * 秒杀相关业务异常
 */
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
