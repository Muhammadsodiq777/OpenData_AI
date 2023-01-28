package com.example.opendata_ai.repository;

import com.example.opendata_ai.domain.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teachers, Long> {
}
