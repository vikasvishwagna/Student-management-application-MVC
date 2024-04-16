package com.Accio.StudentmanagementapplicationMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
      @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student){
         return studentRepository.addStudent(student);

    }
    public Student getStudent(int regNo){
        return studentRepository.getStudent(regNo);
    }

    public Student getStudentbypath(int regNo){
        return studentRepository.getStudentbypath(regNo);
    }

    public Student updateStudentbyrequestparam(int regNo,int newage){
        return studentRepository.updateStudentbyrequestparam(regNo,newage);
    }

    public Student updatebypathvariable(int regNo,int newage){
        return studentRepository.updatebypathvariable(regNo, newage);
    }

    public String deleteStudent(int regNo) {
        return studentRepository.deleteStudent(regNo);
    }
}
