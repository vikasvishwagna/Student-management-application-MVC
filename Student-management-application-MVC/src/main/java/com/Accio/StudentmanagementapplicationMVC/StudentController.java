package com.Accio.StudentmanagementapplicationMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
//Controller layer always deals with the API'S & end points.
    @Autowired
    StudentService studentService;
@PostMapping("/add")
public String addStudent(@RequestBody Student student){
    return studentService.addStudent(student);
    //localhost:8080/add
        /*in Tomcat -> body -> raw -> JSON
        "regNo":1000,
        "name":"sai",
        "age":23,
        "course":"ece",
        "semYear":8
        */
}

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return studentService.getStudent(regNo);
        ////localhost:8080/get?q=1000
    }

    @GetMapping("/getbyPath/{id}")
    public Student getStudentbypath(@PathVariable("id") int regNo){
       return studentService.getStudentbypath(regNo);
        //localhost:8080/getbyPath/2000
    }

    @PutMapping("/updatebyrequestparam")
    //updating student age by Requestparam
    public Student updateStudentbyrequestparam(@RequestParam("id") int regNo,@RequestParam("age") int newage){
        return studentService.updateStudentbyrequestparam(regNo,newage);
        //localhost:8080/updatebyrequestparam?id=1000&age=23
    }

    @PutMapping("/updatebypathvariable/{id}/{age}")
    public Student updatebypathvariable(@PathVariable("id") int regNo,@PathVariable("age") int newage){
        return studentService.updatebypathvariable(regNo, newage);
        //localhost:8080/updatebypathvariable/1000/24
    }


    @DeleteMapping("/delete")
    public String deleteStudent(@RequestParam("id") int regNo){
      return studentService.deleteStudent(regNo);
        //localhost:8080/delete?id=1000
    }

}
