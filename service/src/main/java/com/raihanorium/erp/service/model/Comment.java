package com.raihanorium.erp.service.model;

import java.util.Date;

/**
 * Created by Raihan on 4/9/2016.
 */
public class Comment {
    private long id;
    private long tutorialId;
    private Date publishedOn;
    private Author author;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTutorialId() {
        return tutorialId;
    }

    public void setTutorialId(long tutorialId) {
        this.tutorialId = tutorialId;
    }

    public Date getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(Date publishedOn) {
        this.publishedOn = publishedOn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
