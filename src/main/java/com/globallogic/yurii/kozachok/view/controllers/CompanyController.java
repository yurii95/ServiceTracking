package com.globallogic.yurii.kozachok.view.controllers;

import com.globallogic.yurii.kozachok.view.common.TypeOfCompanies;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/companies")
public class CompanyController extends TypeOfCompanies {
    
    private static final String COMPANY_HOME_PAGE = "mainPageForCompany";
    private static final String USER_HOME_PAGE = "mainPageForUsers";
    private static final String REGISTRATION_COMPANY_PAGE = "registrationForCompany";

//	private CompanyService companyService;
//
//	private final static Logger logger = Logger.getLogger(CompanyController.class);
//
//	public CompanyService getCompanyService() {
//		return companyService;
//	}
//
//	@Autowired
//	public void setCompanyService(CompanyService companyService) {
//		this.companyService = companyService;
//	}
//
//	@RequestMapping(value = "/all", method = RequestMethod.GET)
//	public String showAllCompanies(ModelMap model) {
//		List<Company> resultList = companyService.getAllCompanies();
//	      for(Location location : resultList.get(0).getLocations()){
//	            System.out.println(location.getAddress());
//
//	      }
//		model.addAttribute("companiesList" , resultList);
//		return "CompaniesInfo";
//	}
//
//    @RequestMapping(value = "/hotels", method = RequestMethod.GET)
//    public String showHotels(ModelMap model) {
//        List<Company> resultList = companyService.getCompaniesByType(HOTEL);
//        model.addAttribute("companiesList", resultList);
//        return "CompaniesInfo";
//    }
//
//    @RequestMapping(value = "/markets", method = RequestMethod.GET)
//    public String showMarkets(ModelMap model) {
//        List<Company> resultList = companyService.getCompaniesByType(MARKET);
//        model.addAttribute("companiesList", resultList);
//        return "CompaniesInfo";
//    }
//
//    @RequestMapping(value = "/tennis", method = RequestMethod.GET)
//    public String showTennis(ModelMap model) {
//        List<Company> resultList = companyService.getCompaniesByType(TENNIS);
//        model.addAttribute("companiesList", resultList);
//        return "CompaniesInfo";
//    }
//
//    @RequestMapping(value = "/restaurants", method = RequestMethod.GET)
//    public String showRestaurants(ModelMap model) {
//        List<Company> resultList = companyService.getCompaniesByType(RESTAURANT);
//        model.addAttribute("companiesList", resultList);
//        return "CompaniesInfo";
//    }
//
//
//    @RequestMapping(value = "/cafes", method = RequestMethod.GET)
//    public String showCafes(ModelMap model) {
//        List<Company> resultList = companyService.getCompaniesByType(CAFE);
//        model.addAttribute("companiesList", resultList);
//        return "CompaniesInfo";
//    }
//
//    @RequestMapping(value = "/cinemas", method = RequestMethod.GET)
//    public String showCinemas(ModelMap model) {
//        List<Company> resultList = companyService.getCompaniesByType(CINEMA);
//        model.addAttribute("companiesList", resultList);
//        return "CompaniesInfo";
//    }
//
//
//    @RequestMapping(value = "/registrationNewCompany", method = RequestMethod.GET)
//    public String registrationCompanyPage(ModelMap model) {
//        return REGISTRATION_COMPANY_PAGE;
//    }
//
//    @RequestMapping(value = "/registerNewCompany", method = RequestMethod.POST)
//    public String registrateNewCompany(@RequestParam(Constants.COMPANY_NAME) String companyName,
//            @RequestParam(Constants.COMPANY_DESCRIPTION) String companyDescription,
//            @RequestParam(Constants.COMPANY_TYPE) String companyType, ModelMap model) {
//            System.out.println(companyName);
//            System.out.println(companyDescription);
//            System.out.println(companyType);
//        CompanyValidationStatusCode companyValidationStatusCode = companyService.checkCompanyRegistrationFields(companyName, companyDescription, companyType);
//
//        if (CompanyValidationStatusCode.OK.equals(companyValidationStatusCode)) {
//            try {
//                Company company = new Company(companyName, companyDescription, companyType);
//                companyService.addCompany(company);
//                model.addAttribute(Constants.ERROR, Constants.NEW_COMPANY_MESSAGE);
//                return COMPANY_HOME_PAGE;
//            } catch (Exception e) {
//                logger.error(e.getMessage(), e);
//                throw new InternalControllerException();
//            }
//        } else {
//            model.addAttribute(Constants.ERROR, companyValidationStatusCode.getStatus());
//            return USER_HOME_PAGE;
//        }
//    }
//
//    @RequestMapping(value = "/ownerCompanies", method = RequestMethod.GET)
//    public String seviceTrackingForCompany(ModelMap model) {
//        return COMPANY_HOME_PAGE;
//    }
//
//
//

}
