package com.raihanorium.erp.service.services;

import com.raihanorium.erp.service.model.Author;

import java.util.List;

/**
 * Created by Raihan on 4/9/2016.
 */
public interface AuthorService {
    public Author get(long id);
    public List<Author> getAll(int limit, int offset);
}
