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

    private String name;


    @OneToMany(targetEntity = ClientDetails.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "bankBank")
    private List<ClientDetails> clientDetails;

    public BankBank() {
    }


}
