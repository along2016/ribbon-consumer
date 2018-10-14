package com.example.ribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-customer", method = RequestMethod.GET)
    public String helloCustomer(){
        return restTemplate.getForEntity("http://hello-service/hello",
                String.class).getBody();
    }
}
