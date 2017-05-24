package com.globallogic.yurii.kozachok.service;

import org.springframework.stereotype.Service;

@Service("locationService")
public class LocationService {
    
//    private static final Logger logger = Logger.getLogger(LocationService.class);
//
//    @Autowired
//    private LocationDaoImpl locationDaoImpl;
//
//    public void setLocationDaoImpl(LocationDaoImpl locationDaoImpl) {
//        this.locationDaoImpl = locationDaoImpl;
//    }
//
//    @Transactional(rollbackFor=Exception.class)
//    public void addLocation(Location location) {
//        locationDaoImpl.create(location);
//    }
//
//    @Transactional(rollbackFor=Exception.class)
//    public void deleteLocation(int id) {
//        locationDaoImpl.deleteById(id);
//    }
//
//    @Transactional(rollbackFor=Exception.class)
//    public void updateLocation(Location location, int id) {
//        locationDaoImpl.update(location, id);
//    }
//
//    public boolean checkLocationFields(String address, String phone) throws NoSuchAlgorithmException, Exception {
//        if (StringUtils.isNotBlank(address) && StringUtils.isNotBlank(phone)) {
//            if (locationDaoImpl.isLocationExist(address, phone)) {
//                logger.debug(String.format("Location with address = %s is exist", address));
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public LocationValidationStatusCode checkLocationRegistrationFields(String address, String phone) throws NoSuchAlgorithmException, Exception {
//        if (!address.matches("^[A-Z]{1}[a-z]+[,]{1}[0-9]{1,}(|[\\s])(|[/])([0-9]|[a-z]{1}|[A-Z]{1})$")) {
//            return LocationValidationStatusCode.ADDRESS_IS_INCORRECT;
//        }
//        if (!phone.matches("^[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{2}[-][0-9]{2}$")) {
//            return LocationValidationStatusCode.PHONE_IS_INCORRECT;
//        }
//        return LocationValidationStatusCode.OK;
//    }
//
//
}
