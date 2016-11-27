package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {


}
