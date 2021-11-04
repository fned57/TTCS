package com.tiemvacxin.Controller;

import com.tiemvacxin.Database.UserDao;
import com.tiemvacxin.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class UserController {


    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Autowired
    private  UserDao userDao;
    @GetMapping("/user")
    public @ResponseBody Iterable<User>  GetAll(){
        return  userDao.findAll();
    }
    @PostMapping("/user")
    public @ResponseBody User createUser(@RequestBody User user){
        user.setPassword(passwordEncoder().encode(user.getPassword()));
        userDao.save(user);
        return  user;
    }

    @PutMapping("/user/{id}")
    public @ResponseBody User UpdateUser(@RequestBody User user, @RequestParam Integer id){
        return  null;

    }
    @DeleteMapping("/user/{id}")
    public @ResponseBody User DeleteUser(@RequestParam Integer id){

//        User a = userDao.findAllById(Collections.singleton(id)).getClass();
        return  null;

    }
}
