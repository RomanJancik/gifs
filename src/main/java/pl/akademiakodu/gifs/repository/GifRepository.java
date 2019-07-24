package pl.akademiakodu.gifs.repository;

import pl.akademiakodu.gifs.model.Gif;

import java.util.List;


public interface GifRepository {
    List<Gif>getGifs();
    List<Gif>getFavorites();
    List<Gif>getGifsByCategoryId(int id);
}
