package com.example.opendata_ai.domain;


import com.example.opendata_ai.domain.base.BaseDomain;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "OD_USER")
public class Student extends BaseDomain {

    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FIO")
    private String fio;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHINE_NUMBER")
    private String phoneNumber;

    @Column(name = "IS_ACTIVE")
    private Integer isActive;


}
