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
      projectors.findByMorePrice(350);
      projectors.findByYear(2023);
      projectors.findByVendor("BenQ");
      projectors.sortByLessPrice();
      projectors.sortByMorePrice();

    }
}
