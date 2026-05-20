package com.trivia.triviaapp.repository;

import com.trivia.triviaapp.model.Category;
import com.trivia.triviaapp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(Category category);
}