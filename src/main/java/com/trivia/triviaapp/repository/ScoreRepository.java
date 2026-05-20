package com.trivia.triviaapp.repository;

import com.trivia.triviaapp.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
}