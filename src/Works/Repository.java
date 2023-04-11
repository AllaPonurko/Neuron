package Works;

import Intefaces.Devices.ICrudRepository;
import Models.AboutDevices.Device;
import Models.AboutDevices.Devices;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Repository extends Devices implements ICrudRepository {
    public void seed()
    {
        createDevice(new Device("Samsung S51",
                2021, Color.BLUE,"Smartphone"));
        createDevice(new Device("Samsung A71",
                2020, Color.GRAY,"Smartphone"));
        createDevice(new Device("Readme B12",
                2021, Color.BLUE,"Smartphone"));
        createDevice(new Device("Huawei K60",
                2022, Color.GRAY,"Smartphone"));
        createDevice(new Device("Samsung J50",
                2019, Color.WHITE,"Smartphone"));
        createDevice(new Device("Lenovo G50",
                2019, Color.BLACK,"Laptop"));
        createDevice(new Device("Asus H75",
                2020, Color.BLACK,"Laptop"));
        createDevice(new Device("Lenovo IdeaTab",
                2021, Color.WHITE,"Tablet"));
    }
    @Override
    public void createDevice(Object e) {
        devices.add((Device) e);
    }

    @Override
    public void deleteDevice(Object o) {
        devices.remove(o);
    }

    @Override
    public void readRepository() {
        try{
            devices.stream().forEach(d->System.out.println(d.toString()));
        }catch (Exception e) {
            System.out.println(e.getMessage()+" Not found");
        }
    }

    @Override
    public void findById(UUID id) {
        try{
            System.out.println(devices.stream()
                    .filter(d->d.getId()==id).findFirst().toString());
        }catch (Exception e) {
            System.out.println(e.getMessage()+" Not found");
        }
    }

    @Override
    public void findByDiapasonYear(int year1, int year2) {
        System.out.println("Collection of devices in the" +
                " range of the year of manufacture "+year1+"-"+year2+":");
        try{
            Set<Device> newset=new HashSet<>();
            if(year2>year1)
                for (var d:devices)
                {
                    if(d.getYear()>=year1&&d.getYear()<=year2)
                        newset.add(d);
                }
            if(year2<year1)
                for (var d:devices)
                {
                    if(d.getYear()>=year2&&d.getYear()<=year1)
                        newset.add(d);
                }
            newset.stream().forEach(d->System.out.println(d.toString()));
        }catch (Exception e) {
            System.out.println(e.getMessage()+" Not found");
        }
    }

    @Override
    public void findByYear(int year) {
        System.out.println("Collection devices by year " +
                "of manufacture "+year+":");
        try{
            Set<Device> setByYear=new HashSet<>();
            for (var d:devices)
            {
                if(d.getYear()==year)
                    setByYear.add(d);
            }
            setByYear.stream().forEach(d->System.out.println(d.toString()));
        }catch (Exception e) {
            System.out.println(e.getMessage()+" Not found");
        }
    }

    @Override
    public void findByType(String typeDevice) {
        System.out.println("Collection devices by type "+typeDevice+":");
        try {
            Set<Device> devicesByType = new HashSet<>();
            for (var d : devices) {
                if (d.getTypeDevice() == typeDevice)
                    devicesByType.add(d);
            }
            devicesByType.stream().forEach(d -> System.out.println(d.toString()));
        } catch (Exception e) {
            System.out.println(e.getMessage()+" Not found");
        }
    }

    @Override
    public void findByMorePrice(int price) {
        System.out.println("Collection devices by price more than "+price+" $ :");
        try {
            Set<Device> devicesByPrice= new HashSet<>();
            for (var d : devices) {
                if (d.getPrice() >= price)
                    devicesByPrice.add(d);
            }
            devicesByPrice.stream().forEach(d -> System.out.println(d.toString()));
        } catch (Exception e) {
            System.out.println(e.getMessage()+" Not found");
        }
    }
   public String getColorInString(Color color)
  {
      String c = null;
      if (color.equals(Color.BLACK)) {
          c = "Black";
      } else if (color.equals(Color.GRAY)) {
          c = "Gray";
      } else if (color.equals(Color.BLUE)) {
          c = "Blue";
      } else if (color.equals(Color.WHITE)) {
          c = "White";
      }
      return c;
  }
    @Override
    public void updateRepository() {

    }

    @Override
    public void findByColor(Color color) {
        System.out.println("Collection devices by color "+getColorInString(color)+":");
        try{
            Set<Device> devicesByColor=new HashSet<>();
            for (var d:devices)
            {
                if(d.getColor()==color)
                    devicesByColor.add(d);
            }
            devicesByColor.stream()
                    .forEach(d->System.out.println(d.toString()));

        }catch (Exception e) {
            System.out.println(e.getMessage()+" Not found");
        }
    }
}
