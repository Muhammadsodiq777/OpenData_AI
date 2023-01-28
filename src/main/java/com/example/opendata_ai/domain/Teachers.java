package com.example.opendata_ai.domain;

import com.example.opendata_ai.domain.base.BaseDomain;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "OD_TEACHERS")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teachers extends BaseDomain {
    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "FIO")
    private String fio;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHINE_NUMBER")
    private String phoneNumber;

    @Column(name = "LESSON_ID")
    private Long lessonId;
}
