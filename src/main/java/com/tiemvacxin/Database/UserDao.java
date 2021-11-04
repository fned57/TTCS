package com.tiemvacxin.Database;

import com.tiemvacxin.Model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDao extends CrudRepository<User, Integer> {

}
