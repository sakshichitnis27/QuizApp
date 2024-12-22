package com.chitnis.quizapp.service;

import com.chitnis.quizapp.dao.QuestionDao;
import com.chitnis.quizapp.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;


    @GetMapping("/question/allQuestions")
//here this java class will fetch data from DAO layer
//    public List<Question> getAllQuestions(){
//        return questionDao.findAll();
//    }

    public ResponseEntity<List<Quiz.Question>> getAllQuestions(){
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST );
    }

//    @GetMapping("/question/allQuestions")
//    public List<Question> getAllData() {
//        List<Question> data = questionDao.findAll();
//
//        // Print data to console to check if it is fetched correctly
//        System.out.println("Fetched data: " + data);
//
//        return data;
//    }

//    @PostConstruct
//    public void testDatabaseFetch() {
//        List<Question> data = questionDao.findAll();
//        System.out.println(data); // This should print the records fetched from the database
//    }

    //as in QuestionDao we have created a proper list<question>
    public List<Quiz.Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQueston(Quiz.Question question) {
        questionDao.save(question);
        return "Question added successfully";
    }

//    public Question getQuestionById(int id) {
//        return questionDao.findById(id).get();
//    }
}
