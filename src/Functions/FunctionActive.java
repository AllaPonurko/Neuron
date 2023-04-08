package Functions;

import Intefaces.Neurons.ActivationFunction;

public class FunctionActive implements ActivationFunction {
    @Override
    public Double forward(Double x) {
        return x >= 1. ? 1. : 0.;
    }
}
