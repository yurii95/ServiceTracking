package com.globallogic.yurii.kozachok.service;


import com.globallogic.yurii.kozachok.dao.RoleRepository;
import com.globallogic.yurii.kozachok.dao.UserRepository;
import com.globallogic.yurii.kozachok.dao.entity.RoleEntity;
import com.globallogic.yurii.kozachok.dao.entity.UserEntity;
import com.globallogic.yurii.kozachok.validationStatus.UserValidationStatusCode;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Autowired
    private RoleRepository roleRepository;

    public boolean findUserByLoginAndPassword(String login, String password) {
        UserEntity userEntity = userRepository.findByLoginAndPassword(login, password);
        return userEntity != null;
    }

    public UserValidationStatusCode saveUser(String login, String password, String passwordConfirm, String firstName, String lastName, String email, Date birthday) {
        UserValidationStatusCode userValidationStatusCode = checkUserRegistrationFields(login,password,passwordConfirm,email);
        if(userValidationStatusCode.equals(UserValidationStatusCode.OK)){
            UserEntity user = new UserEntity(login, password,firstName, lastName, email, birthday);
            user.setActive(1);
            RoleEntity userRole = roleRepository.findByRole("ADMIN");
            user.setRoles(new HashSet<RoleEntity>(Arrays.asList(userRole)));
            user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
            userRepository.save(user);
        }
        return userValidationStatusCode;
    }

    public UserEntity findUserByLogin(String login) {
        return userRepository.findUserByLogin(login);
    }
    //
//    @Autowired
//    private BaseMessageProducer messageProducer;
//
//	private static final Logger logger = Logger.getLogger(UserDao.class);
//
//
//
//    public void addUser(UserEntity user) {
//        userDao.create(user);
//        messageProducer.sendEmailMessage(new Email(user.getEmail(), "kozak9995@gmail.com" ,
//                "registration successful","Congratulations, you are join ServiceTracking"));
//    }
//
//    public boolean doLogin(String login, String password) throws Exception {
//        if (StringUtils.isNotBlank(login) && StringUtils.isNotBlank(password)) {
//        	logger.debug(String.format("Do login user %s", login));
//            String passwordHash = generateHashForPassword(password);
//            if (userDao.isUserRegistered(login, passwordHash)) {
//            	logger.debug(String.format("Verification successful: user with login = %s is exist", login));
//                return true;
//            }
//        }
//        return false;
//    }
//
    public UserValidationStatusCode checkUserRegistrationFields(String login, String password, String passwordConfirm, String email) {
        if (!password.equals(passwordConfirm)) {
            return UserValidationStatusCode.PASSWORDS_NOT_EQUALS;
        }
        if (!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=\\S+$).{5,}$")) {
            return UserValidationStatusCode.INVALID_PASSWORD;
        }
        if (!login.matches("[A-Za-z0-9_]+")) {
            return UserValidationStatusCode.INVALID_LOGIN;
        }
        if (!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
            return UserValidationStatusCode.INCORRECT_EMAIL;
        }
        return UserValidationStatusCode.OK;
    }
//
//    public String generateHashForPassword(String password) throws NoSuchAlgorithmException, Exception{
//        StringBuilder hash = new StringBuilder();
//        MessageDigest sha = MessageDigest.getInstance("SHA-1");
//        byte[] hashedBytes = sha.digest(password.getBytes());
//        char[] digits      = {
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
//        };
//        for (int idx = 0; idx < hashedBytes.length; ++idx) {
//            byte b = hashedBytes[idx];
//            hash.append(digits[(b & 0xf0) >> 4]);
//            hash.append(digits[b & 0x0f]);
//        }
//        return hash.toString();
//    }
//
//	public UserDao getUserDao() {
//		return userDao;
//	}
//
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}
//
}
