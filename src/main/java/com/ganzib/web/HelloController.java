package com.ganzib.web;

import com.ganzib.domian.MyException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GanZiB on 16/12/1.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() throws Exception{
        throw new Exception("系统错误");
//        return "hello world";
    }

    @RequestMapping("json")
    public String json() throws MyException{
        throw new MyException("自定义异常");
    }


}
