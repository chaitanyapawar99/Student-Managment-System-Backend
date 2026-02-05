package com.coding.SpringbootCRUD.controller;

import com.coding.SpringbootCRUD.entity.Student;
import com.coding.SpringbootCRUD.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        System.out.println(student);
        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student> getStudents(){
        return service.getAllStudents();
    }

//    @GetMapping("/{id}")
//    public Student getStudentById(@PathVariable Long id){
//        return service.getStudentById(id);
//    }

    @PutMapping("/{id}")
    public Student updateStudentById(@PathVariable Long id,@RequestBody Student student){
        return service.updateStudent(id,student);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id){
         service.deleteStudent(id);
         return "Student Deleted Successfully";
    }

}
