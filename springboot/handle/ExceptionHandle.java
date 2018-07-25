package com.lp.girl.handle;

import com.lp.girl.exception.GirlException;
import com.lp.girl.entity.Result;
import com.lp.girl.utils.ResultUtil;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class ExceptionHandle {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else {
            logger.error("[系统异常] {}", e);
            return ResultUtil.error(-1,"未知错误");
        }

    }
}
