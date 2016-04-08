package com.raihanorium.erp.service.model;

import java.util.List;

/**
 * Created by Raihan on 4/9/2016.
 */
public class Category {
    private long id;
    private String name;
    private Category parent;
    private List<Category> children;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }
}
