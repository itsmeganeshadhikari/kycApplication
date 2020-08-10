package com.ganesh.application.Model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "bank")
    private List<ClientDetails> clientDetails;
}
