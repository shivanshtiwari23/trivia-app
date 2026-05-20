package com.trivia.triviaapp.controller;

import com.trivia.triviaapp.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.trivia.triviaapp.model.Score;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/scores")
public class ScoreController {
@Autowired
    private ScoreService scoreService;
@PostMapping
    public Score saveScore(@RequestBody Score score){
    return scoreService.saveScore(score);
}
}
