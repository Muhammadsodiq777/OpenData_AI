package com.example.opendata_ai.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity(name = "OD_ATTENDANCE")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Attendance {

    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
