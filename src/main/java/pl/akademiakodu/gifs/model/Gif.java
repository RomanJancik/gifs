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

    public static List<Gif>getGifs(){
        List<Gif>gifs=new ArrayList<>();
        gifs.add(new Gif("android-explosion","programming",true));
        gifs.add(new Gif("ben-and-mike","bot",true));
        gifs.add(new Gif("book-dominos","bot",false));
        gifs.add(new Gif("compiler-bot","others",false));
        gifs.add(new Gif("cowboy-coder","programming",false));
        gifs.add(new Gif("infinite-andrew","other",true));
            return gifs;
    }

    public static List<Gif> getFavorites(){


        List<Gif> gifs = getGifs();
        gifs.removeIf(s->s.isFavorite==false);

        return gifs;
    }

}
