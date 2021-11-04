package com.tiemvacxin;

import com.tiemvacxin.Database.UserDao;
import com.tiemvacxin.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumUserServer implements UserDetailsService {

    @Autowired
    UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<User> listuser =  userDao.findByLastname(username);
        if(listuser.size() > 0){
            User a = listuser.get(0);
            User b = new org.springframework.security.core.userdetails.User(a.getEmail(),a.getPassword(),true);
        }else {
            new UsernameNotFoundException("login fail !");
        }

        return null;
    }
}
