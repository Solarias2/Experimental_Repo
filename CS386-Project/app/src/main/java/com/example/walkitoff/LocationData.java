package com.example.walkitoff;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class LocationData implements LocationListener {

    /*
    updates user location and provides information related to current location. This class can be
    considered a location listener as well.
     */

    // constants
    private static final int REQUEST_PERMISSION = 1;

    // member data
    private Location currentLocation;
    private LocationManager locationManager;

    private Context context;

    /**
     * Constructor gets current location when initialized
     */
    public LocationData( Context activity ) {

        context = activity;

        locationManager = ( LocationManager )context.getSystemService( Context.LOCATION_SERVICE );

        // get current location
        updateLocation();
    }

    /**
     * checks for appropriate location service permissions
     * <p>
     * method should always be called before updating location
     */
    private void checkPermission(){

        boolean missingPermissions = ActivityCompat.checkSelfPermission(context,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission
                        (context, Manifest.permission.ACCESS_COARSE_LOCATION)
                        != PackageManager.PERMISSION_GRANTED;

        // check for missing permissions
        if( missingPermissions ){

            // request permission to access location
            ActivityCompat.requestPermissions( (MainActivity)context,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_PERMISSION );
        }
    }

    /**
     * this method is for accessing the last known location outside of this class
     *
     * @return - currentLocation (Location)
     */
    public Location currentLocation(){

        return currentLocation;

    }

    /**
     * gets the last known location from location manager via gps services.
     * <p>
     * note: checks for permission granted before getting the current location
     */
    public void getLastLocation() {

        // check for appropriate permissions
        checkPermission();

        // update the current location
        currentLocation = locationManager.getLastKnownLocation( LocationManager.GPS_PROVIDER );

    }

    /**
     * updates the location
     *
     * note: uses locationManager's requestLocationUpdates with gps provider passed. This class
     * can also be considered a location listener
     */
    @SuppressLint("MissingPermission")
    public void updateLocation(){
        try{
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 5, LocationData.this );
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        getLastLocation();

    }

    /**
     * DO NOTHING (EXISTS ONLY TO GET RID OF BUILD ERROR)
     *
     * @param location
     */
    @Override
    public void onLocationChanged(@NonNull Location location) {

    }
}
