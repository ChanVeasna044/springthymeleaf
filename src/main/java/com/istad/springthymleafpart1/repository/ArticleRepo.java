package com.istad.springthymleafpart1.repository;

import com.istad.springthymleafpart1.model.Article;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ArticleRepo {
    private List<Article> articleList= new ArrayList<>(){{
        add(new Article(1001,"ChaGPT","new evolution of promt programming","https://www.destinationperth.com.au/sites/default/files/styles/card/public/2017-10/Quokka.jpg?itok=58eOwxWT",new AuthorRepo().getAllAuthors().get(0)));
        add(new Article(1002,"Sport","make us healthy","https://www.cbc.ca/kids/images/wild_and_wonderful_asian_animals_header_1140.jpg",new AuthorRepo().getAllAuthors().get(3)));
        add(new Article(1003,"Java","Java programming is about about oop","https://www.cbc.ca/kids/images/wild_and_wonderful_asian_animals_header_1140.jpg",new AuthorRepo().getAllAuthors().get(2)));
    }};
public List<Article> getAllArticles(){
    return articleList;
}
public Article getArticleById(int id ){
    return articleList.stream().filter(e->e.getId()==id).findFirst().orElse(null);
}
public void addNewArticle(Article article){
    articleList.add(article);
}
}
