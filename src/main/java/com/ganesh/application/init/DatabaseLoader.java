package com.ganesh.application.init;


import com.ganesh.application.Model.BankName;
import com.ganesh.application.Model.Countries;
import  com.ganesh.application.Model.District;
import  com.ganesh.application.Model.Province;
import com.ganesh.application.Repository.BankNameRepository;
import com.ganesh.application.Repository.CountriesRepository;
import  com.ganesh.application.Repository.DistrictRepository;
import  com.ganesh.application.Repository.ProvinceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(DatabaseLoader.class);

    @Autowired
    private CountriesRepository countriesRepository;
    @Autowired
    private ProvinceRepository provinceRepository;


    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private BankNameRepository bankNameRepository;


    @Override
    public void run(String... args) throws Exception {
        createCountry();
        createProvince();
        createDistrict();
        createBankName();


    }

    public String createCountry() {
        logger.info("Loading data from  CountryDatabaseLoader.....");
        if (countriesRepository.count() == 0) {
            countriesRepository.saveAndFlush(new Countries("Af", "Afghanistan", "Afghan"));
            countriesRepository.saveAndFlush(new Countries("AL", "Albania", "Albanian"));
            countriesRepository.saveAndFlush(new Countries("AX", "Aland Islands", "Aland Islander"));
            countriesRepository.saveAndFlush(new Countries("DZ", "Algeria", "Algerian"));
            countriesRepository.saveAndFlush(new Countries("AS", "American Samoa", "American Samoan"));
            countriesRepository.saveAndFlush(new Countries("AD", "Andorra", "Andorran"));
            countriesRepository.saveAndFlush(new Countries("AO", "Angola", "Angolan"));
            countriesRepository.saveAndFlush(new Countries("AI", "Anguilla", "Anguillan"));
            countriesRepository.saveAndFlush(new Countries("AQ", "Antarctica", "Antarctican"));
            countriesRepository.saveAndFlush(new Countries("AG", "Antigua and Barbuda", "Antiguan"));
            countriesRepository.saveAndFlush(new Countries("AR", "Argentina", "Argentinian"));
            countriesRepository.saveAndFlush(new Countries("AM", "Armenia", "Armenian"));
            countriesRepository.saveAndFlush(new Countries("AW", "Aruba", "Aruban"));
            countriesRepository.saveAndFlush(new Countries("AU", "Australia", "Australian"));
            countriesRepository.saveAndFlush(new Countries("AT", "Austria", "Austrian"));
            countriesRepository.saveAndFlush(new Countries("AZ", "Azerbaijan", "Azerbaijani"));
            countriesRepository.saveAndFlush(new Countries("BS", "Bahamas", "Bahamian"));
            countriesRepository.saveAndFlush(new Countries("BH", "Bahrain", "Bahraini"));
            countriesRepository.saveAndFlush(new Countries("BD", "Bangladesh", "Bangladeshi"));
            countriesRepository.saveAndFlush(new Countries("BB", "Barbados", "Barbadian"));
            countriesRepository.saveAndFlush(new Countries("BY", "Belarus", "Belarusian"));
            countriesRepository.saveAndFlush(new Countries("BE", "Belgium", "Belgian"));
            countriesRepository.saveAndFlush(new Countries("BZ", "Belize", "Belizean"));
            countriesRepository.saveAndFlush(new Countries("BJ", "Benin", "Beninese"));
            countriesRepository.saveAndFlush(new Countries("BL", "Saint Barhelemy", "Saint Barthelmian"));
            countriesRepository.saveAndFlush(new Countries("BM", "Bermuda", "Bermudan"));
            countriesRepository.saveAndFlush(new Countries("BT", "Bhutan", "Bhutanese"));
//                                                                                                                                        countriesRepository.save(countriesRepository.save(new Countries));
            countriesRepository.saveAndFlush(new Countries("BW", "Botswana", "Botswanan"));
            countriesRepository.saveAndFlush(new Countries("BV", "Bouvet Island", "Bouvetian"));
            countriesRepository.saveAndFlush(new Countries("BR", "Brazil", "Brazilian"));
            countriesRepository.saveAndFlush(new Countries("BN", "Brunei Darussalam", "Bruneian"));
            countriesRepository.saveAndFlush(new Countries("BG", "Bulgaria", "Bulgarian"));
            countriesRepository.saveAndFlush(new Countries("BF", "Burkina Faso", "Burkinabe"));
            countriesRepository.saveAndFlush(new Countries("BI", "Burundi", "Burundian"));
            countriesRepository.saveAndFlush(new Countries("KH", "Cambodia", "Cambodian"));
            countriesRepository.saveAndFlush(new Countries("CM", "Cameroon", "Cameroonian"));
            countriesRepository.saveAndFlush(new Countries("CA", "Canada", "Canadian"));
            countriesRepository.saveAndFlush(new Countries("CV", "Cape Verde", "Cape Verdean"));
            countriesRepository.saveAndFlush(new Countries("KY", "Cayman Islands", "Caymanian"));
            countriesRepository.saveAndFlush(new Countries("CF", "Central African Republic", "Central African"));
            countriesRepository.saveAndFlush(new Countries("TD", "Chad", "Chadian"));
            countriesRepository.saveAndFlush(new Countries("CL", "Chile", "Chilean"));
            countriesRepository.saveAndFlush(new Countries("CN", "China", "Chinese"));
            countriesRepository.saveAndFlush(new Countries("CX", "Christmas Island", "Christmas Islander"));
            countriesRepository.saveAndFlush(new Countries("CC", "Cocos (Keeling) Islands", "Cocos Islander"));
            countriesRepository.saveAndFlush(new Countries("CO", "Colombia", "Colombian"));
            countriesRepository.saveAndFlush(new Countries("KM", "Comoros", "Comorian"));
            countriesRepository.saveAndFlush(new Countries("CG", "Congo", "Congolese"));
            countriesRepository.saveAndFlush(new Countries("CK", "Cook Islands", "Cook Islander"));
            countriesRepository.saveAndFlush(new Countries("CR", "Costa Rica", "Costa Rican"));
            countriesRepository.saveAndFlush(new Countries("HR", "Croatia", "Croatian"));
            countriesRepository.saveAndFlush(new Countries("CU", "Cuba", "Cuban"));
            countriesRepository.saveAndFlush(new Countries("CY", "Cyprus", "Cypriot"));
            countriesRepository.saveAndFlush(new Countries("CW", "Curaçao", "Curacian"));
            countriesRepository.saveAndFlush(new Countries("CZ", "Czech Republic", "Czech"));
            countriesRepository.saveAndFlush(new Countries("DK", "Denmark", "Danish"));
            countriesRepository.saveAndFlush(new Countries("DJ", "Djibouti", "Djiboutian"));
            countriesRepository.saveAndFlush(new Countries("DM", "Dominica", "Dominican"));
            countriesRepository.saveAndFlush(new Countries("DO", "Dominican Republic", "Dominican"));
            countriesRepository.saveAndFlush(new Countries("EC", "Ecuador", "Ecuadorian"));
            countriesRepository.saveAndFlush(new Countries("EG", "Egypt", "Egyptian"));
            countriesRepository.saveAndFlush(new Countries("SV", "El Salvador", "Salvadoran"));
            countriesRepository.saveAndFlush(new Countries("GQ", "Equatorial Guinea", "Equatorial Guinean"));
            countriesRepository.saveAndFlush(new Countries("ER", "Eritrea", "Eritrean"));
            countriesRepository.saveAndFlush(new Countries("EE", "Estonia", "Estonian"));
            countriesRepository.saveAndFlush(new Countries("ET", "Ethiopia", "Ethiopian"));
            countriesRepository.saveAndFlush(new Countries("FK", "Falkland Islands (Malvinas)", "Falkland Islander"));
            countriesRepository.saveAndFlush(new Countries("FO", "Faroe Islands", "Faroese"));
            countriesRepository.saveAndFlush(new Countries("FJ", "Fiji", "Fijian"));
            countriesRepository.saveAndFlush(new Countries("FI", "Finland", "Finnish"));
            countriesRepository.saveAndFlush(new Countries("FR", "France", "French"));
            countriesRepository.saveAndFlush(new Countries("GF", "French Guiana", "French Guianese"));
            countriesRepository.saveAndFlush(new Countries("PF", "French Polynesia", "French Polynesian"));
            countriesRepository.saveAndFlush(new Countries("TF", "French Southern and Antarctic Lands", "French"));
            countriesRepository.saveAndFlush(new Countries("GA", "Gabon", "Gabonese"));
            countriesRepository.saveAndFlush(new Countries("GM", "Gambia", "Gambian"));
            countriesRepository.saveAndFlush(new Countries("GE", "Georgia", "Georgian"));
            countriesRepository.saveAndFlush(new Countries("DE", "Germany", "German"));
            countriesRepository.saveAndFlush(new Countries("GH", "Ghana", "Ghanaian"));
            countriesRepository.saveAndFlush(new Countries("GI", "Gibraltar", "Gibraltar"));
            countriesRepository.saveAndFlush(new Countries("GG", "Guernsey", "Guernsian"));
            countriesRepository.saveAndFlush(new Countries("GR", "Greece", "Greek"));
            countriesRepository.saveAndFlush(new Countries("GL", "Greenland", "Greenlandic"));
            countriesRepository.saveAndFlush(new Countries("GD", "Grenada", "Grenadian"));
            countriesRepository.saveAndFlush(new Countries("GP", "Guadeloupe", "Guadeloupe"));
            countriesRepository.saveAndFlush(new Countries("GU", "Guam", "Guamanian"));
            countriesRepository.saveAndFlush(new Countries("GT", "Guatemala", "Guatemalan"));
            countriesRepository.saveAndFlush(new Countries("GN", "Guinea", "Guinean"));
            countriesRepository.saveAndFlush(new Countries("GW", "Guinea-Bissau", "Guinea-Bissauan"));
            countriesRepository.saveAndFlush(new Countries("GY", "Guyana", "Guyanese"));
            countriesRepository.saveAndFlush(new Countries("HT", "Haiti", "Haitian"));
            countriesRepository.saveAndFlush(new Countries("HM", "Heard and Mc Donald Islands", "Heard and Mc Donald Islanders"));
            countriesRepository.saveAndFlush(new Countries("HN", "Honduras", "Honduran"));
            countriesRepository.saveAndFlush(new Countries("HK", "Hong Kong", "Hongkongese"));
            countriesRepository.saveAndFlush(new Countries("HU", "Hungary", "Hungarian"));
            countriesRepository.saveAndFlush(new Countries("IS", "Iceland", "Icelandic"));
            countriesRepository.saveAndFlush(new Countries("IN", "India", "Indian"));
            countriesRepository.saveAndFlush(new Countries("IM", "Isle of Man", "Manx"));
            countriesRepository.saveAndFlush(new Countries("ID", "Indonesia", "Indonesian"));
            countriesRepository.saveAndFlush(new Countries("IR", "Iran", "Iranian"));
            countriesRepository.saveAndFlush(new Countries("IQ", "Iraq", "Iraqi"));
            countriesRepository.saveAndFlush(new Countries("IE", "Ireland", "Irish"));
            countriesRepository.saveAndFlush(new Countries("IL", "Israel", "Israeli"));
            countriesRepository.saveAndFlush(new Countries("IT", "Italy", "Italian"));
            countriesRepository.saveAndFlush(new Countries("CI", "Ivory Coast", "Ivory Coastian"));
            countriesRepository.saveAndFlush(new Countries("JE", "Jersey", "Jersian"));
            countriesRepository.saveAndFlush(new Countries("JM", "Jamaica", "Jamaican"));
            countriesRepository.saveAndFlush(new Countries("JP", "Japan", "Japanese"));
            countriesRepository.saveAndFlush(new Countries("JO", "Jordan", "Jordanian"));
            countriesRepository.saveAndFlush(new Countries("KZ", "Kazakhstan", "Kazakh"));
            countriesRepository.saveAndFlush(new Countries("KE", "Kenya", "Kenyan"));
            countriesRepository.saveAndFlush(new Countries("KI", "Kiribati", "I-Kiribati"));
            countriesRepository.saveAndFlush(new Countries("KP", "Korea(North Korea)", "North Korean"));
            countriesRepository.saveAndFlush(new Countries("KR", "Korea(South Korea)", "South Korean"));
            countriesRepository.saveAndFlush(new Countries("XK", "Kosovo", "Kosovar"));
            countriesRepository.saveAndFlush(new Countries("KW", "Kuwait", "Kuwaiti"));
            countriesRepository.saveAndFlush(new Countries("KG", "Kyrgyzstan", "Kyrgyzstani"));
            countriesRepository.saveAndFlush(new Countries("LA", "Lao PDR", "Laotian"));
            countriesRepository.saveAndFlush(new Countries("LV", "Latvia", "Latvian"));
            countriesRepository.saveAndFlush(new Countries("LB", "Lebanon", "Lebanese"));
            countriesRepository.saveAndFlush(new Countries("LS", "Lesotho", "Basotho"));
            countriesRepository.saveAndFlush(new Countries("LR", "Liberia", "Liberian"));
            countriesRepository.saveAndFlush(new Countries("LY", "Libya", "Libyan"));
            countriesRepository.saveAndFlush(new Countries("LI", "Liechtenstein", "Liechtenstein"));
            countriesRepository.saveAndFlush(new Countries("LT", "Lithuania", "Lithuanian"));
            countriesRepository.saveAndFlush(new Countries("LU", "Luxembourg", "Luxembourger"));
            countriesRepository.saveAndFlush(new Countries("LK", "Sri Lanka", "Sri Lankian"));
            countriesRepository.saveAndFlush(new Countries("MO", "Macau", "Macanese"));
            countriesRepository.saveAndFlush(new Countries("MK", "Macedonia", "Macedonian"));
            countriesRepository.saveAndFlush(new Countries("MG", "Madagascar", "Malagasy"));
            countriesRepository.saveAndFlush(new Countries("MW", "Malawi", "Malawian"));
            countriesRepository.saveAndFlush(new Countries("MY", "Malaysia", "Malaysian"));
            countriesRepository.saveAndFlush(new Countries("MV", "Maldives", "Maldivian"));
            countriesRepository.saveAndFlush(new Countries("ML", "Mali", "Malian"));
            countriesRepository.saveAndFlush(new Countries("MT", "Malta", "Maltese"));
            countriesRepository.saveAndFlush(new Countries("MH", "Marshall Islands", "Marshallese"));
            countriesRepository.saveAndFlush(new Countries("MQ", "Martinique", "Martiniquais"));
            countriesRepository.saveAndFlush(new Countries("MR", "Mauritania", "Mauritanian"));
            countriesRepository.saveAndFlush(new Countries("MU", "Mauritius", "Mauritian"));
            countriesRepository.saveAndFlush(new Countries("YT", "Mayotte", "Mahoran"));
            countriesRepository.saveAndFlush(new Countries("MX", "Mexico", "Mexican"));
            countriesRepository.saveAndFlush(new Countries("FM", "Micronesia", "Micronesian"));
            countriesRepository.saveAndFlush(new Countries("MD", "Moldova", "Moldovan"));
            countriesRepository.saveAndFlush(new Countries("MC", "Monaco", "Monacan"));
            countriesRepository.saveAndFlush(new Countries("MN", "Mongolia", "Mongolian"));
            countriesRepository.saveAndFlush(new Countries("ME", "Montenegro", "Montenegrin"));
            countriesRepository.saveAndFlush(new Countries("MS", "Montserrat", "Montserratian"));
            countriesRepository.saveAndFlush(new Countries("MA", "Morocco", "Moroccan"));
            countriesRepository.saveAndFlush(new Countries("MZ", "Mozambique", "Mozambican"));
            countriesRepository.saveAndFlush(new Countries("MM", "Myanmar", "Myanmarian"));
            countriesRepository.saveAndFlush(new Countries("NA", "Namibia", "Naibian"));
            countriesRepository.saveAndFlush(new Countries("NR", "Nauru", "Nauruan"));
            countriesRepository.saveAndFlush(new Countries("NP", "Nepal", "Nepalese"));
            countriesRepository.saveAndFlush(new Countries("NZ", "New Zealand", "New Zealander"));
            countriesRepository.saveAndFlush(new Countries("NI", "Nicaragua", "Nicaraguan"));
            countriesRepository.saveAndFlush(new Countries("NE", "Niger", "Nigerien"));
            countriesRepository.saveAndFlush(new Countries("NG", "Nigeria", "Nigerian"));
            countriesRepository.saveAndFlush(new Countries("NU", "Niue", "Niuean"));
            countriesRepository.saveAndFlush(new Countries("NF", "Norfolk Island", "Norfolk Islander"));
            countriesRepository.saveAndFlush(new Countries("MP", "Northern Mariana Islands", "Northern Marianan"));
            countriesRepository.saveAndFlush(new Countries("NO", "Norway", "Norwegian"));
            countriesRepository.saveAndFlush(new Countries("OM", "Oman", "Omani"));
            countriesRepository.saveAndFlush(new Countries("PK", "Pakistan", "Pakistani"));
            countriesRepository.saveAndFlush(new Countries("PW", "Palau", "Palauan"));
            countriesRepository.saveAndFlush(new Countries("PS", "Palestine", "Palestinian"));
            countriesRepository.saveAndFlush(new Countries("PA", "Panama", "Panamanian"));
            countriesRepository.saveAndFlush(new Countries("PG", "Papua New Guinea", "Papua New Guinean"));
            countriesRepository.saveAndFlush(new Countries("PY", "Paraguay", "Paraguayan"));
            countriesRepository.saveAndFlush(new Countries("PE", "Peru", "Peruvian"));
            countriesRepository.saveAndFlush(new Countries("PH", "Philippines", "Filipino"));
            countriesRepository.saveAndFlush(new Countries("PN", "Pitcairn", "Pitcairn Islander"));
            countriesRepository.saveAndFlush(new Countries("PL", "Poland", "Polish"));
            countriesRepository.saveAndFlush(new Countries("PT", "Portugal", "Portuguese"));
            countriesRepository.saveAndFlush(new Countries("PR", "Puerto Rico", "Puerto Rican"));
            countriesRepository.saveAndFlush(new Countries("QA", "Qatar", "Qatari"));
            countriesRepository.saveAndFlush(new Countries("RE", "Reunion Island", "Reunionese"));
            countriesRepository.saveAndFlush(new Countries("RO", "Romania", "Romanian"));
            countriesRepository.saveAndFlush(new Countries("RU", "Russian", "Russian"));
            countriesRepository.saveAndFlush(new Countries("RW", "Rwanda", "Rwandan"));
            countriesRepository.saveAndFlush(new Countries("KN", "Saint Kitts and Nevis", "Kittitian/Nevisian"));
            countriesRepository.saveAndFlush(new Countries("MF", "Saint Martin (French part)", "St. Martian(French)"));
            countriesRepository.saveAndFlush(new Countries("SX", "Sint Maarten (Dutch part)", "St. Martian(Dutch)"));
            countriesRepository.saveAndFlush(new Countries("LC", "Saint Pierre and Miquelon", "St. Pierre and Miquelon"));
            countriesRepository.saveAndFlush(new Countries("VC", "Saint Vincent and the Grenadines", "Saint Vincent and the Grenadines"));
            countriesRepository.saveAndFlush(new Countries("WS", "Samoa", "Samoan"));
            countriesRepository.saveAndFlush(new Countries("SM", "San Marino", "Sammarinese"));
            countriesRepository.saveAndFlush(new Countries("ST", "Sao Tome and Principe", "Sao Tomean"));
            countriesRepository.saveAndFlush(new Countries("SA", "Saudi Arabia", "Saudi Arabian"));
            countriesRepository.saveAndFlush(new Countries("SN", "Senegal", "Senegalese"));
            countriesRepository.saveAndFlush(new Countries("RS", "Serbia", "Serbian"));
            countriesRepository.saveAndFlush(new Countries("SC", "Seychelles", "Seychellois"));
            countriesRepository.saveAndFlush(new Countries("SL", "Sierra Leone", "Sierra Leonean"));
            countriesRepository.saveAndFlush(new Countries("SG", "Singapore", "Singaporean"));
            countriesRepository.saveAndFlush(new Countries("SK", "Slovakia", "Slovak"));

            countriesRepository.saveAndFlush(new Countries("SI", "Slovenia", "Slovenian"));
            countriesRepository.saveAndFlush(new Countries("SB", "Solomon Islands", "Solomon Island"));
            countriesRepository.saveAndFlush(new Countries("SO", "Somalia", "Somali"));
            countriesRepository.saveAndFlush(new Countries("ZA", "South Africa", "South African"));
            countriesRepository.saveAndFlush(new Countries("GS", "South Georgia and the South Sandwich", "South Georgia and the South Sandwich"));
            countriesRepository.saveAndFlush(new Countries("SS", "South Sudan", "South Sudanese"));
            countriesRepository.saveAndFlush(new Countries("ES", "Spain", "Spanish"));
            countriesRepository.saveAndFlush(new Countries("SH", "Saint Helena", "St. Helenian"));
            countriesRepository.saveAndFlush(new Countries("SD", "Sudan", "Sudanese"));
            countriesRepository.saveAndFlush(new Countries("SR", "Suriname", "Surinamese"));
            countriesRepository.saveAndFlush(new Countries("SJ", "Svalbard and Jan Mayen", "Svalbardian/Jan Mayenian"));
            countriesRepository.saveAndFlush(new Countries("SZ", "Swaziland", "Swazi"));
            countriesRepository.saveAndFlush(new Countries("SE", "Sweden", "Swedish"));
            countriesRepository.saveAndFlush(new Countries("CH", "Switzerland", "Swiss"));
            countriesRepository.saveAndFlush(new Countries("SY", "Syria", "Syrian"));
            countriesRepository.saveAndFlush(new Countries("TW", "Taiwan", "Taiwanese"));
            countriesRepository.saveAndFlush(new Countries("TJ", "Tajikistan", "Tajikistani"));
            countriesRepository.saveAndFlush(new Countries("TZ", "Tanzania", "Tanzanian"));
            countriesRepository.saveAndFlush(new Countries("TH", "Thailand", "Thai"));
            countriesRepository.saveAndFlush(new Countries("TG", "Togo", "Togolese"));
        } else {
            System.out.println("data already has been saved");
        }
        return "country save";

    }

    public String createProvince() {


        if (provinceRepository.count() == 0) {

            logger.info("Loading data from  province.....");
            provinceRepository.saveAndFlush(new Province("Province-1"));
            provinceRepository.saveAndFlush(new Province("Province-2"));
            provinceRepository.saveAndFlush(new Province("Province-3"));
            provinceRepository.saveAndFlush(new Province("Province-4"));
            provinceRepository.saveAndFlush(new Province("Province-5"));
            provinceRepository.saveAndFlush(new Province("Province-6"));
            provinceRepository.saveAndFlush(new Province("Province-7"));

        }
        else{
            System.out.println("province already saved");
        }
        return "province_saved";
    }


    public String createDistrict() {
        if (districtRepository.count() == 0) {
            logger.info("Loading data from  district.....");

            districtRepository.saveAndFlush(new District("achham"));
            districtRepository.saveAndFlush(new District("arghakhanchi"));
            districtRepository.saveAndFlush(new District("baglung"));
            districtRepository.saveAndFlush(new District("baitadi"));
            districtRepository.saveAndFlush(new District("bajhang"));
            districtRepository.saveAndFlush(new District("bajura"));
            districtRepository.saveAndFlush(new District("banke"));
            districtRepository.saveAndFlush(new District("bara"));
            districtRepository.saveAndFlush(new District("bardiya"));
            districtRepository.saveAndFlush(new District("bhaktapur"));
            districtRepository.saveAndFlush(new District("bhojpur"));
            districtRepository.saveAndFlush(new District("chitwan"));
            districtRepository.saveAndFlush(new District("dadeldhura"));
            districtRepository.saveAndFlush(new District("dailekh"));
            districtRepository.saveAndFlush(new District("dang deukhuri"));
            districtRepository.saveAndFlush(new District("darchula"));
            districtRepository.saveAndFlush(new District("dhading"));
            districtRepository.saveAndFlush(new District("dhankuta"));
            districtRepository.saveAndFlush(new District("dhanusa"));
            districtRepository.saveAndFlush(new District("dholkha"));
            districtRepository.saveAndFlush(new District("dolpa"));
            districtRepository.saveAndFlush(new District("doti"));
            districtRepository.saveAndFlush(new District("gorkha"));
            districtRepository.saveAndFlush(new District("gulmi"));
            districtRepository.saveAndFlush(new District("humla"));
            districtRepository.saveAndFlush(new District("ilam"));
            districtRepository.saveAndFlush(new District("jajarkot"));
            districtRepository.saveAndFlush(new District("jhapa"));
            districtRepository.saveAndFlush(new District("jumla"));
            districtRepository.saveAndFlush(new District("kailali"));
            districtRepository.saveAndFlush(new District("kalikot"));
            districtRepository.saveAndFlush(new District("kanchanpur"));
            districtRepository.saveAndFlush(new District("kapilvastu"));
            districtRepository.saveAndFlush(new District("kaski"));
            districtRepository.saveAndFlush(new District("kathmandu"));
            districtRepository.saveAndFlush(new District("kavrepalanchok"));
            districtRepository.saveAndFlush(new District("khotang"));
            districtRepository.saveAndFlush(new District("lalitpur"));
            districtRepository.saveAndFlush(new District("lamjung"));
            districtRepository.saveAndFlush(new District("mahottari"));
            districtRepository.saveAndFlush(new District("makwanpur"));
            districtRepository.saveAndFlush(new District("manang"));
            districtRepository.saveAndFlush(new District("morang"));
            districtRepository.saveAndFlush(new District("mugu"));
            districtRepository.saveAndFlush(new District("mustang"));
            districtRepository.saveAndFlush(new District("myagdi"));
            districtRepository.saveAndFlush(new District("nawalparasi"));
            districtRepository.saveAndFlush(new District("nuwakot"));
            districtRepository.saveAndFlush(new District("okhaldhunga"));
            districtRepository.saveAndFlush(new District ("palpa"));
            districtRepository.saveAndFlush(new District("panchthar"));
            districtRepository.saveAndFlush(new District("parbat"));
            districtRepository.saveAndFlush(new District("parsa"));
            districtRepository.saveAndFlush(new District("pyuthan"));
            districtRepository.saveAndFlush(new District("ramechhap"));
            districtRepository.saveAndFlush(new District("rasuwa"));
            districtRepository.saveAndFlush(new District("rautahat"));
            districtRepository.saveAndFlush(new District("rolpa"));
            districtRepository.saveAndFlush(new District("rukum"));
            districtRepository.saveAndFlush(new District("rupandehi"));
            districtRepository.saveAndFlush(new District("salyan"));
            districtRepository.saveAndFlush(new District("sankhuwasabha"));
            districtRepository.saveAndFlush(new District("saptari"));
            districtRepository.saveAndFlush(new District("sarlahi"));
            districtRepository.saveAndFlush(new District("sindhuli"));
            districtRepository.saveAndFlush(new District("sindhupalchok"));
            districtRepository.saveAndFlush(new District("siraha"));
            districtRepository.saveAndFlush(new District("solukhumbu"));
            districtRepository.saveAndFlush(new District("sunsari"));
            districtRepository.saveAndFlush(new District("surkhet"));
            districtRepository.saveAndFlush(new District("syangja"));
            districtRepository.saveAndFlush(new District("tanahu"));
            districtRepository.saveAndFlush(new District("taplejung"));
            districtRepository.saveAndFlush(new District("terhathum"));
            districtRepository.saveAndFlush(new District("udayapur"));

   } else {
            System.out.println("District already saved");
        }
        return "District_saved";
    }


    public String createBankName()
    {
        if (bankNameRepository.count() == 0) {
            logger.info("Loading data from  Bank.....");

            bankNameRepository.saveAndFlush(new BankName("Nepal Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Rastriya Banijya Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Nabil Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Nepal Investment Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Standard Chartered Bank Nepal Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Himalayan Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Nepal SBI Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Nepal Bangaladesh Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Everest Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Bank of Kathmandu Lumbini Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Nepal Credit and Commerce Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("NIC ASIA Bank Ltd. "));
            bankNameRepository.saveAndFlush(new BankName("Machhapuchhre Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Kumari Bank Ltd. "));
            bankNameRepository.saveAndFlush(new BankName("Laxmi Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Siddhartha Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Agriculture Development Bank Ltd. "));
            bankNameRepository.saveAndFlush(new BankName("Global IME Bank Ltd. "));
            bankNameRepository.saveAndFlush(new BankName("Citizens Bank International Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Prime Commercial Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Sunrise Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("NMB Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Prabhu Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Mega Bank Nepal "));
            bankNameRepository.saveAndFlush(new BankName("Civil Bank Ltd."));
            bankNameRepository.saveAndFlush(new BankName("Century Commercial Bank Ltd. "));
            bankNameRepository.saveAndFlush(new BankName("Sanima Bank Ltd."));
        }
        else {
            System.out.println("BankName already saved");
        }
        return "BankName_saved";
    }

}
