package com.crud.contaclistapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ContactDTO {

    @NotBlank(message = "Nombre es obligatorio")
    private String name;

    @NotNull(message = "Fecha de nacimiento es obligatorio")
    @Past(message = "La fecha debe de ser en pasado")
    private LocalDate fechaNacimiento;

    @NotBlank(message = "Numero de celular es obligatorio")
    private String celular;

    @Email(message = "Email es inválido")
    @NotBlank(message = "Email es obligatorio")
    private String email;
}
