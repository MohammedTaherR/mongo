package com.example.mongo;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {


    @Autowired
    public BookRepository bookRepository;
    
    @PostMapping("/")
    public String add(@RequestBody model m){
        bookRepository.save(m);
        return "Add"+m.getId();
    }

@GetMapping("/find")
public List<model> get(){
    return bookRepository.findAll();
}
}
