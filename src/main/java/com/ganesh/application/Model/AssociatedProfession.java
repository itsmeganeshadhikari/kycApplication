package com.ganesh.application.Model;

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
public class AssociatedProfession
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String organization_name;

    private String organization_address;

    private String designation;

    private String expected_annual_income;

    private String  total_expected_annual_income;

    private String full_name;

    private String code_no;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @OneToOne( mappedBy = "associatedProfession" ,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ClientDetails clientDetails;



}
