package sportsapp.com.mydemogradledenpendency.model;

/**
 * Created by dennis on 6/6/17.
 */

public class Point {

    float mLatitude;
    float mLongitude;

    public Point(float mLatitude, float mLongitude) {
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
    }

    public float getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(float mLatitude) {
        this.mLatitude = mLatitude;
    }

    public float getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(float mLongitude) {
        this.mLongitude = mLongitude;
    }
}
