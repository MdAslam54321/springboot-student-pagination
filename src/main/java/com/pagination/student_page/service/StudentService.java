package com.pagination.student_page.service;

import com.pagination.student_page.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);

    List<Student> getAllStudents( Integer pageNumber, Integer pageSize, String sortBy, String sortDirection);
}
