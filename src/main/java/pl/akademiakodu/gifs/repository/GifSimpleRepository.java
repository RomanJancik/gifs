package pl.akademiakodu.gifs.repository;


import org.springframework.stereotype.Component;
import pl.akademiakodu.gifs.model.Gif;

import java.util.ArrayList;
import java.util.List;
@Component
public class GifSimpleRepository implements GifRepository {
    @Override
    public List<Gif> getGifs() {


        List<Gif>gifs=new ArrayList<>();
        gifs.add(new Gif("android-explosion","programming",true));
        gifs.add(new Gif("ben-and-mike","bot",true));
        gifs.add(new Gif("book-dominos","bot",false));
        gifs.add(new Gif("compiler-bot","others",false));
        gifs.add(new Gif("cowboy-coder","programming",false));
        gifs.add(new Gif("infinite-andrew","other",true));
        return gifs;
    }

    @Override
    public List<Gif> getFavorites() {
        List<Gif> gifs = getGifs();
        gifs.removeIf(s->s.getFavorite()==false);
        return gifs;
    }



    @Override
    public List<Gif> getCategory(String category) {
        List<Gif>gifs=getGifs();
        gifs.removeIf(s->s.getCategory().equals(category));
        return gifs;
    }
}
