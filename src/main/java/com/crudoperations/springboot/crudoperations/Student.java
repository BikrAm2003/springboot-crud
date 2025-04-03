package com.crudoperations.springboot.crudoperations;

import jakarta.persistence.*;

@Entity
@Table(name = "students") // Changed table name to avoid confusion with DB name
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollno;

    @Column(nullable = false) // Ensures value can't be null
    private String name;

    @Column(nullable = false)
    private String course;

    @Column(nullable = false)
    private float percentage; // Changed from String to float for accuracy

    // Default constructor
    public Student() {
    }

    // Parameterized constructor (excluding rollno)
    public Student(String name, String course, float percentage) {
        this.name = name;
        this.course = course;
        this.percentage = percentage;
    }

    // Getters and Setters
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
