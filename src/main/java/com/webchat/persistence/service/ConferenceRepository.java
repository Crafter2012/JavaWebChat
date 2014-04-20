package com.webchat.persistence.service;

import java.util.ArrayList;
import java.util.List;

import com.webchat.web.domain.Conference;
import com.webchat.web.domain.User;

public class ConferenceRepository
{
    private List<Conference> conferences;
    
    public ConferenceRepository()
    {
        conferences = new ArrayList<Conference>();
    }
    
    public void init()
    {
        // temporary create one default guests conference
        conferences.add(new Conference(Integer.valueOf(0), null, "GuestRoom", "Room for guest"));
    }   
    
    public boolean createConference(User owner, String name, String subject)
    {
        Integer id = Integer.valueOf(conferences.size() + 1);
        Conference conference = new Conference(id, owner, name, subject);
        return conferences.add(conference);
    }
    
    public boolean removeConference(Conference conference)
    {
        conference.destroyConference();
        return conferences.remove(conference);
    }
    
    public Conference findConferenceById(Integer id)
    {
        if (conferences.size() > id.intValue())
        {
            return null;
        }
        return conferences.get(id.intValue());
    }
    
    public Conference findConferenceByName(String name)
    {
        for (Conference conference : conferences)
        {
            if (name.equals(conference.getName()))
            {
                return conference;
            }
        }
        return null;
    }
    
    public void changeConferenceName(Conference conference, String newName)
    {
        conference.setName(newName); 
    }
    
    public void changeConferenceSubject(Conference conference, String subject)
    {
        conference.setSubject(subject);
    }
    
    public void changeConferenceOwner(Conference conference, User owner)
    {
        conference.setOwner(owner);
    }
}
