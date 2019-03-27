package com.strive.common.exception;

/**
 * @ClassName BaseException
 * @author Karl.Zhang
 * @Date: 2019/3/27 21:32
 * @Version 1.0
 * @Description 必须捕获的应用异常   --自定义异常父类
 */
public class BaseException extends Exception{

    public BaseException(Integer errorCode, String message) {
        super("错误码：" + errorCode + "; 错误信息：" + message);
    }
}
