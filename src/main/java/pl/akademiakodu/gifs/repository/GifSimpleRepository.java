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
        gifs.add(new Gif("android-explosion",1,true));
        gifs.add(new Gif("ben-and-mike",2,true));
        gifs.add(new Gif("book-dominos",1,false));
        gifs.add(new Gif("compiler-bot",2,false));
        gifs.add(new Gif("cowboy-coder",3,false));
        gifs.add(new Gif("infinite-andrew",3,true));
        gifs.add(new Gif("borat",3,true));
        gifs.add(new Gif("dogs",3,true));
        gifs.add(new Gif("dogsmile",3,true));
        gifs.add(new Gif("shaq",3,true));
        gifs.add(new Gif("tenor",3,true));
        return gifs;
    }

    @Override
    public List<Gif> getFavorites() {
        List<Gif> gifs = getGifs();
        gifs.removeIf(s->s.getFavorite()==false);
        return gifs;
    }

    @Override
    public List<Gif> getGifsByCategoryId(int id) {
        List<Gif>gifs=getGifs();
        gifs.removeIf(s->s.getCategory()!=id);
        return gifs;
    }



}
