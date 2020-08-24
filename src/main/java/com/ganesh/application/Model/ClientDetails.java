package com.ganesh.application.Model;

import com.ganesh.application.utils.enums.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ClientDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String bank_name;

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
    private  String identification_card_name;

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






}
