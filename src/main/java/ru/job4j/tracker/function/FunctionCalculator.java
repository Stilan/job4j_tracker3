package ru.job4j.tracker.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> resultList = new ArrayList<>();
        for (int i = start; i < end; i++) {
            resultList.add(function.apply((double) i));
        }
        return resultList;
    }
}
