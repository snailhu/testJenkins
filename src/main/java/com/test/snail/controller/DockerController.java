package com.test.snail.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Snail on 2018/7/10.
 */
@RestController
public class DockerController {

    @RequestMapping("/test")
    public String index() {
        return "Hello Docker!1234adsfdffa8898989";
    }
}
