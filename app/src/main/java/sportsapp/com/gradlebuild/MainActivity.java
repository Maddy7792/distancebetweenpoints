package sportsapp.com.gradlebuild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import sportsapp.com.mydemogradledenpendency.activity.LatLonDistanceCalculator;
import sportsapp.com.mydemogradledenpendency.model.Point;

public class MainActivity extends AppCompatActivity {
    private TextView tvKilometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvKilometer=(TextView)findViewById(R.id.tv_kilometer);

        Point coordinates1 = new Point((float) -34.6037389, (float) -58.3815704);
        Point coordinates2 = new Point((float) 40.6892494, (float) -74.0445004);

       float distanceBetweenPoints =  LatLonDistanceCalculator.calculateDistance(coordinates1,coordinates2);
        tvKilometer.setText(String.valueOf(distanceBetweenPoints));
    }
}
