package com.chitnis.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;

    @ManyToOne
    private List<Question> questions;

    //here this question table is same as we used in postgres
    //here we want our table to ba mapped with class so we are using entity
    @Data
    @Entity
    @Table(name = "question")
    public static class Question {

        //here we have made id as primary key
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer id;
        private String category;
        private String difficultylevel;
        private String question_title;
        private String option1;
        private String option2;
        private String option3;
        private String option4;
        private String right_answer;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDifficultylevel() {
            return difficultylevel;
        }

        public void setDifficultylevel(String difficultylevel) {
            this.difficultylevel = difficultylevel;
        }

        public String getQuestion_title() {
            return question_title;
        }

        public void setQuestion_title(String question_title) {
            this.question_title = question_title;
        }

        public String getOption1() {
            return option1;
        }

        public void setOption1(String option1) {
            this.option1 = option1;
        }

        public String getOption2() {
            return option2;
        }

        public void setOption2(String option2) {
            this.option2 = option2;
        }

        public String getOption3() {
            return option3;
        }

        public void setOption3(String option3) {
            this.option3 = option3;
        }

        public String getOption4() {
            return option4;
        }

        public void setOption4(String option4) {
            this.option4 = option4;
        }

        public String getRight_answer() {
            return right_answer;
        }

        public void setRight_answer(String right_answer) {
            this.right_answer = right_answer;
        }
    }
}
