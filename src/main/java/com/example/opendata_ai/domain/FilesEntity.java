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
public class FilesEntity extends BaseDomain {
    @Id
    @Column(name = "ID", unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME_UUID", unique = true)
    @Builder.Default
    private String nameUUID = UUID.randomUUID().toString();

    @Column(name = "ENCODED_FILE")
    private String encodedFile;
}
