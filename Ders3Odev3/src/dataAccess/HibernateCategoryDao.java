package dataAccess;

import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class HibernateCategoryDao implements CategoryDao{

    List<Category> categories = new ArrayList<Category>();
    @Override
    public void add(Category category) {
        categories.add(category);
        System.out.println("Kategoriler hibernate ile eklendi");
    }

    @Override
    public List<Category> getAll() {
        return this.categories;
    }
}
