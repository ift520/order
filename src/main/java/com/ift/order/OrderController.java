package com.ift.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liufei
 * @since 2019-10-12 16:19
 */
@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/order")
    public String order() {
        return restTemplate.getForObject("http://127.0.0.1:8000/member", String.class);
    }
}
