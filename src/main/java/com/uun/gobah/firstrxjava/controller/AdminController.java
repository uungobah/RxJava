package com.uun.gobah.firstrxjava.controller;


import com.uun.gobah.firstrxjava.service.AdminService;
import com.uun.gobah.firstrxjava.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Month;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    SearchService searchService;

    @GetMapping("/test")
    public void costForMonth(){
        LocalDate now = LocalDate.now();
        System.out.println("cost for month : " + adminService.costForMonth(2019, now.getMonth()).subscribe(System.out::println));
    }

    @GetMapping("/print")
    public void print(){
        searchService.printAllDocs();
    }

    @GetMapping("/printFilter")
    public void printFilter(){
        searchService.printFilter();
    }
}
