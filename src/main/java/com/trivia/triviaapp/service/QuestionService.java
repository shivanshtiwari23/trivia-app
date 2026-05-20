package com.trivia.triviaapp.service;
import com.trivia.triviaapp.model.Category;
import com.trivia.triviaapp.model.Question;
import com.trivia.triviaapp.repository.CategoryRepository;
import com.trivia.triviaapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionService {
    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    CategoryRepository categoryRepository;

    public List<Question> getQuestionsByCategory(int categoryId) {

        Category category = categoryRepository.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        List<Question> questions = questionRepository.findByCategory(category);
        return questions;
    }
}