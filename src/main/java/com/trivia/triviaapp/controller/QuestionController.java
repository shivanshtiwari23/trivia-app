package com.trivia.triviaapp.controller;

import com.trivia.triviaapp.model.Category;
import com.trivia.triviaapp.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.trivia.triviaapp.service.QuestionService;
import com.trivia.triviaapp.model.Question;
import java.util.List;

@RestController
@RequestMapping ("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;
    @GetMapping
    public List<Question> getQuestionByCategory(@RequestParam int categoryId) {
        return questionService.getQuestionsByCategory(categoryId);
    }
}
