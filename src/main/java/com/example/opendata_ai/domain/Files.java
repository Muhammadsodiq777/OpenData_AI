package com.example.opendata_ai.domain;

import com.example.opendata_ai.domain.base.BaseDomain;
import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@Entity(name = "0D_FILES")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Files extends BaseDomain {

    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Builder.Default
    private String nameUUID = UUID.randomUUID().toString();

    @Column(name = "ENCODED_FILE")
    private String encodedFile;
}
