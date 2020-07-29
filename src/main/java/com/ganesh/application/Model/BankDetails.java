package com.ganesh.application.Model;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BankDetails
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String family_name;

    private String relation;

    private  String account_no;

    @Column(length = 65535, columnDefinition = "text")
    private String name_and_address_bank;

    public BankDetails(String family_name, String relation, String account_no, String name_and_address_bank) {
        this.family_name = family_name;
        this.relation = relation;
        this.account_no = account_no;
        this.name_and_address_bank = name_and_address_bank;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFamily_name() {
        return family_name;
    }

    public void setFamily_name(String family_name) {
        this.family_name = family_name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getName_and_address_bank() {
        return name_and_address_bank;
    }

    public void setName_and_address_bank(String name_and_address_bank) {
        this.name_and_address_bank = name_and_address_bank;
    }

    @OneToOne( mappedBy = "bankDetails" ,fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private ClientDetails clientDetails;



}
