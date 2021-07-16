/*
Table Name: student
           int sid,
           String firstName;
           String lastName;
           int score;
           


*/
package com.tta.model;

public class Student {
    int sid;
    String firstName;
    String lastName;
    int score;
      
    // default Constructor

    public Student() {
        
        
    }
    
    //parameter Constructor

    public Student(int sid, String firstName, String lastName, int score) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }
    
    // getter and setter

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
}// end class
