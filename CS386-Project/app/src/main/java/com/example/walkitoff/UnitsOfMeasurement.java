package com.example.walkitoff;

@SuppressWarnings("unused")
public class UnitsOfMeasurement {

    /*
    for converting the distance to units of measurements (from meters)
     */
    private double distance;

    /**
     * initialization constructor
     *
     * @param inDistance - either goal distance or distance traveled
     */
    public UnitsOfMeasurement( double inDistance ){

        // set distance to parameter
        distance = inDistance;
    }

    /**
     * returns distance value from meters to feet
     *
     * @return distance in ft (double)
     */
    public double toFeet(){

        // variables
        double feetPerMeter = 3.208;

        // temp return stub
        return distance * feetPerMeter;
    }

    /**
     * returns distance value from meters to kilometers
     *
     * @return distance in km (double)
     */
    public double toKilometers(){

        // variables
        double kilometersPerMeter = 0.001;

        // temp return stub
        return distance * kilometersPerMeter;
    }

    /**
     * distance already in meters, return as is
     *
     * @return - distance (double)
     */
    public double toMeters(){

        // return distance
        return distance;
    }

    /**
     * returns distance value from meters to miles
     *
     * @return distance in miles (double)
     */
    public double toMiles(){

        // variables
        double milesPerMeter = 0.000621371;

        // temp return stub
        return distance * milesPerMeter;
    }

    /**
     * returns distance value from meters to yards
     *
     * @return distance in yards (double)
     */
    public double toYards(){

        // variables
        double yardsPerMeter = 1.09361;

        // temp return stub
        return distance * yardsPerMeter;
    }
}
