package com.ganesh.application.Model;
import com.ganesh.application.utils.enums.Municipality;
import com.ganesh.application.utils.enums.Relation;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GuardianDetails
{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Relation relation;

    private String other_relation_name;

    @Column(length = 65535, columnDefinition = "text")
    private String correspondance_address;

    private String country;

    private String province;

    private String district;

    private Municipality municipality;

    private String municipality_name;

    private String ward_no;

    private String telephone_no;

    private String fax_no;

    private String mobile_no;

    private String pan_no;

    private String email;
    @Lob
    private byte[] images;


    @OneToOne( mappedBy = "guardianDetails" ,fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private ClientDetails clientDetails;

    public GuardianDetails(String name, Relation relation, String other_relation_name, String correspondance_address, String country, String province, String district, Municipality municipality,String municipality_name, String ward_no, String telephone_no, String fax_no, String mobile_no, String pan_no, String email, byte[] images) {
        this.name = name;
        this.relation = relation;
        this.other_relation_name = other_relation_name;
        this.correspondance_address = correspondance_address;
        this.country = country;
        this.province = province;
        this.district = district;
        this.municipality = municipality;
        this.municipality_name=municipality_name;
        this.ward_no = ward_no;
        this.telephone_no = telephone_no;
        this.fax_no = fax_no;
        this.mobile_no = mobile_no;
        this.pan_no = pan_no;
        this.email = email;
        this.images = images;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    public String getOther_relation_name() {
        return other_relation_name;
    }

    public void setOther_relation_name(String other_relation_name) {
        this.other_relation_name = other_relation_name;
    }

    public String getCorrespondance_address() {
        return correspondance_address;
    }

    public void setCorrespondance_address(String correspondance_address) {
        this.correspondance_address = correspondance_address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Municipality getMunicipality() {
        return municipality;
    }

    public void setMunicipality(Municipality municipality) {
        this.municipality = municipality;
    }

    public String getWard_no() {
        return ward_no;
    }

    public void setWard_no(String ward_no) {
        this.ward_no = ward_no;
    }

    public String getTelephone_no() {
        return telephone_no;
    }

    public void setTelephone_no(String telephone_no) {
        this.telephone_no = telephone_no;
    }

    public String getFax_no() {
        return fax_no;
    }

    public void setFax_no(String fax_no) {
        this.fax_no = fax_no;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getPan_no() {
        return pan_no;
    }

    public void setPan_no(String pan_no) {
        this.pan_no = pan_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }

    public String getMunicipality_name() {
        return municipality_name;
    }

    public void setMunicipality_name(String municipality_name) {
        this.municipality_name = municipality_name;
    }



}
