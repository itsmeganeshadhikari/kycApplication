package com.ganesh.application.Model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="district")
public class District
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String district_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public District(String district_name) {
        this.district_name = district_name;
    }


}
