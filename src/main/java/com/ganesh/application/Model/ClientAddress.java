package com.ganesh.application.Model;

import com.ganesh.application.utils.enums.Municipality;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientAddress {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private String temp_country;



    private String temp_province;

    private String temp_district;

    private Municipality temp_municipality;

    private String temp_mun;

    private String temp_ward;

    private String temp_tole;

    private String temp_telephone_no;

    private String email;

    private String mobile_no;

    private String per_country;

    private String per_province;

    private String per_district;

     private Municipality per_municipality;

     private String per_mun;

     private String per_ward;

     private String per_tole;

     private String per_telephone_no;

     private String block_no;


    @OneToOne( mappedBy = "clientAddress" ,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ClientDetails clientDetails;



    public ClientAddress(String temp_country, String temp_province, String temp_district, Municipality temp_municipality,String temp_mun ,String temp_ward, String temp_tole, String temp_telephone_no, String email, String mobile_no, String per_country, String per_province, String per_district,Municipality per_municipality,String per_mun, String per_ward, String per_tole,String per_telephone_no,String block_no) {
        this.temp_country = temp_country;
        this.temp_province = temp_province;
        this.temp_district = temp_district;
        this.temp_municipality = temp_municipality;
        this.temp_mun=temp_mun;
        this.temp_ward = temp_ward;
        this.temp_tole = temp_tole;
        this.temp_telephone_no = temp_telephone_no;
        this.email = email;
        this.mobile_no = mobile_no;
        this.per_country = per_country;
        this.per_province = per_province;
        this.per_district = per_district;
        this.per_municipality = per_municipality;
        this.per_mun=per_mun;
        this.per_ward = per_ward;
        this.per_tole = per_tole;
        this.per_telephone_no=per_telephone_no;
        this.block_no=block_no;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemp_country() {
        return temp_country;
    }

    public void setTemp_country(String temp_country) {
        this.temp_country = temp_country;
    }

    public String getTemp_province() {
        return temp_province;
    }

    public void setTemp_province(String temp_province) {
        this.temp_province = temp_province;
    }

    public String getTemp_district() {
        return temp_district;
    }

    public void setTemp_district(String temp_district) {
        this.temp_district = temp_district;
    }

    public Municipality getTemp_municipality() {
        return temp_municipality;
    }

    public void setTemp_municipality(Municipality temp_municipality) {
        this.temp_municipality = temp_municipality;
    }

    public String getTemp_ward() {
        return temp_ward;
    }

    public void setTemp_ward(String temp_ward) {
        this.temp_ward = temp_ward;
    }

    public String getTemp_tole() {
        return temp_tole;
    }

    public void setTemp_tole(String temp_tole) {
        this.temp_tole = temp_tole;
    }

    public String getTemp_telephone_no() {
        return temp_telephone_no;
    }

    public void setTemp_telephone_no(String temp_telephone_no) {
        this.temp_telephone_no = temp_telephone_no;
    }

    public String getPer_telephone_no() {
        return per_telephone_no;
    }

    public void setPer_telephone_no(String per_telephone_no) {
        this.per_telephone_no = per_telephone_no;
    }

    public String getBlock_no() {
        return block_no;
    }

    public void setBlock_no(String block_no) {
        this.block_no = block_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getPer_country() {
        return per_country;
    }

    public void setPer_country(String per_country) {
        this.per_country = per_country;
    }

    public String getPer_province() {
        return per_province;
    }

    public void setPer_province(String per_province) {
        this.per_province = per_province;
    }

    public String getPer_district() {
        return per_district;
    }

    public void setPer_district(String per_district) {
        this.per_district = per_district;
    }

    public Municipality getPer_municipality() {
        return per_municipality;
    }

    public void setPer_municipality(Municipality per_municipality) {
        this.per_municipality = per_municipality;
    }

    public String getPer_ward() {
        return per_ward;
    }

    public void setPer_ward(String per_ward) {
        this.per_ward = per_ward;
    }

    public String getPer_tole() {
        return per_tole;
    }

    public void setPer_tole(String per_tole) {
        this.per_tole = per_tole;
    }

    public String getTemp_mun() {
        return temp_mun;
    }

    public void setTemp_mun(String temp_mun) {
        this.temp_mun = temp_mun;
    }

    public String getPer_mun() {
        return per_mun;
    }

    public void setPer_mun(String per_mun) {
        this.per_mun = per_mun;
    }





    


}
