package com.example.opendata_ai.repository;

import com.example.opendata_ai.domain.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeTableRepository extends JpaRepository<TimeTable, Long> {
}
