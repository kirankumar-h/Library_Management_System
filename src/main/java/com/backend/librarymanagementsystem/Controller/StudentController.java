package com.backend.librarymanagementsystem.Controller;

import com.backend.librarymanagementsystem.Entity.Student;
import com.backend.librarymanagementsystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student has been added";
    }

    @GetMapping("/find_by_email")
    public String findStudentByEmail(@RequestParam("email") String email){

        return studentService.findByEmail(email);
    }


}
