package com.workshop.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshop.demo.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{}