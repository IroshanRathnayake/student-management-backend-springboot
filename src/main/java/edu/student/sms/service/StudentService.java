package edu.student.sms.service;

import edu.student.sms.dto.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Integer id);
    Student addStudent(Student student);
    String deleteStudentById(Integer id);
}
