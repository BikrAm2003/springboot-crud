package com.crudoperations.springboot.crudoperations;

import org.springframework.data.jpa.repository.JpaRepository;

public interface studentrepository extends JpaRepository<Student,Integer> {

}
