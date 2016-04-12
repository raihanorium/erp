package com.raihanorium.erp.service.services.mock;

import com.raihanorium.erp.service.model.Category;
import com.raihanorium.erp.service.services.CategoryService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raihan on 4/9/2016.
 */
public class CategoryServiceImpl implements CategoryService {
    private List<Category> categoryDb = new ArrayList<Category>();

    public CategoryServiceImpl() {
        for (int i = 0; i < 110; i++) {
            Category Category = new Category();
            long id = i + 1;
            Category.setId(id);
            Category.setName("Category " + id);
            categoryDb.add(Category);
        }
    }

    @Override
    public Category create(Category category) {
        categoryDb.add(category);
        return category;
    }

    @Override
    public Category get(long id) {
        for (Category c : categoryDb) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    @Override
    public List<Category> getAll(int limit, int offset) {
        List<Category> lstCategories = new ArrayList<Category>();

        for (int i = offset; i < (offset + limit); i++) {
            lstCategories.add(categoryDb.get(i));
        }

        return lstCategories;
    }

    @Override
    public long getTotal() {
        return categoryDb.size();
    }

    @Override
    public Category update(Category category) {
        Category catInDB = categoryDb.get((int) category.getId());
        catInDB.setName(category.getName());
        categoryDb.set((int) catInDB.getId() - 1, catInDB);
        return category;
    }

    @Override
    public Category delete(long id) {
        Category c = categoryDb.get((int) id);
        categoryDb.remove(id);
        return c;
    }
}
