package Intefaces.Devices;

import java.awt.*;
import java.util.UUID;

public interface IReadRepository {
    public void readRepository();
    public void findById(UUID id);
    public void findByColor(Color color);
    public void findByDiapasonYear(int year1,int year2);
    public void findByYear(int year);
    public void findByType(String typeDevice);
    public void findByMorePrice(int price);
}
