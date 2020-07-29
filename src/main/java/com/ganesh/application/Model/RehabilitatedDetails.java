package com.ganesh.application.Model;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RehabilitatedDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String house_hold_name;

    private String telephone_no;

    private String mobile_no;

    private String district_name;

    private String vdc_name;

    private String ward_no;

    private String tole_name;

    private String house_no;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouse_hold_name() {
        return house_hold_name;
    }

    public void setHouse_hold_name(String house_hold_name) {
        this.house_hold_name = house_hold_name;
    }

    public String getTelephone_no() {
        return telephone_no;
    }

    public void setTelephone_no(String telephone_no) {
        this.telephone_no = telephone_no;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getDistrict_name() {
        return district_name;
    }



    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public String getVdc_name() {
        return vdc_name;
    }

    public void setVdc_name(String vdc_name) {
        this.vdc_name = vdc_name;
    }

    public String getWard_no() {
        return ward_no;
    }

    public void setWard_no(String ward_no) {
        this.ward_no = ward_no;
    }

    public String getTole_name() {
        return tole_name;
    }

    public void setTole_name(String tole_name) {
        this.tole_name = tole_name;
    }

    public String getHouse_no() {
        return house_no;
    }

    public void setHouse_no(String house_no) {
        this.house_no = house_no;
    }


    public RehabilitatedDetails(String house_hold_name, String telephone_no, String mobile_no, String district_name, String vdc_name, String ward_no, String tole_name, String house_no) {
        this.house_hold_name = house_hold_name;
        this.telephone_no = telephone_no;
        this.mobile_no = mobile_no;
        this.district_name = district_name;
        this.vdc_name = vdc_name;
        this.ward_no = ward_no;
        this.tole_name = tole_name;
        this.house_no = house_no;
    }

    @OneToOne( mappedBy = "rehabilitatedDetails" ,fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private ClientDetails clientDetails;

}
