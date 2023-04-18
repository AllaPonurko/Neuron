package Models.AboutDevices;

import Intefaces.Entity;

import java.awt.*;
import java.util.UUID;

public class Projector implements Entity {
    @Override
    public UUID getId() {
        return null;
    }
    private String Name;
    private  UUID Id;
    private int Year;
    private String Vendor;
    private int Price;

    public String getName() {
        return Name;
    }

    public String getVendor() {
        return Vendor;
    }

    public int getYear() {
        return Year;
    }

    public int getPrice() {
        return Price;
    }
    public Projector(String name, String vendor,int price,int year)
    {
        Id=UUID.randomUUID();
        Name=name;
        Vendor=vendor;
        Price=price;
        Year=year;
    }
    @Override
    public String toString()
    {
        return "Name: "+getName()+"\n"+"Vendor: "+getVendor()+"\n"
                +"Year: "+getYear()+"\n"+"Price: "+getPrice();
    }
}
