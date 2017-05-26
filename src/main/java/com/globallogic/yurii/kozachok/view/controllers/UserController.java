package com.globallogic.yurii.kozachok.view.controllers;

import com.globallogic.yurii.kozachok.service.UserService;
import com.globallogic.yurii.kozachok.validationStatus.UserValidationStatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Date;

@Controller
@ComponentScan(basePackages = "com.globallogic.yurii.kozachok.view")
public class UserController {
    private static final String VIEW_INDEX = "hgf";
    private static final String USER_HOME_PAGE = "userHomePage";
    private static final String REGISTRATION_PAGE = "registrationForUser";
    private static final String REGISTRATION_STATUS = "status";
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.addObject("name", "yurii");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String createNewUser(@RequestParam("usernameSignUp") String username,
                                @RequestParam("firstNameSignUp") String firstName,
                                @RequestParam("lastNameSignUp") String lastName,
                                @RequestParam("birthdaySignUp") Date birthday,
                                @RequestParam("passwordSignUp") String password,
                                @RequestParam("passwordSignUpConfirm") String passwordConfirm,
                                @RequestParam("emailSignUp") String email, RedirectAttributes redirectAttributes) {
        UserValidationStatusCode userValidationStatusCode = userService.saveUser(username, password,
                passwordConfirm, firstName, lastName, email, birthday);
        redirectAttributes.addFlashAttribute(REGISTRATION_STATUS,userValidationStatusCode.getStatus());
        if (userValidationStatusCode.equals(UserValidationStatusCode.OK)) {
            logger.info("New user was created successfully");
            return "redirect:/login";
        } else {
            logger.info(userValidationStatusCode.getStatus());
            return "redirect:/login#toregister";
        }
    }

	@RequestMapping(value = "user/home", method = RequestMethod.GET)
	public String allServices(ModelMap model) {
		return USER_HOME_PAGE;
	}
//
//
//	@RequestMapping(value = "/registerNewUser", method = RequestMethod.POST)
//	public String registrateNewUser(@RequestParam(Constants.LOGIN) String login,
//			@RequestParam(Constants.PASSWORD) String password, @RequestParam(Constants.FIRST_NAME) String firstName,
//			@RequestParam(Constants.LAST_NAME) String lastName, @RequestParam(Constants.EMAIL) String email,
//			@RequestParam(Constants.PASSWORD_CONFIRMATION) String passwordConfirm,
//			@RequestParam(Constants.BIRTHDAY) String birthday, ModelMap model) {
//
//		UserValidationStatusCode userValidationStatusCode = userService.checkUserRegistrationFields(login, password,
//				passwordConfirm, email);
//
//		if (UserValidationStatusCode.OK.equals(userValidationStatusCode)) {
//			try {
//				UserEntity user = new UserEntity(login, firstName, lastName, userService.generateHashForPassword(password), email, birthday);
//				userService.addUser(user);
//				model.addAttribute(Constants.ERROR, Constants.NEW_USER_MESSAGE);
//                return VIEW_INDEX;
//			} catch (Exception e) {
//				logger.error(e.getMessage(), e);
//				throw new InternalControllerException();
//			}
//		} else {
//			model.addAttribute(Constants.ERROR, userValidationStatusCode.getStatus());
//			return REGISTRATION_PAGE;
//		}
//	}
}
