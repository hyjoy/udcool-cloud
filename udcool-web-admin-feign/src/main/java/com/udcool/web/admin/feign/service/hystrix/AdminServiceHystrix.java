package com.udcool.web.admin.feign.service.hystrix;

import com.udcool.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * Created by hyjoy on 2019-01-18.
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
