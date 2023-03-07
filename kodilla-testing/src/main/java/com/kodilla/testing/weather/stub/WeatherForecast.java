package com.kodilla.testing.weather.stub;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            sum += value;
        }

        return sum / temperatures.getTemperatures().size();
    }

    public double medianTemperature() {
        List<Double> values = (List<Double>) temperatures.getTemperatures().values();
        Collections.sort(values);

        if (values.size() % 2 == 0) {
            int lowerMedianIndex = (values.size() / 2) - 1;
            int higherMedianIndex = (values.size() / 2);
            Double lowerMedian = values.get(lowerMedianIndex);
            Double higherMedian = values.get(higherMedianIndex);
            return (lowerMedian + higherMedian) / 2;
        } else {
            int mediumMedianIndex = (values.size() / 2);
            return values.get(mediumMedianIndex);
        }
    }
}
