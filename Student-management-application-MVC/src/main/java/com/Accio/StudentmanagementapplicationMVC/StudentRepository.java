package com.Accio.StudentmanagementapplicationMVC;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
    Map<Integer,Student> hm = new HashMap<>();
     /*
    we have created a hm which stores key of type integer & value of student.
    where key is regNo,and value is student class.
    */
    public String addStudent(Student student){
        hm.put(student.getRegNo(),student);
        return "student added sucessfully";
    }

    public Student getStudent(int regNo){
        return hm.get(regNo);
    }

    public Student getStudentbypath(int regNo){
        return hm.get(regNo);

    }

    public Student updateStudentbyrequestparam(int regNo,int newage){
        hm.get(regNo).setAge(newage);
        return hm.get(regNo);
    }

    public Student updatebypathvariable(int regNo,int newage){
        //updating student age by pathvariable
        hm.get(regNo).setAge(newage);
        return hm.get(regNo);
    }

    public String deleteStudent(int regNo){
        hm.remove(regNo);//this only delets given key and its values in hm
        //hm.clear();this is wrong because it delets entire hm
        return "one of the student with given regno has deleted";
    }
}
