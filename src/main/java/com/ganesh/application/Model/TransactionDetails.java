package com.ganesh.application.Model;

import com.ganesh.application.utils.enums.*;
import com.ganesh.application.utils.enums.*;
import lombok.*;

import javax.persistence.*;


@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TransactionDetails
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private IncomeType income_type;

    private BooleanType boolean_type;
    private String company;
    private String customer_code;

    private DebtInformation debt_information;

    private InvestmentCompanies investment_companies;
    private String investment_company_name;

    private Designation designation;

    private String designation_name;




    @OneToOne( mappedBy = "transactionDetails" ,fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private ClientDetails clientDetails;


    public TransactionDetails(IncomeType income_type, BooleanType boolean_type, String company, String customer_code, DebtInformation debt_information, InvestmentCompanies investment_companies, String investment_company_name, Designation designation,String designation_name) {
        this.income_type = income_type;
        this.boolean_type = boolean_type;
        this.company = company;
        this.customer_code = customer_code;
        this.debt_information = debt_information;
        this.investment_companies = investment_companies;
        this.investment_company_name = investment_company_name;
        this.designation = designation;
        this.designation_name=designation_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IncomeType getIncome_type() {
        return income_type;
    }

    public void setIncome_type(IncomeType income_type) {
        this.income_type = income_type;
    }

    public BooleanType getBoolean_type() {
        return boolean_type;
    }

    public void setBoolean_type(BooleanType boolean_type) {
        this.boolean_type = boolean_type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCustomer_code() {
        return customer_code;
    }

    public void setCustomer_code(String customer_code) {
        this.customer_code = customer_code;
    }

    public DebtInformation getDebt_information() {
        return debt_information;
    }

    public void setDebt_information(DebtInformation debt_information) {
        this.debt_information = debt_information;
    }

    public InvestmentCompanies getInvestment_companies() {
        return investment_companies;
    }

    public void setInvestment_companies(InvestmentCompanies investment_companies) {
        this.investment_companies = investment_companies;
    }

    public String getInvestment_company_name() {
        return investment_company_name;
    }

    public void setInvestment_company_name(String investment_company_name) {
        this.investment_company_name = investment_company_name;
    }

    public Designation getDesignation() {
        return designation;
    }

    public void setDesignation(Designation designation) {
        this.designation = designation;
    }

    public String getDesignation_name() {
        return designation_name;
    }

    public void setDesignation_name(String designation_name) {
        this.designation_name = designation_name;
    }
}
