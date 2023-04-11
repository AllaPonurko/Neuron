package Models.AboutDevices;

import Intefaces.Entity;

import java.awt.*;
import java.util.Random;
import java.util.UUID;

public class Device implements Entity{
    private String Name;
    private  UUID Id;
    private int Year;
    private Color color;
    private String TypeDevice;
    private int Price;
    public Device(String name,int year,Color color,String typeDevice) {
        Id = UUID.randomUUID();
        Name=name;
        Year=year;
        this.color=color;
        TypeDevice=typeDevice;
        Random random=new Random();
        Price=random.nextInt(200,350);
    }
    @Override
    public UUID getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTypeDevice() {
        return TypeDevice;
    }

    public void setTypeDevice(String typeDevice) {
        TypeDevice = typeDevice;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return Name +"\n "+TypeDevice+"\n"+Year+
                "\n"+Price+" $";
    }

}
