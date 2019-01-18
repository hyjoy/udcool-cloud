package com.udcool.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hyjoy on 2019-01-17.
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;


    public String sayHi(String message) {
        return restTemplate.getForObject("http://UDCOOL-SERVICE-ADMIN/hi?message=" + message, String.class);
    }
}
