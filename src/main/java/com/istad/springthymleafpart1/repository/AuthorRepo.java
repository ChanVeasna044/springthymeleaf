package com.istad.springthymleafpart1.repository;

import com.istad.springthymleafpart1.model.Author;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepo {
  private   List<Author> authors = new ArrayList<>(){{
        add(new Author(1001,"valit","male","der lg"));
        add(new Author(1002,"Yuei","female","der lg"));
        add(new Author(1003,"GO","female","der lg"));
        add(new Author(1004,"Jo E","male","der lg"));
    }};


  public List<Author> getAllAuthors(){
      return authors;
  }
}
