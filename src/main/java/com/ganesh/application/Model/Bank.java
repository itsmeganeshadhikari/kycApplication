package com.ganesh.application.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@ToString
@Getter
@Setter
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

}
