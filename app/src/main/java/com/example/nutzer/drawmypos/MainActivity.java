package com.example.nutzer.drawmypos;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    TextView TVlong;
    TextView TVlat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TVlong = (TextView)findViewById(R.id. TVlong);
        TVlat = (TextView)findViewById(R.id. TVlat);

        //LocationManager locman = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

        LocationListener loclist = new LocationListener() {

            @Override
            public void onLocationChanged(Location location) {

                if (location != null)
                {
                    double pLong = location.getLongitude();
                    double pLat = location.getLatitude();

                    TVlong.setText(Double.toString(pLong));
                    TVlat.setText(Double.toString(pLat));
                }
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
