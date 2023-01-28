package com.example.opendata_ai.repository;

import com.example.opendata_ai.domain.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}
