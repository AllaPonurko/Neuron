package Models.Neurons;

import java.util.Random;

public class MyNeuron {
    private double[]weights;
    private double bias;
    public MyNeuron(int num)
    {
        Random random=new Random();
        weights=new double[num];
        for (int i=0;i<num;i++)
        {
           weights[i]=random.nextDouble();

        }
        bias=random.nextDouble();
    }
    public double forwardInputs(double[]inputs)
    {double output=0;
        for (int i=0;i<inputs.length;i++)
        {
            output+=inputs[i]*weights[i];
        }
     output+=bias;
        output = 1 / (1 + Math.exp(-output));
      return output;
    }
    public void backpropagation(double[] inputs,
                                double expectedOutput,
                                double learningRate)
    {double output = forwardInputs(inputs);

        // Вычисляем ошибку нейрона
        double error = expectedOutput - output;

        // Корректируем веса и смещение с помощью градиентного спуска
        for (int i = 0; i < weights.length; i++) {
            weights[i] += error * inputs[i] * learningRate;
        }
        bias += error * learningRate;

    }
}
