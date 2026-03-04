package com.javatpoint;

import java.util.Date;

public class Answer {

    private int id;
    private String answer;
    private Date postedDate;

    // Default Constructor
    public Answer() {
    }

    // Parameterized Constructor
    public Answer(int id, String answer, Date postedDate) {
        this.id = id;
        this.answer = answer;
        this.postedDate = postedDate;
    }

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    // toString() method
    @Override
    public String toString() {
        return "Id: " + id +
               ", Answer: " + answer +
               ", Posted Date: " + postedDate;
    }
}