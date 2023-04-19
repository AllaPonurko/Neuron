package Models.AboutUsers;

import Intefaces.Entity;
import Models.AboutDevices.Projector;

import java.util.UUID;

public class User implements Entity {
   private UUID Id=UUID.randomUUID();
    private String Email;
    private String Name;
    private   String Password;
    public void setName(String name)
    {
        Name=name;
    }
    public String getEmail()
    {
        return Email;
    }
    public void setEmail(String email)
    {
        Email=email;
    }
    public  String getName()
    {
        return Name;
    }
    public void setPassword(String password)
    {
        Password=password;
    }

    @Override
    public UUID getId() {
        return Id;
    }

    @Override
    public String toString()
    {
        return getName()+" "+getEmail();
    }

}
