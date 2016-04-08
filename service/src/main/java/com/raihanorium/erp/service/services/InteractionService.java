package com.raihanorium.erp.service.services;

import com.raihanorium.erp.service.model.Comment;

/**
 * Created by Raihan on 4/9/2016.
 */
public interface InteractionService {
    public int likeTutorial(long tutorialId, String ipAddress);
    public Comment comment(long tutorialId, Comment comment);
    public String tag(long tutorialId, String tag);
}
