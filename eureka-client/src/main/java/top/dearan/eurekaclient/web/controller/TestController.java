package top.dearan.eurekaclient.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dingshuangen
 * @Date: 2018/11/22  14:45
 * @Description:
 */
@RestController
@RequestMapping("/eureka/test")
public class TestController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello(){
        return "hello boy ---port : "+port;
    }

}
