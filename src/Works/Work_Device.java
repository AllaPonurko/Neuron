package Works;

import java.awt.*;

public class Work_Device implements Runnable {
    Repository repository=new Repository();
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        repository.seed();
        repository.readRepository();
        repository.findByColor(Color.BLUE);
        repository.findByType("Smartphone");
        repository.findByType("Laptop");
        repository.findByYear(2021);
        repository.findByMorePrice(270);
        repository.findByDiapasonYear(2021,2019);
    }



}
