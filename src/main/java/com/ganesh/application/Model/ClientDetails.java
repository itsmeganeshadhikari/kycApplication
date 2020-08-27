package com.ganesh.application.Model;

import com.ganesh.application.utils.enums.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
//@Getter
//@Setter
//@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="bank_name")
    private String bank_name;

    @Column(name="broker_name")
    private String broker_name;

    private String branch;


    @Lob
    private byte[] pic;

    private AccountType account_type;

    private TitleType title_type;

    private String account_no;


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


    //    for citizen_ship
    private CitizenShipType citizen_ship_type;

    private String citizenship_no;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date issue_date;


    private String issue_district;

    //    for Passport
    private PassportType passport_type;

    private String passport_no;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date passport_issue_date;

    private String passport_issue_district;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date passport_expiry_date;

    //    for Identification card
    private String identification_card_name;

    private String identificaton_number;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date identification_issue_date;

    private String identification_issue_district;


    private Date createdDate = new Date();

    private EducationalType education_type;
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

    @OneToOne(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private AssociatedProfession associatedProfession;

    public ClientDetails(String bank_name, String broker_name, String branch, byte[] pic, AccountType account_type, TitleType title_type, String account_no, String first_name, String middle_name, String sur_name, Date birth_date0, Date birth_date1, MartialStatus martialStatus, Gender gender, Nationality nationality, String nationality_name, CitizenShipType citizen_ship_type, String citizenship_no, Date issue_date, String issue_district, PassportType passport_type, String passport_no, Date passport_issue_date, String passport_issue_district, Date passport_expiry_date, String identification_card_name, String identificaton_number, Date identification_issue_date, String identification_issue_district, Date createdDate, EducationalType education_type, String beneficary_no, String permanent_account_no, String identification_no, ClientAddress clientAddress, OcccupationDetail occcupationDetail, TransactionDetails transactionDetails, RehabilitatedDetails rehabilitatedDetails, GuardianDetails guardianDetails, AdditonalDetails additionalDetails, BankDetails bankDetails, AssociatedProfession associatedProfession) {
        this.bank_name = bank_name;
        this.broker_name = broker_name;
        this.branch = branch;
        this.pic = pic;
        this.account_type = account_type;
        this.title_type = title_type;
        this.account_no = account_no;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.sur_name = sur_name;
        this.birth_date0 = birth_date0;
        this.birth_date1 = birth_date1;
        this.martialStatus = martialStatus;
        this.gender = gender;
        this.nationality = nationality;
        this.nationality_name = nationality_name;
        this.citizen_ship_type = citizen_ship_type;
        this.citizenship_no = citizenship_no;
        this.issue_date = issue_date;
        this.issue_district = issue_district;
        this.passport_type = passport_type;
        this.passport_no = passport_no;
        this.passport_issue_date = passport_issue_date;
        this.passport_issue_district = passport_issue_district;
        this.passport_expiry_date = passport_expiry_date;
        this.identification_card_name = identification_card_name;
        this.identificaton_number = identificaton_number;
        this.identification_issue_date = identification_issue_date;
        this.identification_issue_district = identification_issue_district;
        this.createdDate = createdDate;
        this.education_type = education_type;
        this.beneficary_no = beneficary_no;
        this.permanent_account_no = permanent_account_no;
        this.identification_no = identification_no;
        this.clientAddress = clientAddress;
        this.occcupationDetail = occcupationDetail;
        this.transactionDetails = transactionDetails;
        this.rehabilitatedDetails = rehabilitatedDetails;
        this.guardianDetails = guardianDetails;
        this.additionalDetails = additionalDetails;
        this.bankDetails = bankDetails;
        this.associatedProfession = associatedProfession;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBroker_name() {
        return broker_name;
    }

    public void setBroker_name(String broker_name) {
        this.broker_name = broker_name;
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

    public AccountType getAccount_type() {
        return account_type;
    }

    public void setAccount_type(AccountType account_type) {
        this.account_type = account_type;
    }

    public TitleType getTitle_type() {
        return title_type;
    }

    public void setTitle_type(TitleType title_type) {
        this.title_type = title_type;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
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

    public String getNationality_name() {
        return nationality_name;
    }

    public void setNationality_name(String nationality_name) {
        this.nationality_name = nationality_name;
    }

    public CitizenShipType getCitizen_ship_type() {
        return citizen_ship_type;
    }

    public void setCitizen_ship_type(CitizenShipType citizen_ship_type) {
        this.citizen_ship_type = citizen_ship_type;
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

    public PassportType getPassport_type() {
        return passport_type;
    }

    public void setPassport_type(PassportType passport_type) {
        this.passport_type = passport_type;
    }

    public String getPassport_no() {
        return passport_no;
    }

    public void setPassport_no(String passport_no) {
        this.passport_no = passport_no;
    }

    public Date getPassport_issue_date() {
        return passport_issue_date;
    }

    public void setPassport_issue_date(Date passport_issue_date) {
        this.passport_issue_date = passport_issue_date;
    }

    public String getPassport_issue_district() {
        return passport_issue_district;
    }

    public void setPassport_issue_district(String passport_issue_district) {
        this.passport_issue_district = passport_issue_district;
    }

    public Date getPassport_expiry_date() {
        return passport_expiry_date;
    }

    public void setPassport_expiry_date(Date passport_expiry_date) {
        this.passport_expiry_date = passport_expiry_date;
    }

    public String getIdentification_card_name() {
        return identification_card_name;
    }

    public void setIdentification_card_name(String identification_card_name) {
        this.identification_card_name = identification_card_name;
    }

    public String getIdentificaton_number() {
        return identificaton_number;
    }

    public void setIdentificaton_number(String identificaton_number) {
        this.identificaton_number = identificaton_number;
    }

    public Date getIdentification_issue_date() {
        return identification_issue_date;
    }

    public void setIdentification_issue_date(Date identification_issue_date) {
        this.identification_issue_date = identification_issue_date;
    }

    public String getIdentification_issue_district() {
        return identification_issue_district;
    }

    public void setIdentification_issue_district(String identification_issue_district) {
        this.identification_issue_district = identification_issue_district;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public EducationalType getEducation_type() {
        return education_type;
    }

    public void setEducation_type(EducationalType education_type) {
        this.education_type = education_type;
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

    public AssociatedProfession getAssociatedProfession() {
        return associatedProfession;
    }

    public void setAssociatedProfession(AssociatedProfession associatedProfession) {
        this.associatedProfession = associatedProfession;
    }
}
