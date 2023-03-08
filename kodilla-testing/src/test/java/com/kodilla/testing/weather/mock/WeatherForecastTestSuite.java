package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;

    @BeforeEach
    void before() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);

    }

    @Test
    void testAverageTemperatureWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double average = weatherForecast.averageTemperature();
        // when we compere places after dot: https://stackoverflow.com/questions/21165082/in-a-junit-test-how-can-i-assert-two-numbers-are-equal-without-considering-thei?fbclid=IwAR21AkEIDeGHfqxLOLlnThW4yZEL3O6MJ7FElIwbuDFo5Jf5HUcYPtEzyUU
        double delta = 0.001d;

        //Then
        Assertions.assertEquals((25.5 + 26.2 + 24.8 + 25.2 + 26.1) / 5, average, delta);

    }

    @Test
    void testMedianTemperatureWithMock() {
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double median = weatherForecast.medianTemperature();

        //Then
        Assertions.assertEquals(25.5, median);

    }
}
