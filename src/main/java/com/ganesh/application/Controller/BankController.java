package com.ganesh.application.Controller;

import com.ganesh.application.Model.Bank;
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
public class BankController {
    private static Logger logger = LoggerFactory.getLogger(BankController.class);

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


    @GetMapping("/")
    public ModelAndView showSelectForm(ModelAndView modelAndView) {
        modelAndView.addObject("brokerList", BrokerFormType.values());
        modelAndView.addObject("bankList", BankFormType.values());
        modelAndView.addObject("kycList", KycType.values());
        modelAndView.setViewName("kycdropdown");
        return modelAndView;

    }

    @PostMapping("/selectForm")
    public String selectForm(@RequestParam("selectLevel") String selectLevel) {
        System.out.println("Inside select form");
        System.out.println(selectLevel);

//        System.out.println(selectSubject);

        if (selectLevel.equals("BROKER")) {

            return "redirect:/broker";

        } else if (selectLevel.equals("BANK")) {

            return "redirect:/bank";
        }

        return "redirect:/";
    }

    //To show DetailsPart
    @GetMapping("/bank")
    public ModelAndView showClientDetailsForm(ModelAndView modelAndView, ClientDetails clientDetails, Countries countries, Bank bank) {


        modelAndView.addObject("countries", countriesRepository.findAll());
        modelAndView.addObject("provinces", provinceRepository.findAll());
        modelAndView.addObject("districties", districtRepository.findAll());
        modelAndView.addObject("bankList", bankRepository.findAll());


        modelAndView.addObject("clientDetails", clientDetails);
        modelAndView.addObject("bank", bank);
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
        modelAndView.setViewName("bank");
        return modelAndView;
    }


    //Process input data to kyc form
    @PostMapping("/saveBankDetail")
    public ModelAndView saveBankDetail(@Valid @ModelAttribute("clientDetails") ClientDetails clientDetails, BindingResult bindingResult, ModelMap model, @RequestParam("pic") MultipartFile pic,@RequestParam("bank_name") String bank_name) throws IOException {
        ModelAndView mv = new ModelAndView();
        logger.info("Save detail controlled called ..");
        clientDetails.setPic(pic.getBytes());
        mv.addObject("message", "Kyc Form has been submitted");
        System.out.println(bank_name);

        clientDetailsRepository.save(clientDetails);
        mv.setViewName("BankPdfGenerator");




        //After save
        List<ClientDetails> clientDetails2 = clientDetailsRepository.findTopByOrderByBank_nameDesc();
        for (ClientDetails clientDetails1 : clientDetails2)
        {
            String bank = clientDetails1.getBank_name();
            System.out.println(bank);
            mv.addObject("bank_name", bank);
        }
        List<ClientDetails> clientDetails3 = clientDetailsRepository.findTopByOrderByIdDesc();


        for (ClientDetails clientDetails1 : clientDetails3)
        {

               Integer clientDetailsId = clientDetails1.getId();

            //Failed to convert value of type 'java.lang.String' to required type 'java.lang.Integer';
            System.out.println(clientDetailsId);

            mv.addObject("clientDetailsId",clientDetailsId);
        }

        logger.info("data saved ..");
        return mv;
    }


   @GetMapping("/bankpdf/{id}/{name}")
   public ModelAndView getBankPdfForm(ModelAndView modelAndView,@PathVariable("id") Integer id,@PathVariable("name") String name)
   {


//        Optional<ClientDetails> clientDetails=clientDetailsRepository.findByBank_name(bank_name);
//       Optional<ClientDetails> clientDetails=clientDetailsRepository.findByIdAndBank_name(id,bank_name);


       System.out.println(name);


//        Optional<ClientDetails> clientDetails = clientDetailsRepository.findByBank_name(bank_name);
       Optional<ClientDetails> clientDetails = clientDetailsRepository.findTopByOrderByBank_nameAndIdDesc(id,name);

//        String image = getImgData(clientDetails.get().getPic());
//        modelAndView.addObject("image", image);

        modelAndView.addObject("clientDetails", clientDetails);

       if(name.equals("Nepal Bank Ltd."))
       {

           modelAndView.setViewName("bankpdfkyc");
       }
       else if(name.equals("Rastriya Banijya Bank Ltd."))
       {

           modelAndView.setViewName("bankpdfkyc");
       }
        return modelAndView;
    }

    public String getImgData(byte[] byteData) {
        return Base64.getMimeEncoder().encodeToString(byteData);
 }

    }


