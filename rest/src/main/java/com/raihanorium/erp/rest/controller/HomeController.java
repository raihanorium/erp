package com.raihanorium.erp.rest.controller;

import com.raihanorium.erp.rest.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Raihan on 4/7/2016.
 */

@RestController
public class HomeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "hello";
    }
}
