package com.chitnis.quizapp.controller;
import com.chitnis.quizapp.model.Quiz;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable; //

import com.chitnis.quizapp.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;


    // as we have created question object in Question.java and we want a list of questions saved in our databas
    @GetMapping("allQuestions")
    public ResponseEntity<List<Quiz.Question>> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    //now here we want a list of all the question based on it's category but we don't want to hard code it so we are keeping it in curlybraces
    @GetMapping("category/{category}")
    public List<Quiz.Question> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    //Now here we want to add the questions manually

    @PostMapping("add")
    public String addQuestion(@RequestBody Quiz.Question question) {
        return questionService.addQueston(question);
    }


}
