package org.seckill.exception;

/**
 * @author 小青年
 * @date 2019/8/25 - 11:47
 */
/**
 * 秒杀关闭异常
 */
public class SeckillCloseException extends SeckillException {


    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
