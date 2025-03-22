package com.frogcrew.frogcrewapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class CrewMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Email
    @Column(unique = true)
    private String email;

    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{4}")
    private String phoneNumber;

    @NotBlank
    private String password;

    @NotBlank
    private String role;

    @NotBlank
    private String qualifiedPosition;

    // Getters and Setters
}
