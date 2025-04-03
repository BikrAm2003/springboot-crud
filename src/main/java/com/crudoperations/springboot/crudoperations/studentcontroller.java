package com.crudoperations.springboot.crudoperations;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class studentcontroller {
    @Autowired
    studentrepository repo;
    @GetMapping("/students")
    public List<Student> getallstudent(){
        List<Student> students=repo.findAll();
        return students;
    }

    @GetMapping("students/{id}")
    public Student getstudent(@PathVariable int id){
        Student student=repo.findById(id).get();
        return student;
    }

    @PostMapping("/students/add")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void createstudent(@RequestBody Student student){
        repo.save(student);
    }

    @PutMapping("students/update/{id}")
    public Student studentupdate(@PathVariable int id) {
        
        Student student=repo.findById(id).get();
        student.setName("micky");
        student.setCourse("gpa");
        return student;
    }
    @DeleteMapping("students/delete/{id}")
    public void delete(@PathVariable int id){
        Student student=repo.findById(id).get();
        repo.delete(student);
    }
}
