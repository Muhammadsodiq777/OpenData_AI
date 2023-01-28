package com.example.opendata_ai.domain;

import com.example.opendata_ai.domain.base.BaseDomain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name = "OD_QR_CODE")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class QrCode extends BaseDomain {

    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "QR_UUID", unique = true)
    private String qrUUid;

    @Column(name = "isActive")
    private Integer isActive;

}
