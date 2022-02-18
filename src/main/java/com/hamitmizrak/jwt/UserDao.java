package com.hamitmizrak.jwt;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hamitmizrak.jwt.DAOUser;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}
