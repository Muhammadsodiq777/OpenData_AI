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
public class TimeTable  extends BaseDomain {
    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TEACHER_ID")
    private Long teacherId;

    @Column(name = "STUDENT_ID")
    private Long studentId;

    @Column(name = "ROOM_ID")
    private Long roomId;
}
