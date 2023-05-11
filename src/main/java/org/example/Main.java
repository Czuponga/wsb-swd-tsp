package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final List<City> allCities = CitiesGenerator.generateCities();

        final City startingCity = getStartingCity(allCities);

        final Map<City, Double> startingDistanceMap = CitiesUtils.getDistanceMap(startingCity, allCities);

        Map<City,Double> closestSixStartingCities =
                CitiesUtils.getClosestCities(startingDistanceMap, 6);

        final List<City> citiesOrder = new ArrayList<>();
        citiesOrder.add(startingCity);

        City currentCity = startingCity;

        Map<City, Double> closestSixCities = closestSixStartingCities.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Map<City, Double> distanceMap = closestSixCities.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        for (int i = 0; i < allCities.size(); i++) {
            currentCity = closestSixCities.entrySet().stream().findFirst().get().getKey();
            citiesOrder.add(currentCity);
            currentCity.setVisited(true);

            distanceMap = CitiesUtils.getDistanceMap(currentCity, allCities);
            closestSixCities = CitiesUtils.getClosestCities(distanceMap, 6);
        }

        citiesOrder.forEach(c -> System.out.print(c.getName() + ", "));

        /*for (Map.Entry<City, Double> entry : closestSixCities.entrySet()) {
            final City currentCity = entry.getKey();


        }*/
    }

    private static City getStartingCity(final List<City> allCities) {
        Random rand = new Random();
        int startingPoint = rand.nextInt(allCities.size());
        final City startingCity = allCities.get(startingPoint);
        startingCity.setStartingPoint(true);

        return startingCity;
    }
}