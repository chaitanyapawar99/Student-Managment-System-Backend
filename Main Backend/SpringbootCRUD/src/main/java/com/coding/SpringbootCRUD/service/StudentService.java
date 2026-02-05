package com.coding.SpringbootCRUD.service;

import com.coding.SpringbootCRUD.entity.Student;
import com.coding.SpringbootCRUD.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student saveStudent(Student student){
        return repo.save(student);
    }

    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    public Student getStudentById(Long id){
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(Long id,Student student){
        Student existing = repo.findById(id).orElse(null);
        if(existing!= null){
            existing.setName(student.getName());
            existing.setEmail(student.getEmail());
            existing.setAge(student.getAge());
            return repo.save(existing);
        }
        return null;
    }

    public void deleteStudent(Long id){
        repo.deleteById(id);
    }

}
