package com.istad.springthymleafpart1.service;

import com.istad.springthymleafpart1.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticle();

    Article getArticleById(int id);

    void addNewArticle(Article article);
}
