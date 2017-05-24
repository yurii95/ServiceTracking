package com.globallogic.yurii.kozachok.dao;

import com.globallogic.yurii.kozachok.dao.entity.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Integer>{
    RoleEntity findByRole(String role);
}