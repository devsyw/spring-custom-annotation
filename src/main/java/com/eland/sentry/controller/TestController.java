package com.eland.sentry.controller;


import com.eland.sentry.anno.AnnoHowMuchTime;
import io.sentry.Sentry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
//    @AnnoHowMuchTime
    public String init() {
        return "init";
    }

    @GetMapping("/index")
    @AnnoHowMuchTime
    public String index() {
        return "index";
    }

    @GetMapping("/plus")
    @AnnoHowMuchTime
    public String plus() {
        int a = 1;
        while (a != 100000000) {
            a = a + 1;
        }
        return "plus";
    }

    @GetMapping("/minus")
    @AnnoHowMuchTime
    public String minus() {
        int a = 100;
        while (a != 0) {
            a = a - 1;
        }
        return "minus";
    }

}
