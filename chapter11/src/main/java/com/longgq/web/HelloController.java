package com.longgq.web;

import org.springframework.web.bind.annotation.*;

/**
 * Created by clouder on 17-12-14.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name){
        return "hello " + name;
    }
}
