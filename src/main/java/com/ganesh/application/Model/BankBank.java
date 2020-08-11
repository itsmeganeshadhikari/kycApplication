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
public class BankBank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Transient
    private String name;


    public BankBank() {
    }

    public BankBank(String name, List<ClientDetails> clientDetails) {
        this.name = name;
        this.clientDetails = clientDetails;
    }

    @OneToMany(targetEntity = ClientDetails.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "bankBank")
    private List<ClientDetails> clientDetails;
}
