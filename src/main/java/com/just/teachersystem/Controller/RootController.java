package com.just.teachersystem.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/online/root")
public class RootController {
    @PostMapping("/ad")
    public String register(){
        return "111";

    }
}
