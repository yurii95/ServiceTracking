package com.globallogic.yurii.kozachok.service;

import org.springframework.stereotype.Service;


@Service("ownerService")
public class OwnerService {
    


//    @Autowired
//    private OwnerDaoImpl ownerDaoImpl;
//
//    @Transactional(rollbackFor=Exception.class)
//    public void addOwner(Owner owner) {
//        ownerDaoImpl.create(owner);
//    }
//
//    @Transactional(rollbackFor=Exception.class)
//    public void deleteOwner(int id) {
//        ownerDaoImpl.deleteById(id);
//    }
//
//    @Transactional(rollbackFor=Exception.class)
//    public void updateOwner(Owner owner, int id) {
//        ownerDaoImpl.update(owner, id);
//    }
//
//    public OwnerValidationStatusCode checkOwnerFields(String address, String phone) {
//
//        if (!address.matches("^[A-Z]{1}[a-z][,]{1}[0-9/]{5}$")) {
//            return OwnerValidationStatusCode.ADDRESS_IS_INCORRECT;
//        }
//        if (!address.matches("^[A-Z]{1}[a-z][,]{1}[a-z0-9]{5}$")) {
//            return OwnerValidationStatusCode.ADDRESS_IS_INCORRECT;
//        }
//        if (!phone.matches("\\d{3}-\\d{3}-\\d{2}-\\d{2}")) {
//         return OwnerValidationStatusCode.PHONE_IS_INCORRECT;
//        }
//        return OwnerValidationStatusCode.OK;
//    }
//
//    public boolean checkOwnerRegistrationFields(String address, String phone) {
//        if (StringUtils.isNotBlank(address) && StringUtils.isNotBlank(phone)) {
//      return true;
//        }
//        return false;
//    }
//
//
//
}
