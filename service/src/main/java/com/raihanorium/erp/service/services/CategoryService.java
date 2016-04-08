package com.raihanorium.erp.service.services;

import com.raihanorium.erp.service.model.Category;

import java.util.List;

/**
 * Created by Raihan on 4/9/2016.
 */
public interface CategoryService {
    public Category create(Category category);

    public Category get(long id);
    public List<Category> getAll(int limit, int offset);

    public Category update(Category category);

    public Category delete(Category category);
}
