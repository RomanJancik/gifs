package pl.akademiakodu.gifs.model;

import java.util.ArrayList;
import java.util.List;


public class Gif {

    private String name;
    private  int categoryId;
    private boolean favorite;


    public Gif(String name, int category, boolean isFavorite) {
        this.name = name;
        this.categoryId = category;
        this.favorite = isFavorite;
    }

    public Gif(String name, int category) {
        this.name = name;
        this.categoryId = category;
    }

    public int getCategory() {
        return categoryId;
    }

    public Boolean getfavorite() {
        return favorite;
    }

    public String getUrl(){
        return "/gifs/"+name+".gif";
    }

    public String getDetailsUrl(){return "/gif/"+name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
