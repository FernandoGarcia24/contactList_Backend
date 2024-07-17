package com.crud.contaclistapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "contacts")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String name;

    @NonNull
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @NonNull
    private String celular;

    @NonNull
    private String email;

    @NonNull
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
