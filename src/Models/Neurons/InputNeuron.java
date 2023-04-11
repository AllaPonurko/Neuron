package Models.Neurons;

import Functions.FunctionActive;
import Intefaces.Neurons.Neuron;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InputNeuron implements Neuron {
    //коллекция соединений нейронов
    private Set<Neuron> connections = new HashSet<>();
    //коллекция обратного соединения, хранящая нейрон и значение
    private final Map<Neuron, Double> backwardConnections = new HashMap<>();
    //коллекция входящих сигналов, хранящая нейрон и значение
    private final Map<Neuron, Double> inputSignals = new HashMap<>();
    //количество полученных сигналов
    private volatile int signalReceived;
    //смещение нейрона
    private double bias;
    //результат
    private volatile double forwardResult;
    //функция активации
    private FunctionActive activationFunction ;
//коллекция нейронов прямого соединения
    private final Set<Neuron> forwardConnections = new HashSet<>();
    @Override
    public  void forwardSignalReceived(Neuron from, Double value) {
        signalReceived++;
        inputSignals.put(from, value);
        // Следующий if – проверка на то, являлся ли текущий сигнал последним
        // оставшимся для получения. Если это так и все входные сигналы были
        // получены, Нейрон может начинать их обработку и испускать сигнал сам
        if (backwardConnections.size() == signalReceived) {
            // Нейрону для обработки входных сигналов необходимо 4 шага:
            // 1. Посчитать input = W * X + b
            // 2. Посчитать output = f(input), где f – функция активации
            // 3. Отправить output другим нейронам
            // 4. Аннулировать состояние

            // Шаг #1
            // Посчитать W * X + b – сумма всех входных сигналов, умноженных на
            // соответствующий ему вес.
            // Отклонение (bias) добавляется в конце.
            double forwardInputToActivationFunction
                    = backwardConnections
                    .entrySet()
                    .stream()
                    .mapToDouble(connection ->
                            // inputSignals хранит сигнал, где
                            // connection.getValue() дает вам
                            // вес, на который должен умножаться сам сигнал.
                            // Таким образом это и есть X * W.
                            inputSignals.get(connection.getKey())
                                    * connection.getValue())
                    .sum() + bias;

            // Шаг #2
            double signalToSend
                    = activationFunction.forward(
                    forwardInputToActivationFunction);
            forwardResult = signalToSend;

            // Шаг #3 Поскольку сигнал посчитан, теперь мы можем отослать
            // другим нейронам
//            forwardConnections
//                    .stream()
//                    .forEach(connection ->
//                            connection
//                                    .forwardSignalReceived(
//                                            ConnectedNeuron.this,
//                                            signalToSend)
//                    );
            // Шаг #4
            signalReceived = 0;
        }
    }

    @Override
    public void addForwardConnection(Neuron neuron) {
        connections.add(neuron);
    }

    @Override
    public void addBackwardConnection(Neuron neuron, Double weight) {
        backwardConnections.put(neuron, weight);
        inputSignals.put(neuron, Double.NaN);
    }
}
