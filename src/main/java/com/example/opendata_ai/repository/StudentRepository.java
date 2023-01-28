package com.example.opendata_ai.repository;

import com.example.opendata_ai.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
