package org.seckill.exception;

/**
 * @author 小青年
 * @date 2019/8/25 - 11:44
 */

/**
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
