package com.raihanorium.erp.service.services;

import com.raihanorium.erp.service.model.Tutorial;

import java.util.List;

/**
 * Created by Raihan on 4/9/2016.
 */
public interface TutorialService {
    public Tutorial create(Tutorial Tutorial);

    public Tutorial get(long id);
    public List<Tutorial> getAll(int limit, int offset);
    public List<Tutorial> getByCategoryId(long categoryId, int limit);
    public List<Tutorial> getByTag(String tag, int limit);
    public List<Tutorial> getPopularByCategory(long categoryId, int limit);

    public Tutorial update(Tutorial Tutorial);

    public Tutorial delete(Tutorial Tutorial);
}
