package com.ganesh.application.Controller;

import com.ganesh.application.Model.ClientDetails;
import com.ganesh.application.Model.Broker;
import com.ganesh.application.Model.ClientDetails;
import com.ganesh.application.Model.Countries;
import com.ganesh.application.Repository.*;
import com.ganesh.application.utils.enums.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;


@Controller
public class BrokerController {

    private static Logger logger = LoggerFactory.getLogger(BrokerController.class);

    @Autowired
    private ClientDetailsRepository clientDetailsRepository;

    @Autowired
    private BankRepository bankRepository;

    @Autowired
    private CountriesRepository countriesRepository;

    @Autowired
    private DistrictRepository districtRepository;


    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private BrokerRepositry brokerRepositry;



    //To show DetailsPart
    @GetMapping("/broker")
    public ModelAndView showClientDetailsForm(ModelAndView modelAndView, ClientDetails clientDetails, Broker broker, Countries countries) {
//       TO GET A LIST ALLL THE COUNTRIES,PROVINCE,DISTRICT AND ADD IT TO THE MODEL AND VIEW AS AN OBJECT

//        ModelAndView mv = new ModelAndView();

        modelAndView.addObject("countries", countriesRepository.findAll());
        modelAndView.addObject("provinces", provinceRepository.findAll());
        modelAndView.addObject("districties", districtRepository.findAll());
        modelAndView.addObject("brokerList", brokerRepositry.findAll());


        modelAndView.addObject("clientDetails", clientDetails);
        modelAndView.addObject("broker", broker);

        //Yesari patuneee
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
        modelAndView.addObject("accountTypeList", AccountType.values());
        modelAndView.addObject("citizenshipList", CitizenShipType.values());
        modelAndView.addObject("passportList", PassportType.values());
        modelAndView.addObject("educationalList", EducationalType.values());
        modelAndView.addObject("titleTypeList", TitleType.values());
        modelAndView.setViewName("broker");
        return modelAndView;
    }


    //Process input data to kyc form

    //get the brokerid from input hidden field

    @PostMapping("/saveBrokerDetail")
    public ModelAndView saveClientDetail(@Valid @ModelAttribute("clientDetails") ClientDetails clientDetails, BindingResult bindingResult, ModelMap model, @RequestParam("pic") MultipartFile pic) throws IOException {
        ModelAndView mv = new ModelAndView();
        logger.info("Save detail controlled called ..");
//        mv.setViewName("PdfGenerator");
        clientDetails.setPic(pic.getBytes());
//        clientDetails.getGuardianDetails().setImages(pic.getBytes());
//        clientDetails.getAdditionalDetails().setImages(pic.getBytes());
        mv.addObject("message", "Kyc Form has been submitted");
        clientDetailsRepository.save(clientDetails);
        mv.setViewName("BrokerPdfGenerator");

//        System.out.println(id);
        //Pass the broker id


        //After save
        List<ClientDetails> clientDetails2 = clientDetailsRepository.findTopByOrderByBroker_nameDesc();
        for (ClientDetails clientDetails1 : clientDetails2)
        {
            String broker = clientDetails1.getBroker_name();
            System.out.println(broker);
            mv.addObject("broker_name", broker);
        }
        List<ClientDetails> clientDetails3 = clientDetailsRepository.findTopByOrderByIdDesc();


        for (ClientDetails clientDetails4 : clientDetails3)
        {
            Integer brokerId = clientDetails4.getId();
            System.out.println(brokerId);
            mv.addObject("brokerId", brokerId);
        }
        logger.info("data saved ..");
        return mv;
    }


//    @RequestMapping(value = "/pdfreport/{id}", method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_PDF_VALUE)
//    public ResponseEntity<InputStreamResource> clientReport(@PathVariable("id") Integer id) throws IOException {
//        Optional<ClientDetails> clientDetails = (Optional<ClientDetails>) clientDetailsRepository.findById(id);
//        ByteArrayInputStream bis = GeneratePdfReport.clientReport(clientDetails);
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Disposition", "inline; filename=clientreport.pdf");
//
//        return ResponseEntity
//                .ok()
//                .headers(headers)
//                .contentType(MediaType.APPLICATION_PDF)
//                .body(new InputStreamResource(bis));
//    }


    @GetMapping("/brokerpdf/{id}/{broker_name}")//catch broker id in this function either pathvariable or requetparam accordingly
    public ModelAndView getPdfForm(ModelAndView modelAndView,@PathVariable("broker_name") String broker_name, @PathVariable("id") Integer id) {

//        Optional<ClientDetails> clientDetails = clientDetailsRepository.findById(id);
        Optional<ClientDetails> clientDetails = clientDetailsRepository.findTopByOrderByBroker_nameAndIdDesc(id,broker_name);
        String image = getImgData(clientDetails.get().getPic());
        modelAndView.addObject("image", image);

//        String image1 = getImgData(clientDetails.get().getGuardianDetails().getImages());
//        modelAndView.addObject("image1", image1);
//
//        String image2 = getImgData(clientDetails.get().getAdditionalDetails().getImages());
//        modelAndView.addObject("image2", image2);


        modelAndView.addObject("clientDetails", clientDetails);
        if(broker_name.equals("Siprabi"))
        {

            modelAndView.setViewName("pdfkyc");
        }
        if(broker_name.equals("Nalta"))
        {

            modelAndView.setViewName("pdfkyc");
        }


        return modelAndView;
    }

    public String getImgData(byte[] byteData) {
        return Base64.getMimeEncoder().encodeToString(byteData);
    }
}










