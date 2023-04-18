package Works;

import Intefaces.Devices.ICrudRepository;
import Models.AboutDevices.Device;
import Models.AboutDevices.Projector;
import Models.AboutDevices.Projectors;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

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

    }
public void sortByMorePrice()
{

}
public void sortByLessPrice()
{

}
public void findByVendor(String vendor)
{

}
    @Override
    public void readRepository() {
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
