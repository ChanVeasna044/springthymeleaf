package com.istad.springthymleafpart1.controller;

import com.istad.springthymleafpart1.model.Article;
import com.istad.springthymleafpart1.model.request.ArticleRequest;
import com.istad.springthymleafpart1.service.ArticleService;
import com.istad.springthymleafpart1.service.AuthorService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Comparator;
import java.util.stream.Collectors;


@Controller




public class ArticleController {

    ArticleService articleService;
    AuthorService authorService;
    //constructor
@Autowired
    public ArticleController(ArticleService articleService, AuthorService authorService) {
        this.articleService = articleService;
        this.authorService = authorService;
    }



    @GetMapping("/all-article")
    public String getAllArticle(Model model){
        model.addAttribute("allArticle",articleService.getAllArticle());


        return "all-article";
    }
    @GetMapping("/course/{id}")
    public String viewCoursedetail(@PathVariable int id,Model model) {
        model.addAttribute("article",articleService.getArticleById(id));
        System.out.println("here is "+id);

        return "viewArticle"; // Return the view name
    }

    @GetMapping("/form-add")
    String getFormAdd(Model model){
        model.addAttribute("article",new ArticleRequest());
        model.addAttribute("author",authorService.getAllAuthor());


        return "new-article";
    }
    @PostMapping("/handleAddArticle")
    public String hadleAddarticle(@ModelAttribute("article") Article article){
        System.out.println("value is the value of article"+article);
       Article newArticle = new Article();
       newArticle.setTitle(article.getTitle());
       newArticle.setDescription(article.getDescription());
       newArticle.setImgUrl(article.getImgUrl());
        newArticle.setAuthor(authorService.getAllAuthor().stream().filter(e -> e.getId() == article.getId())
                .findFirst().orElse(null));

        // id , author
        // stream find max article (by ID )
        newArticle.setId(articleService.getAllArticle().stream().max(Comparator.comparingInt(Article::getId)).stream().toList().get(0).getId()+1);

       articleService.addNewArticle(newArticle);
        return "redirect:/all-article";
    }




}
