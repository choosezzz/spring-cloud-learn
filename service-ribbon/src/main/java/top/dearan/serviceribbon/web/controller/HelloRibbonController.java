package top.dearan.serviceribbon.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.dearan.serviceribbon.service.HelloService;

/**
 * @Author: dingshuangen
 * @Date: 2018/11/23  9:53
 * @Description:
 */
@RestController
@RequestMapping("/ribbon")
public class HelloRibbonController {

    @Autowired
    private HelloService helloService;
    @RequestMapping("/hello")
    public String helloRibbon(){
        return helloService.helloClient();
    }
}
