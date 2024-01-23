package com.SpringBoot.learnspringboot.controller;

import com.SpringBoot.learnspringboot.CurrencyServiceConfig;
import com.SpringBoot.learnspringboot.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Currency;
import java.util.List;

@RestController
public class CurrencyConfigController {

    @Autowired
    private CurrencyServiceConfig currencyServiceConfig;

    @RequestMapping("/currency-config")
    public CurrencyServiceConfig retrieveAllCourses() {
        return currencyServiceConfig;
    }

}
