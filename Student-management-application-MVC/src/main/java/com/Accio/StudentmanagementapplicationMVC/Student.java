package com.Accio.StudentmanagementapplicationMVC;

public class Student {
    //this is a model class -> this class carry data or in simple words which are stored in db.
    //here student class data is stored in db, so this class is called model class.

    private int regNo;
    private String name;
    private int age;
    private String course;
    private int semYear;

    public Student(){
        //non-parameterised constructor
    }
    public Student(int regNo,String name,int age,String course,int semYear){
        //parameterised constructor
        this.regNo = regNo;
        this.name = name;
        this.age = age;
        this.course = course;
        this.semYear = semYear;
    }
    //getters&setters to access private variables

    public int getRegNo(){
        return regNo;
    }
    public void setRegNo(int regNo){
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course = course;
    }

    public int getSemYear(){
        return semYear;
    }
    public void setSemYear(int semYear){
        this.semYear = semYear;
    }
}
