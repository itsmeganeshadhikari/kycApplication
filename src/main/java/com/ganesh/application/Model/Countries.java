package com.ganesh.application.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString

@Table(name="countries")
public class Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String country_code;
    private String country_en_name;


    private String country_en_nationality;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getCountry_en_name() {
        return country_en_name;
    }

    public void setCountry_en_name(String country_en_name) {
        this.country_en_name = country_en_name;
    }

    public String getCountry_en_nationality() {
        return country_en_nationality;
    }

    public void setCountry_en_nationality(String country_en_nationality) {
        this.country_en_nationality = country_en_nationality;
    }

    public Countries(String country_code, String country_en_name, String country_en_nationality) {

        this.country_code = country_code;
        this.country_en_name = country_en_name;
        this.country_en_nationality = country_en_nationality;
    }

}
