package pl.akademiakodu.gifs.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.akademiakodu.gifs.model.Category;

import java.util.Collections;
import java.util.stream.Collectors;

@Component
public class CategorySimpleRepository implements CategoryRepository {


    @Override
    public Category getCategoryById(int id) {
        return Category.getCategories().stream().
                filter(Category->Category.getId()==id).
                collect(Collectors.toList()).get(0);
    }
}
