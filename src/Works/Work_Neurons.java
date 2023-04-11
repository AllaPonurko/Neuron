package Works;

import Models.Neurons.IsNum;

public class Work_Neurons implements Runnable{
    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        IsNum isNum=new IsNum();
        System.out.println(" Before Edu ");
        isNum.is1();
        isNum.edu1();
        isNum.edu2();
        isNum.edu3();
        isNum.edu4();
        isNum.edu5();
        isNum.edu6();
        isNum.edu7();
        isNum.edu8();
        isNum.edu9();
        isNum.edu0();
        double[] led1 = {0,0,1,0,0,1,0,1};
        double[] led7 = {1,0,1,0,0,1,0,1};
        double[] led0 = {1, 1, 1, 0, 1, 1, 1, 1};
        double[] led5 = {1, 1, 0, 1, 0, 1, 1, 1};
        isNum.test(new double[][]{led0,led5,led1,led7});
//        isNum.test(led1);
//        isNum.test(led7);
//        isNum.test(led0);

    }
}
