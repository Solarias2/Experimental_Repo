package com.example.walkitoff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Score {

    /*
    For storing, retrieving, and updating the user's total score and level. To be used by sound and
    theme classes to determine which sounds and themes are unlocked.
     */

    // member data
    private static int totalScore, userLevel, scoreReq;
    //userLevel = 1;
    //totalScore = 0;
    //scoreReq = 200;

    /**
     * default constructor
     */
    public Score(){
        totalScore = Integer.parseInt(MainActivity.uScore);
        userLevel = Integer.parseInt(MainActivity.uLevel);
    }

    /**
     * calculates the users level
     */
    private void calcLevel(){

        int maxLvl = 15;
        int scoreCurrent, multiplyer = 2;

        scoreCurrent = totalScore;

        if (scoreCurrent >= scoreReq)
            {
                userLevel += 1;
                scoreCurrent = scoreCurrent - scoreReq;
                scoreReq = scoreReq * multiplyer;
                while((scoreReq % 10) != 0)
                    {
                        scoreReq += 1;
                    }
            }

        if (userLevel == maxLvl)
            {
                scoreCurrent = scoreReq;
            }

        totalScore = scoreCurrent;
    }



    /**
     * gets the current user level from the database
     *
     * @return user level (int)
     */
    private int getLevelFromServer(){
      
        return Integer.parseInt(MainActivity.uLevel);
    }


    /**
     * gets the total score from the database
     *
     * @return total score (int)
     */
    private int getScoreFromServer(){

        return Integer.parseInt(MainActivity.uScore);
    }


    /**
     * used for accessing the total score from outside the class
     *
     * @return totalScore (int)
     */
    public double totalScore(){

        return totalScore;

    }

    /**
     * called when the user is done accumulating points. It updates the score and sends it to the
     * database
     *
     * @param points
     */
    public void updateScore( int points ){

        totalScore = points + totalScore;

    }

    /**
     * used for accessing the user level from outside the class
     *
     * @return userLevel (int)
     */
    public int userLevel(){

        return userLevel;

    }
}
