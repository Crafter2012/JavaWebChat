package com.webchat.web.domain;

import java.util.Date;

public class UserMessage
{
    private Date creationDate;
    private User sender;
    private String text;
    // conference id 
    private Conference destination;
    
    public UserMessage(User sender, Conference destination, String text)
    {
        this.creationDate = new Date();
        this.sender = sender;
        this.destination = destination;
        this.text = text;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public User getSender()
    {
        return sender;
    }

    public String getText()
    {
        return text;
    }

    public Conference getDestination()
    {
        return destination;
    }

}
