package Models.Neurons;
/*
 -
| |
 -
| |
 -
 0
1 2
 3
4 5
 6
 */
public class IsNum {
    private static final int eduSteps = 1000;
    public double[] led1 = {0, 0, 1, 0, 0, 1, 0, 1};
    public double[] led2 = {1, 0, 1, 1, 1, 0, 1, 1};
    public double[] led3 = {1, 0, 1, 1, 0, 1, 1, 1};
    public double[] led4 = {0, 1, 1, 1, 0, 1, 0, 1};
    public double[] led5 = {1, 1, 0, 1, 0, 1, 1, 1};
    public double[] led6 = {1, 1, 0, 1, 1, 1, 1, 1};
    public double[] led7 = {1, 0, 1, 0, 0, 1, 0, 1};
    public double[] led8 = {1, 1, 1, 1, 1, 1, 1, 1};
    public double[] led9 = {1, 1, 1, 1, 0, 1, 1, 1};
    public double[] led0 = {1, 1, 1, 0, 1, 1, 1, 1};

    public void print(double[] led) {
        char[] str = {' ', ' ', ' ', ' ', ' '};
        if (led[0] == 1)
            System.out.println(" *** ");
        else
            System.out.println("   ");
        if (led[1] == 1)
            str[0] = '*';
        else
            str[0] = ' ';
        if (led[1] == 1)
            str[0] = '*';
        else
            str[0] = ' ';
        if (led[2] == 1)
            str[4] = '*';
        else
            str[4] = ' ';
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println(str);
        }
        if (led[3] == 1)
            System.out.println(" *** ");
        else
            System.out.println("     ");
        if (led[4] == 1)
            str[0] = '*';
        else
            str[0] = ' ';

        if (led[5] == 1)
            str[4] = '*';
        else
            str[4] = ' ';
        for (i = 0; i < 3; i++) {
            System.out.println(str);
        }
        if (led[6] == 1)
            System.out.println(" *** ");
        else
            System.out.println("     ");

        System.out.println("\n --- \n");
    }

    public void printAll() {
        print(led1);
        print(led2);
        print(led3);
        print(led4);
        print(led5);
        print(led6);
        print(led7);
        print(led8);
        print(led9);
        print(led0);
    }

    public MyNeuron is1 = new MyNeuron(8);
    public MyNeuron is2 = new MyNeuron(8);
    public MyNeuron is3 = new MyNeuron(8);
    public MyNeuron is4 = new MyNeuron(8);
    public MyNeuron is5 = new MyNeuron(8);
    public MyNeuron is6 = new MyNeuron(8);
    public MyNeuron is7 = new MyNeuron(8);
    public MyNeuron is8 = new MyNeuron(8);
    public MyNeuron is9 = new MyNeuron(8);
    public MyNeuron is0 = new MyNeuron(8);

    public void edu1() {
        for (int i = 0; i < eduSteps; i++) {
            is1.backpropagation(led1, 1, 0.1);
            is1.backpropagation(led2, 0, 0.1);
            is1.backpropagation(led3, 0, 0.1);
            is1.backpropagation(led4, 0, 0.1);
            is1.backpropagation(led5, 0, 0.1);
            is1.backpropagation(led6, 0, 0.1);
            is1.backpropagation(led7, 0, 0.1);
            is1.backpropagation(led8, 0, 0.1);
            is1.backpropagation(led9, 0, 0.1);
            is1.backpropagation(led0, 0, 0.1);
        }
    }

    public void edu2() {
        for (int i = 0; i < eduSteps; i++) {
            is2.backpropagation(led1, 0, 0.1);
            is2.backpropagation(led2, 1, 0.1);
            is2.backpropagation(led3, 0, 0.1);
            is2.backpropagation(led4, 0, 0.1);
            is2.backpropagation(led5, 0, 0.1);
            is2.backpropagation(led6, 0, 0.1);
            is2.backpropagation(led7, 0, 0.1);
            is2.backpropagation(led8, 0, 0.1);
            is2.backpropagation(led9, 0, 0.1);
            is2.backpropagation(led0, 0, 0.1);
        }
    }

    public void edu3() {
        for (int i = 0; i < eduSteps; i++) {
            is3.backpropagation(led1, 0, 0.1);
            is3.backpropagation(led2, 0, 0.1);
            is3.backpropagation(led3, 1, 0.1);
            is3.backpropagation(led4, 0, 0.1);
            is3.backpropagation(led5, 0, 0.1);
            is3.backpropagation(led6, 0, 0.1);
            is3.backpropagation(led7, 0, 0.1);
            is3.backpropagation(led8, 0, 0.1);
            is3.backpropagation(led9, 0, 0.1);
            is3.backpropagation(led0, 0, 0.1);
        }
    }

    public void edu4() {
        for (int i = 0; i < eduSteps; i++) {
            is4.backpropagation(led1, 0, 0.1);
            is4.backpropagation(led2, 0, 0.1);
            is4.backpropagation(led3, 0, 0.1);
            is4.backpropagation(led4, 1, 0.1);
            is4.backpropagation(led5, 0, 0.1);
            is4.backpropagation(led6, 0, 0.1);
            is4.backpropagation(led7, 0, 0.1);
            is4.backpropagation(led8, 0, 0.1);
            is4.backpropagation(led9, 0, 0.1);
            is4.backpropagation(led0, 0, 0.1);
        }
    }

    public void edu5() {
        for (int i = 0; i < eduSteps; i++) {
            is5.backpropagation(led1, 0, 0.1);
            is5.backpropagation(led2, 0, 0.1);
            is5.backpropagation(led3, 0, 0.1);
            is5.backpropagation(led4, 0, 0.1);
            is5.backpropagation(led5, 1, 0.1);
            is5.backpropagation(led6, 0, 0.1);
            is5.backpropagation(led7, 0, 0.1);
            is5.backpropagation(led8, 0, 0.1);
            is5.backpropagation(led9, 0, 0.1);
            is5.backpropagation(led0, 0, 0.1);
        }
    }

    public void edu6() {
        for (int i = 0; i < eduSteps; i++) {
            is6.backpropagation(led1, 0, 0.1);
            is6.backpropagation(led2, 0, 0.1);
            is6.backpropagation(led3, 0, 0.1);
            is6.backpropagation(led4, 0, 0.1);
            is6.backpropagation(led5, 0, 0.1);
            is6.backpropagation(led6, 1, 0.1);
            is6.backpropagation(led7, 0, 0.1);
            is6.backpropagation(led8, 0, 0.1);
            is6.backpropagation(led9, 0, 0.1);
            is6.backpropagation(led0, 0, 0.1);
        }
    }

    public void edu7() {
        for (int i = 0; i < eduSteps; i++) {
            is7.backpropagation(led1, 0, 0.1);
            is7.backpropagation(led2, 0, 0.1);
            is7.backpropagation(led3, 0, 0.1);
            is7.backpropagation(led4, 0, 0.1);
            is7.backpropagation(led5, 0, 0.1);
            is7.backpropagation(led6, 0, 0.1);
            is7.backpropagation(led7, 1, 0.1);
            is7.backpropagation(led8, 0, 0.1);
            is7.backpropagation(led9, 0, 0.1);
            is7.backpropagation(led0, 0, 0.1);
        }
    }

    public void edu8() {
        for (int i = 0; i < eduSteps; i++) {
            is8.backpropagation(led1, 0, 0.1);
            is8.backpropagation(led2, 0, 0.1);
            is8.backpropagation(led3, 0, 0.1);
            is8.backpropagation(led4, 0, 0.1);
            is8.backpropagation(led5, 0, 0.1);
            is8.backpropagation(led6, 0, 0.1);
            is8.backpropagation(led7, 0, 0.1);
            is8.backpropagation(led8, 1, 0.1);
            is8.backpropagation(led9, 0, 0.1);
            is8.backpropagation(led0, 0, 0.1);
        }
    }

    public void edu9() {
        for (int i = 0; i < eduSteps; i++) {
            is9.backpropagation(led1, 0, 0.1);
            is9.backpropagation(led2, 0, 0.1);
            is9.backpropagation(led3, 0, 0.1);
            is9.backpropagation(led4, 0, 0.1);
            is9.backpropagation(led5, 0, 0.1);
            is9.backpropagation(led6, 0, 0.1);
            is9.backpropagation(led7, 0, 0.1);
            is9.backpropagation(led8, 0, 0.1);
            is9.backpropagation(led9, 1, 0.1);
            is9.backpropagation(led0, 0, 0.1);
        }
    }

    public void edu0() {
        for (int i = 0; i < eduSteps; i++) {
            is0.backpropagation(led1, 0, 0.1);
            is0.backpropagation(led2, 0, 0.1);
            is0.backpropagation(led3, 0, 0.1);
            is0.backpropagation(led4, 0, 0.1);
            is0.backpropagation(led5, 0, 0.1);
            is0.backpropagation(led6, 0, 0.1);
            is0.backpropagation(led7, 0, 0.1);
            is0.backpropagation(led8, 0, 0.1);
            is0.backpropagation(led9, 0, 0.1);
            is0.backpropagation(led0, 1, 0.1);
        }
    }

    public void is1() {
        System.out.println("1 => " + is1.forwardInputs(led1));
        System.out.println("2 => " + is1.forwardInputs(led2));
        System.out.println("3 => " + is1.forwardInputs(led3));
        System.out.println("4 => " + is1.forwardInputs(led4));
        System.out.println("5 => " + is1.forwardInputs(led5));
        System.out.println("6 => " + is1.forwardInputs(led6));
        System.out.println("7 => " + is1.forwardInputs(led7));
        System.out.println("8 => " + is1.forwardInputs(led8));
        System.out.println("9 => " + is1.forwardInputs(led9));
        System.out.println("--------------------------------");
    }
    public void is2() {
        System.out.println("1 => " + is2.forwardInputs(led1));
        System.out.println("2 => " + is2.forwardInputs(led2));
        System.out.println("3 => " + is2.forwardInputs(led3));
        System.out.println("4 => " + is2.forwardInputs(led4));
        System.out.println("5 => " + is2.forwardInputs(led5));
        System.out.println("6 => " + is2.forwardInputs(led6));
        System.out.println("7 => " + is2.forwardInputs(led7));
        System.out.println("8 => " + is2.forwardInputs(led8));
        System.out.println("9 => " + is2.forwardInputs(led9));
        System.out.println("--------------------------------");
    }
    public void test(double[] led){
        print(led);
        System.out.println("1 => " + is1.forwardInputs(led));
        System.out.println("2 => " + is2.forwardInputs(led));
        System.out.println("3 => " + is3.forwardInputs(led));
        System.out.println("4 => " + is4.forwardInputs(led));
        System.out.println("5 => " + is5.forwardInputs(led));
        System.out.println("6 => " + is6.forwardInputs(led));
        System.out.println("7 => " + is7.forwardInputs(led));
        System.out.println("8 => " + is8.forwardInputs(led));
        System.out.println("9 => " + is9.forwardInputs(led));
        System.out.println("9 => " + is9.forwardInputs(led));

        if(is1.forwardInputs(led) > 0.5) {
            System.out.println(" 1 ");
        }
        if(is2.forwardInputs(led) > 0.5) {
            System.out.println(" 2 ");
        }
        if(is3.forwardInputs(led) > 0.5) {
            System.out.println(" 3 ");
        }
        if(is4.forwardInputs(led) > 0.5) {
            System.out.println(" 4 ");
        }
        if(is5.forwardInputs(led) > 0.5) {
            System.out.println(" 5 ");
        }
        if(is6.forwardInputs(led) > 0.5) {
            System.out.println(" 6 ");
        }
        if(is7.forwardInputs(led) > 0.5) {
            System.out.println(" 7 ");
        }
        if(is8.forwardInputs(led) > 0.5) {
            System.out.println(" 8 ");
        }
        if(is9.forwardInputs(led) > 0.5) {
            System.out.println(" 9 ");
        }
        if(is0.forwardInputs(led) > 0.5) {
            System.out.println(" 0 ");
        }
    }
}
