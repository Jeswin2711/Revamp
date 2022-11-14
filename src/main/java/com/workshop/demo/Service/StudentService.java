package com.workshop.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.demo.Model.Student;
import com.workshop.demo.Repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student addStudentToDatabase(Student student)
    {
        return studentRepository.save(student);
    }

    public List<Student> getall()
    {
        return studentRepository.findAll();
    }

    public String deleteStudent(int id)
    {
        studentRepository.deleteById(id);
        return "Deleted Successfully";
    }

    public String updateStudent(int id , Student student)
    {
        Student student1 = studentRepository.findById(id).get();
        //suganth , 1231313 , asdasdasdas - student1
        //jeswin , 454353 , asdasdsadas - student
        student1.setName(student.getName());
        student1.setAddress(student.getAddress());
        student1.setPhoneNumber(student.getPhoneNumber());
        studentRepository.save(student1);
        return "Update Success";
    }

}
