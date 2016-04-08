package com.raihanorium.erp.rest.controller;

import com.raihanorium.erp.rest.model.Config;
import com.raihanorium.erp.service.model.Category;
import com.raihanorium.erp.service.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raihan on 4/9/2016.
 */

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Category createCategory(@RequestBody Category category) {
        return categoryService.create(category);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Category getCategory(@PathVariable long id) {
        return categoryService.get(id);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Category> getAllCategory() {
        return categoryService.getAll(Config.DEFAULT_PAGE_SIZE, 0);
    }

    @RequestMapping(value = "/page/{page}", method = RequestMethod.GET)
    public List<Category> getAllCategory(@PathVariable int page) {
        List<Category> allCategories = new ArrayList<Category>();

        if (page == 0 || page == 1) {
            allCategories = categoryService.getAll(Config.DEFAULT_PAGE_SIZE, 0);
        } else {
            allCategories = categoryService.getAll(Config.DEFAULT_PAGE_SIZE, (page * Config.DEFAULT_PAGE_SIZE));
        }
        return allCategories;
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public Category updateCategory(@RequestBody Category category) {
        return categoryService.update(category);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Category deleteCategory(@PathVariable long id) {
        return categoryService.delete(id);
    }
}
