package com.ganesh.application.utils;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.ganesh.application.Model.ClientDetails;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeneratePdfReport {

    public static ByteArrayInputStream clientReport(Optional<ClientDetails> clientDetails) {

        Document document = new Document(PageSize.A4,15,15,45,30);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.setWidths(new int[]{3,3});

            Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

            PdfPCell hcell=new PdfPCell();
            hcell.setColspan(10);



                PdfPCell cell=new PdfPCell(new Paragraph("DETAILS"));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.ORANGE);
                table.addCell(cell);




//                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
//                table.addCell(hcell);
//                table.addCell("ID");
//                table.addCell((clientDetails.get().getId().toString()));


                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("BRANCH");
                table.addCell((clientDetails.get().getBranch()));


                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("FIRST NAME");
                table.addCell((clientDetails.get().getFirst_name()));



                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("MIDDLE NAME");
                table.addCell((clientDetails.get().getMiddle_name()));


                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("SUR NAME");
                table.addCell((clientDetails.get().getSur_name()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("BIRTH DATE IN B.S");
                table.addCell((clientDetails.get().getBirth_date0()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("BIRTH DATE IN A.D");
                table.addCell((clientDetails.get().getBirth_date1().toString()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("MARITIAL STATUS");
                table.addCell((clientDetails.get().getMartialStatus().toString()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("GENDER");
                table.addCell((clientDetails.get().getGender().toString()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("NATIONALITY");
                table.addCell((clientDetails.get().getNationality().toString()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("CITIZENSHIP NO");
                table.addCell((clientDetails.get().getCitizenship_no()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("ISSUE DATE OF CITIZENSHIP");
                table.addCell((clientDetails.get().getIssue_date().toString()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("ISSUE DISTRICT OF CITIZENSHIP");
                table.addCell((clientDetails.get().getIssue_district().toString()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("BENEIFICIARY NO");
                table.addCell((clientDetails.get().getBeneficary_no()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("PAN NO");
                table.addCell((clientDetails.get().getPermanent_account_no()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("IDENTIFICATION NO AND ADDRESS");
                table.addCell((clientDetails.get().getIdentification_no()));


                PdfPCell cell1=new PdfPCell(new Paragraph("ADDRESS"));
                cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell1.setBackgroundColor(BaseColor.ORANGE);
                table.addCell(cell1);

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("TEMPORARY COUNTRY");
                table.addCell((clientDetails.get().getClientAddress().getTemp_country()));


                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("TEMPORARY PROVINCE");
                table.addCell((clientDetails.get().getClientAddress().getTemp_province()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("TEMPORARY DISTRICT");
                table.addCell((clientDetails.get().getClientAddress().getTemp_district()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("TEMPORARY MUNICIPALITY");
                table.addCell((clientDetails.get().getClientAddress().getTemp_mun()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("TEMPORARY WARD NO");
                table.addCell((clientDetails.get().getClientAddress().getTemp_ward()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("TEMPORARY TOLE");
                table.addCell((clientDetails.get().getClientAddress().getTemp_tole()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("TELEPHONE NO");
                table.addCell((clientDetails.get().getClientAddress().getTelephone_no()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("E-MAIL");
                table.addCell((clientDetails.get().getClientAddress().getEmail()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("MOBILE NO");
                table.addCell((clientDetails.get().getClientAddress().getMobile_no()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("PERMANENT COUNTRY");
                table.addCell((clientDetails.get().getClientAddress().getPer_country()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("PERMANENT PROVINCE");
                table.addCell((clientDetails.get().getClientAddress().getPer_province()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("PERMANENT DISTRICT");
                table.addCell((clientDetails.get().getClientAddress().getPer_district()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("PERMANENT MUNICIPALITY");
                table.addCell((clientDetails.get().getClientAddress().getPer_mun()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("PERMANENT WARD");
                table.addCell((clientDetails.get().getClientAddress().getPer_ward()));

                hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(hcell);
                table.addCell("PERMANENT TOLE");
                table.addCell((clientDetails.get().getClientAddress().getPer_tole()));

            PdfPCell cell2=new PdfPCell(new Paragraph("FAMILY AND BANK DETAILS"));
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setBackgroundColor(BaseColor.ORANGE);
            table.addCell(cell2);

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("FAMILY NAME");
            table.addCell((clientDetails.get().getBankDetails().getFamily_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("RELATION WITH FAMILY MEMBERS");
            table.addCell((clientDetails.get().getBankDetails().getRelation()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("ACCOUNT NUMBER");
            table.addCell((clientDetails.get().getBankDetails().getAccount_no()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("ADDRESS OF BANK");
            table.addCell((clientDetails.get().getBankDetails().getName_and_address_bank()));

            PdfPCell cell3=new PdfPCell(new Paragraph("OCCUPATION DETAILS"));
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setBackgroundColor(BaseColor.ORANGE);
            table.addCell(cell3);

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("OCCUPATION TYPE");
            table.addCell((clientDetails.get().getOcccupationDetail().getOccupation_type().toString()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("OCCUPATION NAME");
            table.addCell((clientDetails.get().getOcccupationDetail().getOccupation_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("BUSINESS TYPE");
            table.addCell((clientDetails.get().getOcccupationDetail().getBusiness_type().toString()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("BUSINESS NAME");
            table.addCell((clientDetails.get().getOcccupationDetail().getBusiness_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("FINANCIAL DETAILS");
            table.addCell((clientDetails.get().getOcccupationDetail().getFinancial_details().getDisplay()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("ORGANIZATION NAME");
            table.addCell((clientDetails.get().getOcccupationDetail().getOrganization_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("ADDRESS");
            table.addCell((clientDetails.get().getOcccupationDetail().getAddress()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("DESIGNATION");
            table.addCell((clientDetails.get().getOcccupationDetail().getDesignation()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("EMPLOYEE ID");
            table.addCell((clientDetails.get().getOcccupationDetail().getEmployee_id()));


            PdfPCell cell4=new PdfPCell(new Paragraph("TRANSACTION DETAILS"));
            cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell4.setBackgroundColor(BaseColor.ORANGE);
            table.addCell(cell4);

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("INCOME TYPE");
            table.addCell((clientDetails.get().getTransactionDetails().getIncome_type().toString()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("OTHER TRANSACTION  IN BROKERAGE COMPANY");
            table.addCell((clientDetails.get().getTransactionDetails().getBoolean_type().toString()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("COMPANY NAME");
            table.addCell((clientDetails.get().getTransactionDetails().getCompany()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("CUSTOMER CODE");
            table.addCell((clientDetails.get().getTransactionDetails().getCustomer_code()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("DEBT INFORMATION");
            table.addCell((clientDetails.get().getTransactionDetails().getDebt_information().toString()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("INVOLVEMENT OF INVESTMENT COMPANIES");
            table.addCell((clientDetails.get().getTransactionDetails().getInvestment_companies().toString()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("NAME INVESTMENT COMPANIES");
            table.addCell((clientDetails.get().getTransactionDetails().getInvestment_company_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("DESIGNATION");
            table.addCell((clientDetails.get().getTransactionDetails().getDesignation().toString()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("If Others,then Mention Name of Designation");
            table.addCell((clientDetails.get().getTransactionDetails().getDesignation_name()));

            PdfPCell cell5=new PdfPCell(new Paragraph("REHABILITATED DETAILS"));
            cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell5.setBackgroundColor(BaseColor.ORANGE);
            table.addCell(cell5);

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("HOUSEHOLD Name");
            table.addCell((clientDetails.get().getRehabilitatedDetails().getHouse_hold_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("TELEPHONE NO");
            table.addCell((clientDetails.get().getRehabilitatedDetails().getTelephone_no()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("MOBILE NO");
            table.addCell((clientDetails.get().getRehabilitatedDetails().getMobile_no()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("DISTRICT");
            table.addCell((clientDetails.get().getRehabilitatedDetails().getDistrict_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("VDC");
            table.addCell((clientDetails.get().getRehabilitatedDetails().getVdc_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("WARD NO");
            table.addCell((clientDetails.get().getRehabilitatedDetails().getWard_no()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("TOLE");
            table.addCell((clientDetails.get().getRehabilitatedDetails().getTole_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("HOUSEHOLD NO ");
            table.addCell((clientDetails.get().getRehabilitatedDetails().getHouse_no()));

            PdfPCell cell6=new PdfPCell(new Paragraph("GUARDIAN DETAILS"));
            cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell6.setBackgroundColor(BaseColor.ORANGE);
            table.addCell(cell6);

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("FULL NAME");
            table.addCell((clientDetails.get().getGuardianDetails().getName()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("RELATIONSHIP");
            table.addCell((clientDetails.get().getGuardianDetails().getRelation().toString()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("CORRESPONDANCE ADDRESS");
            table.addCell((clientDetails.get().getGuardianDetails().getCorrespondance_address()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("COUNTRY");
            table.addCell((clientDetails.get().getGuardianDetails().getCountry()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("PROVINCE");
            table.addCell((clientDetails.get().getGuardianDetails().getProvince()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("DISTRICT");
            table.addCell((clientDetails.get().getGuardianDetails().getDistrict()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("MUNICIPALITY");
            table.addCell((clientDetails.get().getGuardianDetails().getMunicipality()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("WARD NO");
            table.addCell((clientDetails.get().getGuardianDetails().getWard_no()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("TELEPHONE NO");
            table.addCell((clientDetails.get().getGuardianDetails().getTelephone_no()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("FAX NO");
            table.addCell((clientDetails.get().getGuardianDetails().getFax_no()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("MOBILE NO");
            table.addCell((clientDetails.get().getGuardianDetails().getMobile_no()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("PAN NO");
            table.addCell((clientDetails.get().getGuardianDetails().getPan_no()));


            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("EMAIL");
            table.addCell((clientDetails.get().getGuardianDetails().getEmail()));

//            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            table.addCell(hcell);
//            table.addCell("GUARDIAN SIGNATURE");
//            table.addCell((clientDetails.get().getGuardianDetails().getImages()));


            PdfPCell cell7=new PdfPCell(new Paragraph("ADDITIONAL DETAILS"));
            cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell7.setBackgroundColor(BaseColor.ORANGE);
            table.addCell(cell7);

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("HIGH-RANKING PERSON");
            table.addCell((clientDetails.get().getAdditionalDetails().getPolitical().toString()));


            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("IF YES,then Mention concerned HIGH-RANKING PERSON NAME");
            table.addCell((clientDetails.get().getAdditionalDetails().getPolitical_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("Relationship with you");
            table.addCell((clientDetails.get().getAdditionalDetails().getPolitical_relation()));


            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("HAVING BENEFICIARY?");
            table.addCell((clientDetails.get().getAdditionalDetails().getBeneficary().toString()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("If yes,then Mention Name of beneficary:");
            table.addCell((clientDetails.get().getAdditionalDetails().getBeneficary_name()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("Relationship with you");
            table.addCell((clientDetails.get().getAdditionalDetails().getPolitical_relation()));

            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("convicted of a felony in the past?");
            table.addCell((clientDetails.get().getAdditionalDetails().getFelony().toString()));




            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(hcell);
            table.addCell("if there are offenses as per clause 2 of section 2 of the Asset Forfeiture Details Act 2064");
            table.addCell((clientDetails.get().getAdditionalDetails().getOffenses()));

//            hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
//            table.addCell(hcell);
//            table.addCell("Client's Signature");
//            table.addCell((clientDetails.get().getAdditionalDetails().getImages()));



















































            PdfWriter.getInstance(document, out);
            document.open();
            document.add(table);
           document.close();

        }
        catch (DocumentException ex) {

            Logger.getLogger(GeneratePdfReport.class.getName()).log(Level.SEVERE, null, ex);
        }

        return new ByteArrayInputStream(out.toByteArray());
    }
}