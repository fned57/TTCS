package com.tiemvacxin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "asdsd";
    }
}