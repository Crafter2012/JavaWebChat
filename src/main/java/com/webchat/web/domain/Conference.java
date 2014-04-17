package com.webchat.web.domain;

import java.util.ArrayList;
import java.util.List;

public class Conference
{   
    private Integer id;
    private User owner;
    private String name;
    private String subject;
    private List<User> members;
    private List<UserMessage> messages;
    
    public Conference(Integer id, String name, String subject)
    {
        this.id = id ;
        this.name = name;
        this.subject = subject;
        members = new ArrayList<User>();
        messages = new ArrayList<UserMessage>();
    }
    
    public Conference(Integer id, User owner, String name, String subject)
    {
        this(id, name, subject);
        this.owner = owner;
    }
    
    public User getOwner()
    {
        return owner;
    }

    public void setOwner(User owner)
    {
        this.owner = owner;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSubject()
    {
        return subject;
    }

    public void setSubject(String subject)
    {
        this.subject = subject;
    }

    public Integer getId()
    {
        return id;
    }

    public boolean addUser(User user)
    {
        if (user != null)
            return members.add(user);
        return false;
    }
    
    public boolean removeUser(User user)
    {
        if (user != null)
            return members.remove(user);
        
        return false;
    }
    
    public boolean addUserMessage(UserMessage message)
    {
        if (message != null)
            return messages.add(message);
        return false;
    }
    
    public void destroyConference()
    {
        members.clear();
        messages.clear();
    }
    

}
