package com.example.opendata_ai.repository;

import com.example.opendata_ai.domain.QrCode;
import org.springframework.data.jpa.repository.JpaRepository;
public interface QrCodeRepository extends JpaRepository<QrCode, Long> {
}
