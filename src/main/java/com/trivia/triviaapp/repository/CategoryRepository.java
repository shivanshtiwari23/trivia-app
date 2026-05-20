package com.trivia.triviaapp.repository;

import com.trivia.triviaapp.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}