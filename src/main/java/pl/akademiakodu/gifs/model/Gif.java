package pl.akademiakodu.gifs.model;

import java.util.ArrayList;
import java.util.List;


public class Gif {

    private String name;
    private  int categoryId;
    private Boolean isFavorite;


    public Gif(String name, int category, Boolean isFavorite) {
        this.name = name;
        this.categoryId = category;
        this.isFavorite = isFavorite;
    }

    public Gif(String name, int category) {
        this.name = name;
        this.categoryId = category;
    }

    public int getCategory() {
        return categoryId;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public String getUrl(){
        return "/gifs/"+name+".gif";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
