package com.example.walkitoff;

import android.content.Context;
import android.location.Location;

public class Distance {

    /*
    this class keeps track of distance the user travelled.
    the plan is to create an object
     */

    private double travelledDistance, goalDistance;

    private Context mainContext;

    /*
    default distance goal in feet
     */
    private static final int DEFAULT_GOAL = 500;

    /**
     * default constructor
     *
     */
    public Distance( Context context ) {

        this( context, DEFAULT_GOAL );
    }

    /**
     * initialization constructor
     *
     * @param inGoalDistance - user set goal distance
     */
    public Distance( Context context, int inGoalDistance ) {

        travelledDistance = 0;

        goalDistance = inGoalDistance;

        mainContext = context;
    }

    /**
     * used to access travelled distance outside of class
     *
     * @return travelledDistance
     */
    public double getTravelledDistance(){

        return travelledDistance;
    }

    /**
     * called by setAlarm method in Alarm class.
     * <p>
     * updates distance every one second until goal distance is reached
     */
    public void trackDistance(){

        // loop while travelled distance less tha goal distance
        while( travelledDistance < goalDistance ){

            // call update distance
            updateDistance();
        }
        // end loop

    }

    /**
     * gets current distance between current location and last known location
     */
    private void updateDistance(){

        LocationData locationTracker = new LocationData( mainContext );

        double addedDistance;

        Location prevLocation = locationTracker.currentLocation();

        locationTracker.updateLocation();

        addedDistance = locationTracker.currentLocation().distanceTo( prevLocation );

        addedDistance = new UnitsOfMeasurement( addedDistance ).toFeet();

        travelledDistance += addedDistance;
    }

}
