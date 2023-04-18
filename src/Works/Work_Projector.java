package Works;

public class Work_Projector implements Runnable{
    /**
     * Runs this operation.
     */
    RepositoryProjectors projectors=new RepositoryProjectors();
    @Override
    public void run() {
      projectors.seed();
      projectors.readRepository();
      projectors.findByMorePrice(300);
      projectors.findByYear(2023);
      projectors.sortByLessPrice();
      projectors.findByVendor("");
    }
}
