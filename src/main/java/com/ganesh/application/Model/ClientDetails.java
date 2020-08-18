package com.ganesh.application.Model;

import com.ganesh.application.utils.enums.Gender;
import com.ganesh.application.utils.enums.MartialStatus;
import com.ganesh.application.utils.enums.Nationality;
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

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private BankBank bankBank;

    @Transient
    private String bankName;

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

}
