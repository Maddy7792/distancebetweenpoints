package sportsapp.com.mydemogradledenpendency.activity;

import sportsapp.com.mydemogradledenpendency.model.Point;

/**
 * Created by dennis on 6/6/17.
 */

public class LatLonDistanceCalculator {
    private static final int EARTH_RADIUS_IN_KILOMETERS = 6371;

    public static float calculateDistance(Point pointA,
                                          Point pointB) {

        double dLat = Math.toRadians(pointB.getmLatitude()
                - pointA.getmLatitude());

        double dLng = Math.toRadians(pointB.getmLongitude()
                - pointA.getmLongitude());

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(pointA.getmLatitude())) *
                        Math.cos(Math.toRadians(pointB.getmLatitude())) *
                        Math.sin(dLng / 2) * Math.sin(dLng / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return (float) (EARTH_RADIUS_IN_KILOMETERS * c);
    }
}
