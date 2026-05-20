package com.trivia.triviaapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.trivia.triviaapp.service.CategoryService;
import com.trivia.triviaapp.model.Category;
import java.util.*;

@RestController
@RequestMapping("/categories")

public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
}
