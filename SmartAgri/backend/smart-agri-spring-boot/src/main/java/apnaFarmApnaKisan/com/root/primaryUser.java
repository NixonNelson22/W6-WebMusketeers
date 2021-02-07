/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnaFarmApnaKisan.com.root;

import java.util.UUID;

/**
 *
 * @author nixon
 */
public class primaryUser
{
    private String name;
    private final UUID id;
    private int phoneNo;
    private String location;

    public primaryUser(String name, UUID id, int phoneNo, String location)
    {
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;
        this.location = location;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPhoneNo()
    {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo)
    {
        this.phoneNo = phoneNo;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public UUID getId()
    {
        return id;
    }
    
    
}
