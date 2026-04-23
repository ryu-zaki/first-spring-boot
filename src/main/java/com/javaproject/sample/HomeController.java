package com.javaproject.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() {
      String name = getViewName();
      return name;
    }

    private String getViewName() {
        return "index";
    }

}
