package pl.akademiakodu.gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class GifController {
    int num=0;
    @GetMapping("/")
    public String home (){
        return "home";
    }
}
