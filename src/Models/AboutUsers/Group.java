package Models.AboutUsers;

import Intefaces.Entity;
import Models.AboutDevices.Projector;


import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


public class Group implements Entity {
    private String Name;
    private UUID Id;
    private int Year;
    public Set<User> users;
    public Group() {
       users=new HashSet<>();
        Id=UUID.randomUUID();
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String name)
    {
        Name=name;
    }
    public void setYear(int year)
    {
        Year=year;
    }
    public void createUserEmail()
    {
        users.stream().forEach(u->u.setEmail(u.getName()+"@gmail.com"));
    }

    @Override
    public UUID getId() {
        return Id;
    }


}
