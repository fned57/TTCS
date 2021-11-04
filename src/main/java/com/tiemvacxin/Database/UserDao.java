package com.tiemvacxin.Database;

import com.tiemvacxin.Model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User, Integer> {

    List<User> findByLastname(String lastname);
}
