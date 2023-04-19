package com.istad.springthymleafpart1.service.serviceImpl;

import com.istad.springthymleafpart1.model.Author;
import com.istad.springthymleafpart1.repository.AuthorRepo;
import com.istad.springthymleafpart1.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorSeviceImpl implements AuthorService {
    private AuthorRepo authorRepo;
    AuthorSeviceImpl(){
        authorRepo = new AuthorRepo();
    }
    @Override
    public List<Author> getAllAuthor() {
        return authorRepo.getAllAuthors();
    }
}
