package org.example;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CitiesUtils {
    public static Map<City, Double> getDistanceMap(final City currentCity, final List<City> allCities) {
        final Map<City, Double> distancesMap = new HashMap<>();
        for (City city : allCities) {
            if (city.equals(currentCity)) {
                continue;
            }

            final double distance = getDistance(currentCity.getLatitude(), currentCity.getLongitude(), city.getLatitude(), city.getLongitude());

            distancesMap.put(city, distance);
        }

        return distancesMap;
    }

    public static Map<City, Double> getClosestCities(final Map<City, Double> distanceMap, final int resultsCount) {
        return distanceMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .filter(c -> !c.getKey().isVisited())
                .limit(resultsCount)
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    /**
     * Calculate distance between two points in latitude and longitude taking
     * into account height difference. If you are not interested in height
     * difference pass 0.0. Uses Haversine method as its base.
     * <p>
     * lat1, lon1 Start point lat2, lon2 End point el1 Start altitude in meters
     * el2 End altitude in meters
     *
     * @returns Distance in Meters
     */
    public static double getDistance(double lat1, double lon1, double lat2,
                                     double lon2) {

        final int R = 6371; // Radius of the earth

        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters

        double height = 0.0;

        distance = Math.pow(distance, 2) + Math.pow(height, 2);

        return Math.sqrt(distance);
    }
}
