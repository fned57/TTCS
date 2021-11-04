package com.tiemvacxin;


import com.tiemvacxin.Database.UserDao;
import com.tiemvacxin.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class CostumUserServer implements UserDetailsService {

    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Autowired
    UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User();
        userDao.findAll().forEach((a ->
        {
            if (a.getEmail().equals(username)) {
                user.setEmail(a.getEmail());
                user.setPassword(a.getPassword());
                user.setQuyen(a.getQuyen());
            }
        }));

        UserDetails userDetails = org.springframework.security.core.userdetails.User.withUsername(user.getEmail()).password(user.getPassword()).build();
        return userDetails;
    }
}
