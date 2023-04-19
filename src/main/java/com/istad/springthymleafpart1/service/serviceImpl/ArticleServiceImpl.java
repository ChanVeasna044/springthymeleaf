package com.istad.springthymleafpart1.service.serviceImpl;

import com.istad.springthymleafpart1.model.Article;
import com.istad.springthymleafpart1.repository.ArticleRepo;
import com.istad.springthymleafpart1.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {

    ArticleRepo articleRepo;
    ArticleServiceImpl(){
        articleRepo = new ArticleRepo();
    }
    @Override
    public List<Article> getAllArticle() {
        return articleRepo.getAllArticles();
    }


    @Override
    public Article getArticleById(int id) {
        return articleRepo.getArticleById(id);
    }

    @Override
    public void addNewArticle(Article article) {
        articleRepo.addNewArticle(article);
    }
}
