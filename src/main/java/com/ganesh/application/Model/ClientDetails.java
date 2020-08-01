package com.ganesh.application.Model;

import com.ganesh.application.utils.enums.Gender;
import com.ganesh.application.utils.enums.MartialStatus;
import com.ganesh.application.utils.enums.Nationality;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String branch;


    @Lob
    private byte[] pic;

    private String first_name;

    private String middle_name;

    private String sur_name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth_date0;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth_date1;

    private MartialStatus martialStatus;


    private Gender gender;

    private Nationality nationality;

    private String nationality_name;

    private String citizenship_no;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date issue_date;


    private String issue_district;

    private Date createdDate = new Date();


    private String beneficary_no;


    private String permanent_account_no;


    @Column(length = 65535, columnDefinition = "text")
    private String identification_no;

    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private ClientAddress clientAddress;

    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private OcccupationDetail occcupationDetail;


    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private TransactionDetails transactionDetails;

    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private RehabilitatedDetails rehabilitatedDetails;


    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private GuardianDetails guardianDetails;

    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private AdditonalDetails additionalDetails;

    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private BankDetails bankDetails;


    public ClientDetails(String branch, byte[] pic, String first_name, String middle_name, String sur_name, Date birth_date0, Date birth_date1, MartialStatus martialStatus, Gender gender, Nationality nationality, String nationality_name, String citizenship_no, Date issue_date, String issue_district, Date createdDate, String beneficary_no, String permanent_account_no, String identification_no) {
        this.branch = branch;
        this.pic = pic;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.sur_name = sur_name;
        this.birth_date0 = birth_date0;
        this.birth_date1 = birth_date1;
        this.martialStatus = martialStatus;
        this.gender = gender;
        this.nationality=nationality;
        this.nationality_name = nationality_name;
        this.citizenship_no = citizenship_no;
        this.issue_date = issue_date;
        this.issue_district = issue_district;
        this.createdDate = createdDate;
        this.beneficary_no = beneficary_no;
        this.permanent_account_no = permanent_account_no;
        this.identification_no = identification_no;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getSur_name() {
        return sur_name;
    }

    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public Date getBirth_date0() {
        return birth_date0;
    }

    public void setBirth_date0(Date birth_date0) {
        this.birth_date0 = birth_date0;
    }

    public Date getBirth_date1() {
        return birth_date1;
    }

    public void setBirth_date1(Date birth_date1) {
        this.birth_date1 = birth_date1;
    }

    public MartialStatus getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(MartialStatus martialStatus) {
        this.martialStatus = martialStatus;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public String getCitizenship_no() {
        return citizenship_no;
    }

    public void setCitizenship_no(String citizenship_no) {
        this.citizenship_no = citizenship_no;
    }

    public Date getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(Date issue_date) {
        this.issue_date = issue_date;
    }

    public String getIssue_district() {
        return issue_district;
    }

    public void setIssue_district(String issue_district) {
        this.issue_district = issue_district;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getBeneficary_no() {
        return beneficary_no;
    }

    public void setBeneficary_no(String beneficary_no) {
        this.beneficary_no = beneficary_no;
    }

    public String getPermanent_account_no() {
        return permanent_account_no;
    }

    public void setPermanent_account_no(String permanent_account_no) {
        this.permanent_account_no = permanent_account_no;
    }

    public String getIdentification_no() {
        return identification_no;
    }

    public void setIdentification_no(String identification_no) {
        this.identification_no = identification_no;
    }






    public ClientAddress getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(ClientAddress clientAddress) {
        this.clientAddress = clientAddress;
    }

    public OcccupationDetail getOcccupationDetail() {
        return occcupationDetail;
    }

    public void setOcccupationDetail(OcccupationDetail occcupationDetail) {
        this.occcupationDetail = occcupationDetail;
    }

    public TransactionDetails getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public RehabilitatedDetails getRehabilitatedDetails() {
        return rehabilitatedDetails;
    }

    public void setRehabilitatedDetails(RehabilitatedDetails rehabilitatedDetails) {
        this.rehabilitatedDetails = rehabilitatedDetails;
    }

    public GuardianDetails getGuardianDetails() {
        return guardianDetails;
    }

    public void setGuardianDetails(GuardianDetails guardianDetails) {
        this.guardianDetails = guardianDetails;
    }

    public AdditonalDetails getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(AdditonalDetails additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public BankDetails getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getNationality_name() {
        return nationality_name;
    }

    public void setNationality_name(String nationality_name) {
        this.nationality_name = nationality_name;
    }
}
