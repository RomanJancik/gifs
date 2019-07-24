package pl.akademiakodu.gifs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String home (@RequestParam(required = false) String q, ModelMap map){
        if(q==null){
        map.put("gifs", gifRepository.getGifs());
        }else {
            map.put("gifs",gifRepository.findByName(q));
        }
        return "home";
    }

    @GetMapping("/favorites")
    public String favorite(ModelMap map){
        map.put("gifs",gifRepository.getFavorites());
        return "favorites";

    }


    @GetMapping("/gif/{name}")
    public String getGif (@PathVariable String name, ModelMap map){
        map.put("gif",gifRepository.findByName(name));
        System.out.println("result"+gifRepository.findByName(name).getName());
        return "gif-details";
    }


}

