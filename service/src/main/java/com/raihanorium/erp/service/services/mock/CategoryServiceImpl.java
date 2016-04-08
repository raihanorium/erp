package com.raihanorium.erp.service.services.mock;

import com.raihanorium.erp.service.model.Category;
import com.raihanorium.erp.service.services.CategoryService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Raihan on 4/9/2016.
 */
public class CategoryServiceImpl implements CategoryService {
    @Override
    public Category create(Category category) {
        return category;
    }

    @Override
    public Category get(long id) {
        Category category = new Category();
        category.setId(id);
        category.setName("Category " + category.getId());
        return category;
    }

    @Override
    public List<Category> getAll(int limit, int offset) {
        List<Category> lstCategories = new ArrayList<Category>();

        for (int i = 0; i < limit; i++) {
            Category Category = new Category();
            long id = i + 1;
            Category.setId(id);
            Category.setName("Category " + id);
            lstCategories.add(Category);
        }

        return lstCategories;
    }

    @Override
    public Category update(Category category) {
        category.setName(category.getName() + " " + new Date());
        return category;
    }

    @Override
    public Category delete(long id) {
        Category category = new Category();
        category.setId(id);
        category.setName("Category " + category.getId());
        return category;
    }
}
