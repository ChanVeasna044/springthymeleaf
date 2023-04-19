package com.istad.springthymleafpart1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private  int id;
    private String title;
    private String description;
    private String imgUrl;


    private Author author;

}
