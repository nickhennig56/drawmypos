package com.example.nutzer.drawmypos;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by Nutzer on 04.11.2015.
 */
public class GPSTracker {

    double latitude;
    double longitude;

    LocationListener location = new LocationListener(){

        @Override
        public void onLocationChanged(Location location) {

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
