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
        gifs.add(new Gif("android-explosion","programming",false));
        gifs.add(new Gif("ben-and-mike","bot",false));
        gifs.add(new Gif("book-dominos","bot",false));
        gifs.add(new Gif("compiler-bot","others",false));
        gifs.add(new Gif("cowboy-coder","programming",false));
        gifs.add(new Gif("borat","others",true));
        gifs.add(new Gif("dogs","others",true));
        gifs.add(new Gif("dogsmile","others",true));
        gifs.add(new Gif("shaq","others",true));
        gifs.add(new Gif("tenor","others",true));
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
