package pl.akademiakodu.gifs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.gifs.model.Gif;

@Controller

public class GifController {

    @GetMapping("/")
    public String home (ModelMap map){

        map.put("gifs", Gif.getGifs());
        return "home";
    }

    @GetMapping("/favorites")
    public String favorite(ModelMap map){
        map.put("gifs",Gif.getFavorites());
        return "favorites";

    }

    }

