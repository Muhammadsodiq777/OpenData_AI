package com.example.opendata_ai.domain;

import com.example.opendata_ai.domain.base.BaseDomain;
import lombok.*;

import javax.persistence.*;

@Data
@Entity(name = "OD_ATTENDANCE")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Attendance extends BaseDomain {

    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "LESSON_ID")
    private Long lessonId;

    @Column(name = "isPresent")
    private Integer isPresent;

    @Column(name = "QRCODE_ID")
    private Long qrId;
}
