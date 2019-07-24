package pl.akademiakodu.gifs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.gifs.model.Category;
import pl.akademiakodu.gifs.repository.CategoryRepository;
import pl.akademiakodu.gifs.repository.GifRepository;

@Controller
public class CategoryController {

    @GetMapping("/categories")
    public String index(ModelMap map) {
        map.put("categories", Category.getCategories());
        return "categories";
    }

    @Autowired
    private GifRepository gifRepository;
    @Autowired
    private CategoryRepository categoryRepository;


    @GetMapping("/category/{id}")
    public String show(@PathVariable Integer id, ModelMap map) {
        map.put("gifs", gifRepository.getGifsByCategoryId(id));
        map.put("category",categoryRepository.getCategoryById(id));
        return "category";
    }


}
