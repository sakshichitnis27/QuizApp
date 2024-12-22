//the main functionality of this layer is that it will fetch data from database
package com.chitnis.quizapp.dao;

import com.chitnis.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Quiz.Question,Integer> {

    // here as we don't have anything in specific to fetch data based on it's category we have to create it
    List<Quiz.Question> findByCategory(String category);

}