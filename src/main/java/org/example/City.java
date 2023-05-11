package org.example;

public class City {
    private final String name;
    private final double latitude;
    private final double longitude;

    private boolean isVisited = false;

    private boolean isStartingPoint = false;

    public City(final String name, final double latitude, final double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(final boolean visited) {
        isVisited = visited;
    }

    public boolean isStartingPoint() {
        return isStartingPoint;
    }

    public void setStartingPoint(final boolean startingPoint) {
        isStartingPoint = startingPoint;
    }
}
