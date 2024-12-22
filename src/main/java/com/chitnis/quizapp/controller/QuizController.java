package com.chitnis.quizapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz")
public class QuizController {

    //now here we want to this url "http://localhost:8080/quiz/create?category=Java&noOfQuestions=5" work
    @Autowired
    QuizService quizService;

    //as we mentioned quiz above now we want it for "create"
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String question, @RequestParam int numQ, @RequestParam String title) {
        return quizService.;
    }

}
