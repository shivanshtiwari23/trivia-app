package com.trivia.triviaapp.service;

import com.trivia.triviaapp.model.Score;
import com.trivia.triviaapp.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;
    public Score saveScore(Score score) {
        return scoreRepository.save(score);
    }
}
