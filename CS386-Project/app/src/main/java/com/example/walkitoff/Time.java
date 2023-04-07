package com.example.walkitoff;

public class Time {

    private int hour, minute;

    /**
     * initialization constructor
     *
     * @param inHour - hour of the day (24 hr format)
     * @param inMinute - minute of the hour
     */
    public Time( int inHour, int inMinute ){

        hour = inHour;
        minute = inMinute;
    }

    /**
     * parses time to string
     *
     * @return - parsed time (ex. 23:12 -> "2312") (String)
     */
    public String parseTime(){

        // variables
        String parsedHour = String.valueOf( hour );
        String parsedMinute = String.valueOf( minute );

        if( hour < 10 ){

            parsedHour = "0" + parsedHour;
        }

        if( minute < 10 ){

            parsedMinute = "0" + parsedMinute;
        }

        return parsedHour + parsedMinute;
    }

}
