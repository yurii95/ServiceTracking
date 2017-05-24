package com.globallogic.yurii.kozachok.view.controllers;

import com.globallogic.yurii.kozachok.dao.entity.UserEntity;
import com.globallogic.yurii.kozachok.service.UserService;
import com.globallogic.yurii.kozachok.validationStatus.UserValidationStatusCode;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.sql.Date;
import java.time.LocalDate;

@Controller
@ComponentScan(basePackages = "com.globallogic.yurii.kozachok.view")
public class LoginController {
    private static final String VIEW_INDEX = "hgf";
    private static final String USER_HOME_PAGE = "mainPageForUsers";
    private static final String REGISTRATION_PAGE = "registrationForUser";
    private static final String REGISTRATION_STATUS = "status";
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    private UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String welcome() {
//        return VIEW_INDEX;
//    }

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.addObject("name", "yurii");
        return modelAndView;
    }

    @RequestMapping(value = "/authentication", method = RequestMethod.POST)
    public ModelAndView isUserAuthenticated(@RequestParam("username") String login, @RequestParam("password") String password, ModelMap model) {
        if (userService.findUserByLoginAndPassword(login, password)) {
            logger.info(String.format("User %s was authenticated", login));
            return new ModelAndView("home");
        } else {
            logger.info(String.format("User %s was not authenticated", login));
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("login");
            modelAndView.addObject(REGISTRATION_STATUS, "Bad credentials, please try again");
            return modelAndView;
        }

//        try {
//
//            if (userService.doLogin(login, password)) {
//                logger.debug(String.format("The user with login = %s has been authorized", login));
//                return USER_HOME_PAGE;
//            } else {
//                logger.debug(String.format("The user with login = %s hasn't been authorized", login));
//                model.addAttribute(Constants.ERROR, Constants.USER_NOT_EXIST);
//                return VIEW_INDEX;
//            }
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//            return null;
//        }
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String createNewUser(@RequestParam("usernameSignUp") String username,
                                @RequestParam("firstNameSignUp") String firstName,
                                @RequestParam("lastNameSignUp") String lastName,
                                @RequestParam("birthdaySignUp") Date birthday,
                                @RequestParam("passwordSignUp") String password,
                                @RequestParam("passwordSignUpConfirm") String passwordConfirm,
                                @RequestParam("emailSignUp") String email, RedirectAttributes redirectAttributes) {
        ModelAndView modelAndView = new ModelAndView();
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

//        UserEntity existedUser = userService.findUserByLogin(userEntity.getLogin());
//        if (existedUser != null) {
//            bindingResult
//                    .rejectValue("email", "error.user",
//                            "There is already a user registered with the email provided");
//        }
//        if (bindingResult.hasErrors()) {
//            modelAndView.setViewName("registration");
//        } else {
//            userService.saveUser(userEntity);
//            modelAndView.addObject("successMessage", "User has been registered successfully");
//            modelAndView.addObject("user", new UserEntity());
//            modelAndView.setViewName("registration");
//
//        }
    }
//
//	@RequestMapping(value = "/companies", method = RequestMethod.GET)
//	public String seviceTracking(ModelMap model) {
//		return USER_HOME_PAGE;
//	}
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
