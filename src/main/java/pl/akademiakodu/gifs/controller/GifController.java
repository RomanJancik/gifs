package pl.akademiakodu.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.gifs.model.Gif;
import pl.akademiakodu.gifs.repository.GifRepository;


@Controller
public class GifController {

    /*
        Spring szuka klasy ,która implementuje interfejs GifRepository
        i jest dodatkowo componentem , beanem
     */

    @Autowired
    private GifRepository gifRepository;
        //gifRepository= new GifSimpleRepository()'

    @GetMapping("/")
    public String home (ModelMap map){

        map.put("gifs", gifRepository.getGifs());
        return "home";
    }

    @GetMapping("/favorites")
    public String favorite(ModelMap map){
        map.put("gifs",gifRepository.getFavorites());
        return "favorites";

    }





}

