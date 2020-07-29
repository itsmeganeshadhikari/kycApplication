package com.ganesh.application.Model;

import com.ganesh.application.utils.enums.BusinessType;
import com.ganesh.application.utils.enums.FinancialDetails;
import com.ganesh.application.utils.enums.OccupationType;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OcccupationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private OccupationType occupation_type;

    private String occupation_name;

    private BusinessType business_type;

    private String business_name;

    private FinancialDetails financial_details;

    private String organization_name;

    @Column(length = 65535, columnDefinition = "text")
    private String address;

    private String designation;

    private String employee_id;

    public OcccupationDetail(OccupationType occupation_type, String occupation_name, BusinessType business_type, String business_name, FinancialDetails financial_details, String organization_name, String address, String designation, String employee_id) {
        this.occupation_type = occupation_type;
        this.occupation_name = occupation_name;
        this.business_type = business_type;
        this.business_name = business_name;
        this.financial_details = financial_details;
        this.organization_name = organization_name;
        this.address = address;
        this.designation = designation;
        this.employee_id = employee_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OccupationType getOccupation_type() {
        return occupation_type;
    }

    public void setOccupation_type(OccupationType occupation_type) {
        this.occupation_type = occupation_type;
    }

    public String getOccupation_name() {
        return occupation_name;
    }

    public void setOccupation_name(String occupation_name) {
        this.occupation_name = occupation_name;
    }

    public BusinessType getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(BusinessType business_type) {
        this.business_type = business_type;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public FinancialDetails getFinancial_details() {
        return financial_details;
    }

    public void setFinancial_details(FinancialDetails financial_details) {
        this.financial_details = financial_details;
    }

    public String getOrganization_name() {
        return organization_name;
    }

    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    @OneToOne( mappedBy = "occcupationDetail" ,fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private ClientDetails clientDetails;


}
