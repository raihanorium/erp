package com.raihanorium.erp.service.services.mock;

import com.raihanorium.erp.service.model.Author;
import com.raihanorium.erp.service.services.AuthorService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raihan on 4/9/2016.
 */
public class AuthorServiceImpl implements AuthorService {
    @Override
    public Author get(long id) {
        Author author = new Author();
        author.setId(id);
        author.setName("Author " + id);
        return author;
    }

    @Override
    public List<Author> getAll(int limit, int offset) {
        List<Author> lstAuthors = new ArrayList<Author>();

        for (int i = 0; i < limit; i++) {
            Author author = new Author();
            long id = i + 1;
            author.setId(id);
            author.setName("Author " + id);
            lstAuthors.add(author);
        }

        return lstAuthors;
    }
}
