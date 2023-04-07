package com.example.walkitoff;

import java.util.HashMap;
import java.util.Map;

public class SoundName {

    public static String DEFAULT_SOUND = "Default";
    public static String SOUND_ONE = "Sound One";
    public static String SOUND_TWO = "Sound Two";
    public static String SOUND_THREE = "Sound Three";

    public static int getSound( String soundName ){

        Map<String, Integer> getSound = new HashMap<String, Integer>();

        getSound.put( DEFAULT_SOUND, R.raw.alarm_sound );
        getSound.put( SOUND_ONE, R.raw.second_alarm__sound );

        return getSound.get( soundName );
    }
}
