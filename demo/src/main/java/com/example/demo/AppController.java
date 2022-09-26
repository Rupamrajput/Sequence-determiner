package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RequestMapping
@RestController
public class AppController {

    @Autowired
    AppService appService;

    @GetMapping("/")
    public String home(){
        return "welcome";
    }

    @PostMapping("/arithmetic")
    public BigDecimal arithmetic(@RequestParam("param") BigDecimal[] param){
        return appService.arithmetic(param);
    }

    @PostMapping("/geometric")
    public BigDecimal geometric(@RequestParam("param") BigDecimal[] param){
        return appService.geometric(param);
    }

}
