package edu.student.sms.controller;

import edu.student.sms.dto.Student;
import edu.student.sms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/all")
    public List<Student> getStudents(){
        return service.getAllStudents();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id){
        return service.getStudentById(id);
    }

    @PostMapping("/add-student")
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

    @PutMapping("/update-student")
    public Student updateStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id){
        return service.deleteStudentById(id);
    }

}
