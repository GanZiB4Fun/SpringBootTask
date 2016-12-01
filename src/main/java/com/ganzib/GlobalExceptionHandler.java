package com.ganzib;

import com.ganzib.domian.ErrorInfo;
import com.ganzib.domian.MyException;
import com.sun.org.apache.bcel.internal.generic.MONITORENTER;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 统一异常处理
 * Created by GanZiB on 16/12/1.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public static final String DEFAULT_ERROR_VIEW = "error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception e) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception",e);
        modelAndView.addObject("url",request.getRequestURL());
        modelAndView.setViewName(DEFAULT_ERROR_VIEW);
        return modelAndView;
    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest request, MyException e)throws MyException{
        ErrorInfo<String> jsonErrorHandler = new ErrorInfo<>();
        jsonErrorHandler.setCode(404);
        jsonErrorHandler.setData("今天");
        jsonErrorHandler.setMessage(e.getMessage());
        jsonErrorHandler.setUrl(request.getRequestURI());
        return jsonErrorHandler;
    }

}
