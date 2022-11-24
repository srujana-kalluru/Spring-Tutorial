package com.core;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student {
    private long id;
    private String firstName;
    private String surname;
    private String dept;
    private Double fees;

    public Student(String firstName, String surname, String dept, Double fees) {
        super();
        this.firstName = firstName;
        this.surname = surname;
        this.dept = dept;
        this.fees = fees;
    }
}
