package pl.akademiakodu.gifs.model;

import java.util.ArrayList;
import java.util.List;


public class Gif {

    private String name;
    private  String category;
    private Boolean isFavorite;


    public Gif(String name, String category, Boolean isFavorite) {
        this.name = name;
        this.category = category;
        this.isFavorite = isFavorite;
    }

    public String getCategory() {
        return category;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public String getUrl(){
        return "gifs/"+name+".gif";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
