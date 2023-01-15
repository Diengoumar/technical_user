package com.technical_test.oumar_test.users.entities;



import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Getter
@Setter
@ToString

public class User {
    @Id
    @SequenceGenerator(name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )

    private long id;
    @Column(name = "name")
    @NotNull
    private String name;
    @Column(name = "dob")
    @NotNull
    private LocalDate birthDate;
    @Column(name = "country_residence")
    @NotNull
    private String countryResidence;

    @Column(name = "number")
    private String number;
    @Column(name = "gender")
    private String gender;

    public User() {
    }

    public User(String name, LocalDate birthDate, String countryResidence) {
        this.name = name;
        this.birthDate = birthDate;
        this.countryResidence = countryResidence;
    }

    public User(String name, LocalDate birthDate, String countryResidence, String number, String gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.countryResidence = countryResidence;
        this.number = number;
        this.gender = gender;
    }
}
