package com.lp.girl.controller;

import com.lp.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    /*@Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private int age;

    @Value("${content}")
    private String content;*/

    @Autowired
    private GirlProperties girlProperties;

    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String say(@RequestParam(value = "id", required = false,
            defaultValue ="0") int id){

        return "id :" + id;
        //return girlProperties.getCupSize();
    }
}
