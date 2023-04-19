package com.istad.springthymleafpart1.model.request;

import com.istad.springthymleafpart1.model.Author;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleRequest {

    private String title;
    private String description;
    private String imgUrl;


    private int authorId;
}
