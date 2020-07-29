package com.ganesh.application.Controller;

import com.ganesh.application.Model.ClientDetails;
import com.ganesh.application.Model.Countries;
import com.ganesh.application.Repository.ClientDetailsRepository;
import com.ganesh.application.Repository.CountriesRepository;
import com.ganesh.application.Repository.DistrictRepository;
import com.ganesh.application.Repository.ProvinceRepository;
import com.ganesh.application.utils.GeneratePdfReport;
import com.ganesh.application.utils.enums.*;
import com.ganesh.application.utils.enums.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;


@Controller
public class ClientDetailsController {

    private static Logger logger = LoggerFactory.getLogger(ClientDetailsController.class);

    @Autowired
    private ClientDetailsRepository clientDetailsRepository;

//    @Autowired
//    private ClientDetailsService clientDetailsService;


    @Autowired
    private CountriesRepository countriesRepository;

    @Autowired
    private DistrictRepository districtRepository;


    @Autowired
    private ProvinceRepository provinceRepository;

    //To show DetailsPart
    @GetMapping("/")
    public ModelAndView showClientDetailsForm(ModelAndView modelAndView, ClientDetails clientDetails, Countries countries) {
//       TO GET A LIST ALLL THE COUNTRIES,PROVINCE,DISTRICT AND ADD IT TO THE MODEL AND VIEW AS AN OBJECT

        ModelAndView mv = new ModelAndView();

        // if (clientDetails.getBirth_date0() == null) {

        //     mv.addObject("message", "Please provide the birth date");
        // }

        modelAndView.addObject("countries", countriesRepository.findAll());
        modelAndView.addObject("provinces", provinceRepository.findAll());
        modelAndView.addObject("districties", districtRepository.findAll());


        modelAndView.addObject("clientDetails", clientDetails);
        modelAndView.addObject("genderList", Gender.values());
        modelAndView.addObject("maritalStatusList", MartialStatus.values());
        modelAndView.addObject("nationalityList", Nationality.values());
        modelAndView.addObject("occupationList", OccupationType.values());
        modelAndView.addObject("businessList", BusinessType.values());
        modelAndView.addObject("financialList", FinancialDetails.values());
        modelAndView.addObject("incomeList", IncomeType.values());
        modelAndView.addObject("booleanList", BooleanType.values());
        modelAndView.addObject("designationList", Designation.values());
        modelAndView.addObject("debtInformationList", DebtInformation.values());
        modelAndView.addObject("investmentCompaniesList", InvestmentCompanies.values());
        modelAndView.addObject("relationList", Relation.values());
        modelAndView.addObject("politicalList", Political.values());
        modelAndView.addObject("beneficaryList", Beneficary.values());
        modelAndView.addObject("felonyList", Felony.values());
        modelAndView.addObject("municipalityList", Municipality.values());
        modelAndView.setViewName("details");
        return modelAndView;
    }


    //Process input data to kyc form
    @PostMapping("/saveDetail")
    public ModelAndView saveClientDetail(@ModelAttribute("clientDetails") ClientDetails clientDetails) {
        ModelAndView mv = new ModelAndView();
        logger.info("Save detail controlled called ..");
//        mv.setViewName("PdfGenerator");
        mv.setViewName("PdfGenerator");
        clientDetailsRepository.saveAndFlush(clientDetails);
//        mv.addObject("message", "Kyc Form has been submitted");

        //After save
        List<ClientDetails> clientDetails2 = clientDetailsRepository.findTopByOrderByIdDesc();
        for (ClientDetails clientDetails1 : clientDetails2) {
            Integer clientDetailsId = clientDetails1.getId();
            mv.addObject("clientDetailsId", clientDetailsId);
        }
        logger.info("data saved ..");
        return mv;
    }





    @RequestMapping(value = "/pdfreport/{id}", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> clientReport(@PathVariable("id") Integer id) throws IOException {
        Optional<ClientDetails> clientDetails = (Optional<ClientDetails>) clientDetailsRepository.findById(id);
        ByteArrayInputStream bis = GeneratePdfReport.clientReport(clientDetails);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "inline; filename=clientreport.pdf");

        return ResponseEntity
                .ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }

//    @RequestMapping(value = "/pdfreport/{id}", method = RequestMethod.GET)
//    public String clientReport(@PathVariable("id") Integer id,Model model)
//    {
//        ClientDetails clientDetails=clientDetailsRepository.findById(id);
//        model.addAttribute("clientDetails",clientDetails);
//        return "update-notice";
//
//
//    }


}










