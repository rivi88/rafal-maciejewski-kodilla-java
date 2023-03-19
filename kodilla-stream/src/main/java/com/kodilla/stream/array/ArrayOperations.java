package com.kodilla.stream.array;

import java.util.List;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(List<Integer> numbers) {
        IntStream.range(0, numbers.size())
                .map(i -> numbers.get(i))
                .forEach(System.out::println);
        return IntStream.range(0, numbers.size())
                .map(i -> numbers.get(i))
                .average().getAsDouble();

    }
}
