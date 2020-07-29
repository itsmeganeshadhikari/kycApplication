package com.ganesh.application.Model;


import com.ganesh.application.utils.enums.Beneficary;
import com.ganesh.application.utils.enums.Felony;
import com.ganesh.application.utils.enums.Political;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdditonalDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Political political;

    private String political_name;

    private String political_relation;

    private Beneficary beneficary;

    private String beneficary_name;

    private String beneficary_relation;

    private Felony felony;

    private String offenses;
    @Lob
    private byte[] images;

    public AdditonalDetails(Political political, String political_name, String political_relation, Beneficary beneficary, String beneficary_name, String beneficary_relation, Felony felony, String offenses, byte[] images) {
        this.political = political;
        this.political_name = political_name;
        this.political_relation = political_relation;
        this.beneficary = beneficary;
        this.beneficary_name = beneficary_name;
        this.beneficary_relation = beneficary_relation;
        this.felony = felony;
        this.offenses = offenses;
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Political getPolitical() {
        return political;
    }

    public void setPolitical(Political political) {
        this.political = political;
    }

    public String getPolitical_name() {
        return political_name;
    }

    public void setPolitical_name(String political_name) {
        this.political_name = political_name;
    }

    public String getPolitical_relation() {
        return political_relation;
    }

    public void setPolitical_relation(String political_relation) {
        this.political_relation = political_relation;
    }

    public Beneficary getBeneficary() {
        return beneficary;
    }

    public void setBeneficary(Beneficary beneficary) {
        this.beneficary = beneficary;
    }

    public String getBeneficary_name() {
        return beneficary_name;
    }

    public void setBeneficary_name(String beneficary_name) {
        this.beneficary_name = beneficary_name;
    }

    public String getBeneficary_relation() {
        return beneficary_relation;
    }

    public void setBeneficary_relation(String beneficary_relation) {
        this.beneficary_relation = beneficary_relation;
    }

    public Felony getFelony() {
        return felony;
    }

    public void setFelony(Felony felony) {
        this.felony = felony;
    }

    public String getOffenses() {
        return offenses;
    }

    public void setOffenses(String offenses) {
        this.offenses = offenses;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

    @OneToOne( mappedBy = "additionalDetails" ,fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private ClientDetails clientDetails;


}
