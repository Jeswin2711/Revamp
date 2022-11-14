package com.workshop.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.workshop.demo.Model.Student;
import com.workshop.demo.Service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    
    //PostRequest
    //GetRequest
    //PutRequest
    //DeleteRequest

    @Autowired
    private StudentService studentSerivce;

    @PostMapping("/addStudent")
    public Student addStudentToDatabase(@RequestBody Student student) //int a ,String name
    {
        return studentSerivce.addStudentToDatabase(student);
    }

    @GetMapping("/getall")
    public List<Student> getall()
    {
        return studentSerivce.getall();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id)
    {
        return studentSerivce.deleteStudent(id);
    }

    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable int id , @RequestBody Student student)
    {
        return studentSerivce.updateStudent(id , student);
    }


}
