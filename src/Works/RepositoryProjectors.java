package Works;

import Intefaces.Devices.ICrudRepository;
import Models.AboutDevices.Device;
import Models.AboutDevices.Projector;
import Models.AboutDevices.Projectors;

import java.awt.*;
import java.util.*;
import java.util.List;

public class RepositoryProjectors extends Projectors implements ICrudRepository {
    @Override
    public void createDevice(Object e) {
       projectorList.add((Projector) e);
    }

    @Override
    public void deleteDevice(Object o) {
       projectorList.remove((Projector) o);
    }
    public void seed()
    {
        createDevice(new Projector("DLP PT-FRZ60W","Panasonic",2019));
        createDevice(new Projector("M1 Mini","ViewSonic",2021));
        createDevice(new Projector("DW284-ST","Vivitek",2023));
        createDevice(new Projector("UC-28 Led Projector","Unic",2023));
        createDevice(new Projector("UC-68 1800 Led Projector","Unic",2020));
        createDevice(new Projector("TH575 Б1252-6","BenQ",2021));
        createDevice(new Projector("TH575","BenQ",2023));
    }
public void sortByMorePrice()
{
    System.out.println("*****************\nCollection projectors sort by more price: ");
//    List<Projector> sortList=projectorList.stream().toList();
//    Collections.sort(sortList,( o1, o2) -> o1.getPrice() - o2.getPrice());
//    sortList.stream().forEach(p->System.out.println(p.toString()));

}
public void sortByLessPrice()
{

}
public void findByVendor(String vendor) {
    System.out.println("Collection projectors by vendor " +
            vendor+":");
    Set<Projector> setByVendor = new HashSet<>();
    try {
        for (var p : projectorList
        ) {
            if (p.getVendor() == vendor)
                setByVendor.add(p);
        }
        for (var p : setByVendor
        ) {
            System.out.println(p.toString());
        }

    } catch (Exception e) {
        System.out.println(e.getMessage() +" Not found");
    }
}
    @Override
    public void readRepository() {
        System.out.println("Collection projectors " +
                " :");
        try {
            projectorList.stream().forEach(p->System.out.println(p.toString()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void findById(UUID id) {
        try {
            projectorList.stream().filter(p -> p.getId() == id).findFirst().toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void findByColor(Color color) {

    }

    @Override
    public void findByDiapasonYear(int year1, int year2) {

    }

    @Override
    public void findByYear(int year) {
        System.out.println("Collection projectors by year " +
                "of manufacture "+year+":");
        try{
            Set<Projector> setByYear=new HashSet<>();
            for (var d:projectorList)
            {
                if(d.getYear()==year)
                    setByYear.add(d);
            }
            setByYear.stream().forEach(p->System.out.println(p.toString()));
        }catch (Exception e) {
            System.out.println(e.getMessage()+" Not found");
        }
    }

    @Override
    public void findByType(String typeDevice) {

    }

    @Override
    public void findByMorePrice(int price) {
        System.out.println("Collection projectors by price more than "+price+" $ :");
        try {
            Set<Projector> devicesByPrice= new HashSet<>();
            for (var p : projectorList) {
                if (p.getPrice() >= price)
                    devicesByPrice.add(p);
            }
            devicesByPrice.stream().forEach(p -> System.out.println(p.toString()));
        } catch (Exception e) {
            System.out.println(e.getMessage()+" Not found");
        }
    }

    @Override
    public void updateRepository() {

    }

}
