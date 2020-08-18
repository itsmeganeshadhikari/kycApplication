package com.ganesh.application.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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


    @OneToMany(targetEntity = ClientDetails.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "bank")
    private List<ClientDetails> clientDetails;
    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

}
