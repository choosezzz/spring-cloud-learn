package top.dearan.serviceribbon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import top.dearan.serviceribbon.service.HelloService;

/**
 * @Author: dingshuangen
 * @Date: 2018/11/23  9:50
 * @Description:
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String helloClient() {
        return restTemplate.getForObject("http://EUREKA-CLIENT/eureka/test/hello",String.class);
    }
}

