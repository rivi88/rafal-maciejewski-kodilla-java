package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sum = 0.0;

        for (Double value : temperatures.getTemperatures().values()) {
            sum += value.doubleValue();
            System.out.println(sum);
        }

        return sum / temperatures.getTemperatures().size();
    }

    public double medianTemperature() {
        Collection<Double> values = temperatures.getTemperatures().values();
        List<Double> sortedValues = new ArrayList<>(values);
        Collections.sort(sortedValues);

        if (sortedValues.size() % 2 == 0) {
            int lowerMedianIndex = (sortedValues.size() / 2) - 1;
            int higherMedianIndex = (sortedValues.size() / 2);
            Double lowerMedian = sortedValues.get(lowerMedianIndex);
            Double higherMedian = sortedValues.get(higherMedianIndex);
            return (lowerMedian + higherMedian) / 2;
        } else {
            int mediumMedianIndex = (sortedValues.size() / 2);
            return sortedValues.get(mediumMedianIndex);
        }
    }
}
