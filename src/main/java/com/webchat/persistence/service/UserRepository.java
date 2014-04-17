package com.webchat.persistence.service;

import java.util.ArrayList;
import java.util.List;

import com.webchat.web.domain.User;

public class UserRepository
{
    private List<User> users;
    
    public UserRepository()
    {
        users = new ArrayList<User>();
    }
    
    public void init()
    {
        User admin = new User(Integer.valueOf(0), "Admin", "password");
        users.add(admin);
    }
    
    public boolean createUser(String email, String password)
    {
        Integer id = Integer.valueOf(users.size() + 1);
        return users.add(new User(id, email, password));
    }
    
    public boolean removeUser(User user)
    {
        if (user != null)
            return users.remove(user);
        return false;
    }
    
    public User findUserById(Integer id)
    {
        if (users.size() > id.intValue())
            return null;
        return users.get(id.intValue()); 
    }
    
    public User findUserByEmail(String email)
    {
        if (email != null)
        {
            for (User user : users)
            {
                if (email.equals(user.getEmail()))
                {
                    return user;
                }
            }
        }
        return null;
    }
}

