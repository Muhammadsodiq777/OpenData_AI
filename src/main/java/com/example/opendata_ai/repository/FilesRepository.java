package com.example.opendata_ai.repository;

import com.example.opendata_ai.domain.FilesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesRepository extends JpaRepository<FilesEntity, Long> {
}
