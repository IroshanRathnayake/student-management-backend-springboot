package edu.student.sms.service.impl;


import edu.student.sms.dto.Student;
import edu.student.sms.repository.StudentRepository;
import edu.student.sms.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    final StudentRepository studentRepo;

    @Override
    public List<Student> getAllStudents() {
          return studentRepo.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Integer id) {
        return studentRepo.findById(id);
    }

    @Override
    public Student addStudent(Student student) {
        studentRepo.save(student);
        return student;
    }

    @Override
    public String deleteStudentById(Integer id) {
        studentRepo.deleteById(id);
        return "User Deleted!";
    }
}
