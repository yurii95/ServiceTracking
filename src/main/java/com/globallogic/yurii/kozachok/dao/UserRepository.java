package com.globallogic.yurii.kozachok.dao;

import com.globallogic.yurii.kozachok.dao.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    UserEntity findByLoginAndPassword(String login, String password);
    UserEntity findUserByLogin(String login);
}
