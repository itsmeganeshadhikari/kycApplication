package com.ganesh.application.Model;

import com.ganesh.application.utils.enums.BankFormType;
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

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

}
