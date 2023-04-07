# CS386-Project (Walkitoff v. 1.0.0)

## Project Description

The walkitoff application is an alarm app that is intended to get you moving out of your bed. 
How it does this is by setting an alarm like normal but in addition to set an amount of distance (Initial being 500 ft). 
When the alarm goes off, the user must travel the amount of distance they selected by the use of google's mapping location. 
There would also be user levels and scoring connected to a database so that this can be set apart from the rest of the alarms . 
At certain levels, more features of the alarm would be available to the user, such as new alarm sounds and dark mode. 
Once they reach max level, the goal is for the user to be well off without the alarm due to the alarm's main objective of creating better waking habits in the morning.

## Prerequisites

### Intended Software to Download
===============================================================================================
#### Android Studio
This application is the base IDE for the creation of Walkitoff. It is an Android only app which is also the location for any User Interfaces created.

#### MySQL
This is the current database that Walkitoff uses. This is intended for storage of user levels and scores. 
This would be seen as the motivator for people because it can be used as a type of game in the morning, possibly driving people to accomplish tasks/objectives. 
There is a level system that once the set score has been reached, the application would give the user a new feature or unlock an item, depending on the new level.

#### Google Location
This is the GPS location used for the app's unique alarm system. This would trace your current location and measure how far the user has walked.
Once the set distance has been reached, the alarm would then shut off.

#### MediaPlayer
This is the sound player that the alarm system holds. 
Only one or two alarms would be given at the start but as the user gains levels, more alarms sounds would be available for selection.

#### JUnit
This is the test program needed for the coding. This would show what would need to be fixed and show what is properly implemented or not. 
This would be mainly used for calculations such as the scoring or user levels and see if they are giving the right results.

### How to Install
===============================================================================================
#### Android Studio
To receive this software, you must go to https://developer.android.com/studio and download the appropriate version and OS.
To find more OS versions, look for "Download Options" which will lead you to the page that contains Linux, Windows, Mac, and Chrome downloads.
Once downloaded, go ahead and execute the setup and follow the prompts the setup wizard gives until finished. 
After that, Android Studio has been completely installed

#### MySQL
To receive/use this software, first, you must go to  https://aws.amazon.com/rds/ to create an AWS account. 
Once created, You must create a RDS to what specification you would want. 
Once that is complete, go ahead and follow the instructions here https://aws.amazon.com/getting-started/hands-on/create-mysql-db/
From there, it is up and running, waiting for information to be sent to the database.

#### Google Location
Simply go to this https://developer.android.com/reference/android/location/LocationManager to import this into the class that is using this.
From there, it gives you access to the code and data necessary to pinpoint the location of the user. 
This would record the distance the user has traveled from point A to B and be used to calculate the distance to deactivate the alarm.

#### Android Media Player
In order to use the Android Media PLayer, simply follow the instructions given here https://www.tutorialspoint.com/android/android_mediaplayer.html

#### JUnit
To receive/use this program, you must go here https://junit.org/junit5/ and then download Jupiter, Vintage and Platform for this to work. 
Once all three are downloaded, they are all packages that can be added to the Android Studio and it would be able to create test forms similar to that of classes.
How to go about these tests is to go ahead and form simple code that the tests class is to expect the result of the code written by the programmer.
If the code doesn't match with the results, it would show red as an "error". Keep on refining the code until the program responds with green, meaning it is good.

## Testing

### End-to-End testing
To do a test for the break down, JUnit is intended to isolate the function or class from the rest of the code in order to see if that specific code is working as intended. 
Once we figure out that the code wors in that isolated environment, we can test that over multiple pieces of code and classes until all give the green light. 
With that, we can then go into the UI and possibly run the application to test the functions entirely. If anything were to be odd such as an error, debugging would be required upon what gave the error.

===============================================================================================
## Deployment
In order to deploy the app, you will need to release the app on available devices

## Built With
> Android Studio - The framework used for coding, testing and debugging\
> MySQL - the database used to store the information of users

## Contributions
Please read CONTRIUTING.md file for the details of the coding and the process of the pull requests

## Versioning
We use SemVer for versioning. (Current version use is at the top of the README file) 

## Authors
- Aiden Halili - aidenhalili
- Nick Maxwell - nbm58
- Justin Stouffe - Jstouffer33
- Michael Fletez - mfletez
- Jake Borneman - Solarais2
- Sean Krienke - aiden-halili-forks

## License
This project is licensed under the Apache Version 2.0 License - See LICENSE.md file for more detail.

