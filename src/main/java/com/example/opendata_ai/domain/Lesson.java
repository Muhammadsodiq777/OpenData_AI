package com.example.opendata_ai.domain;

import com.example.opendata_ai.domain.base.BaseDomain;
import lombok.*;
import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "OD_LESSON")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lesson extends BaseDomain {

    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LESSON_TIME")
    private LocalDateTime lessonTime;

}
