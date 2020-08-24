package com.ganesh.application.Model;

import com.ganesh.application.utils.enums.Municipality;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientAddress {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    //For Current Address

    private String temp_country;



    private String temp_province;

    private String temp_district;

    private Municipality temp_municipality;

    private String temp_mun;

    private String temp_ward;

    private String temp_tole;

    private String temp_house_no;

    private String temp_telephone_no;

    private String email;

    private String mobile_no;

    private String temp_house_owner_name;

    private String temp_house_owner_address;

    private String temp_house_owner_phone_no;


//For permanent Address
    private String per_country;

    private String per_province;

    private String per_district;

     private Municipality per_municipality;

     private String per_mun;

     private String per_ward;

     private String per_tole;

     private String per_telephone_no;

     private String per_house_no;

     private String block_no;


     //Birth address
     private String birth_district;

    private Municipality birth_municipality;

    private String birth_mun;

    private String birth_tole;

    private String birth_ward;






    @OneToOne( mappedBy = "clientAddress" ,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ClientDetails clientDetails;


//
//    public ClientAddress(String temp_country, String temp_province, String temp_district, Municipality temp_municipality,String temp_mun ,String temp_ward, String temp_tole, String temp_telephone_no, String email, String mobile_no, String per_country, String per_province, String per_district,Municipality per_municipality,String per_mun, String per_ward, String per_tole,String per_telephone_no,String block_no) {
//        this.temp_country = temp_country;
//        this.temp_province = temp_province;
//        this.temp_district = temp_district;
//        this.temp_municipality = temp_municipality;
//        this.temp_mun=temp_mun;
//        this.temp_ward = temp_ward;
//        this.temp_tole = temp_tole;
//        this.temp_telephone_no = temp_telephone_no;
//        this.email = email;
//        this.mobile_no = mobile_no;
//        this.per_country = per_country;
//        this.per_province = per_province;
//        this.per_district = per_district;
//        this.per_municipality = per_municipality;
//        this.per_mun=per_mun;
//        this.per_ward = per_ward;
//        this.per_tole = per_tole;
//        this.per_telephone_no=per_telephone_no;
//        this.block_no=block_no;
//    }

}
