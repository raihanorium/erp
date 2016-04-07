package com.raihanorium.erp.rest.controller;

import com.raihanorium.erp.rest.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Raihan on 4/7/2016.
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public User createUser(@RequestBody User user){
        return user;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getAllUser(){
        List<User> allUsers = new ArrayList<User>();

        User user1 = new User();
        user1.setId(1);
        user1.setName("Abc");
        allUsers.add(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setName("Def");
        allUsers.add(user2);

        return allUsers;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable long id){
        User user = new User();
        user.setId(id);

        return user;
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user){
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public User deleteUser(@PathVariable long id){
        User user = new User();
        user.setId(id);

        return user;
    }
}
