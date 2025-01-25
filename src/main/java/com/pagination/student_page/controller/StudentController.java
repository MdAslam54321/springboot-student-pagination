package com.pagination.student_page.controller;

import com.pagination.student_page.entity.Student;
import com.pagination.student_page.repository.StudentRepository;
import com.pagination.student_page.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students/pagination/")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        System.out.println("Received Student: " + student);
        return studentService.createStudent(student);
    }
    @GetMapping("/get")
    public List<Student> getAllStudents(@RequestParam(value = "pageNumber", defaultValue = "0", required = false) Integer pageNumber,
                                        @RequestParam(value = "pageSize", defaultValue = "10", required = false) Integer pageSize,
                                        @RequestParam(value = "name", defaultValue = "name", required = false) String sortBy,
                                        @RequestParam(value = "sortDirection", defaultValue = "ASC", required = false) String sortDirection) {
        return studentService.getAllStudents(pageNumber, pageSize, sortBy, sortDirection);
    }
}
