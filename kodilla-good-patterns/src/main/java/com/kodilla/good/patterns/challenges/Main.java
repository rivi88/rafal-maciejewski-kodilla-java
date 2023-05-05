package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String result = movieStore
                .getMovies()
                .values()
                .stream()
                .flatMap(movieTitles -> movieTitles.stream())
                .collect(Collectors.joining("!"));

        System.out.println(result);
    }
}
