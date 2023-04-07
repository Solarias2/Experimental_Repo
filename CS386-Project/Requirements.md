#1.1 Problem Statement
  
  * The problem of waking up affects all areas of society. The impact of which is 
  missed deadlines, poor health, lack of self-discipline, low motivation.

--------------------------------------------------------------------------------------------------------

#1.2 Product Position Statement

 * For all individuals who struggle with waking up, or desire self improvement, Walkitoff is a lifestyle app that
 improves user health, and self discipline. Unlike stock alarm apps our product ensures users rise to the occasion whatver it may be.

----------------------------------------------------------------------------------------------------------

#1.3 Value Proposition and customer segment
 
 * Walkitoff is a lifestyle app that  allows individuals who struggle with mornings, to fundamentally change how they handle beginning their day
 by utilizing location data to physically require users to get up and move.

-----------------------------------------------------------------------------------------------------------

#2 Stakeholders

* Users- The people that will be using our app are people that struggle to wake up in the morning. These users are ones that constantly snooze their alarms, and are unmotivated to get up and start their day in the morning. 

* Clients- The people that will be investing in our app are ones who believe that it could be of real use to a large demographic of people. These clients are ones who do not think that regular alarm clocks work as well as our app does at waking people up.

* Competitors- Our competitors are other alarm clock apps that have different ideas to get someone out of bed. These competitors have apps like: motion alarm clocks (shake it to stop), alarmy (take photo in a certain place), or barcode alarm clock (take picture of bar code on an item).

* Detractors- The detractors of this app will be people who feel as though regular alarm clocks work perfectly fine to wake up people.

* Developers- The developers of this app will be developers who have knowledge of android software programming, and Java software programming.

-----------------------------------------------------------------------------------------------------------

#3 Functional requirements

**1.)** The app accepts user input for time and sound

**2.)** When the alarm sounds, it will only shut off if a certain distance is traveled.

**3.)** 500 feet is the minimum distance for the alarm to shut off, but the user can input a higher target distance.

**4.)** Every foot travelled equates to a single point, which will go towards the user's all time score.

**5.)** When a certain amount of points are accumulated, new features will become available to the user(new alarm sounds, dark mode, etc.)

**6.)** The user can also press a button to track their walking distance without having to enable an alarm

-------------------------------------------------------------------------------------------------------------

#4 Non-functional requirements

**1.)** Resource utilization - Utilizes user device's location services

**2.)** User interface aesthetics - Contains light colors which are easy on the eyes. The user can change the color scheme to suit their tastes

**3.)** User error protection - A number wheel will be used to minimize accidentally incorrect input.

**4.)** Accessibility - Contains three items in the bottom navigation bar to make it easy to navigate: Alarm, track distance only, score details, and settings.

**5.)** Availability - Will require user location services to use alarm and distance tracking feature.

**6.)** Recoverability - Regularly updates user score in server to minimize chance of losing progress.

**7.)** Confidentiality - Location services are only acquired via user consent.

-------------------------------------------------------------------------------------------------------------

#5 MVP

 *  For developing the minimal viable product for this project, we will first focus on the very foundation of this project: the alarm. When launching the app, the user should be able to give the app permission
to access location services. The user will then be able to manually set an alarm. The user can select the time via a timepicker wheel. When the selected time arrives, the alarm will sound repeatedly until a minimum distance
of 500 feet is travelled. After that, the total distance travelled is sent to add to the users score. The MVP will have one new alarm sound and one new theme to unlock in order to demonstrate the progression system.
 
---------------------------------------------------------------------------------------------------------------

#6 Use Cases

**1.)** ![use case diagram](https://user-images.githubusercontent.com/71902318/134839863-7eaf3f85-66e7-4672-9304-ab1356dd31f1.PNG)


**2.)** 

Use Case: Set Alarm Sound <br />
Actor: User <br />
Description: User sets a sound to use for when the alarm clock goes off <br />
Precondition: User is on the settings section of the app <br />
Post-condition: Alarm sound is set to selected audio <br />
Main flow: <br />
1. User click on settings.
2. Click on "set alarm sound". 
3. Click on each sound to sample it.
4. Click on "choose sound" to select sound. <br />

Alternative flows: <br />
1. App is closed out.
2. User goes back to main screen of app. 

Use Case: Set Distance <br />
Actor: User <br />
Description: User sets distance for user to travel in order to turn off the alarm. <br />
Precondition: User is on the settings section of the app <br /> 
Post-condition: Distance is set <br /> 
Main flow: <br />
1. User click on settings.
2. Click on "set distance". 
3. Type in numerical value for distance, and choose "ft", "mi", or "yd" for a unit of measurement. <br /> 

Alternative flows: <br />
1. App is closed out.
2. User goes back to main screen of app. 

Use Case: Set Alarm Clock <br />
Actor: User <br /> 
Description: User sets time for alarm clock to sound. <br />
Precondition: User is on the settings section of the app <br /> 
Post-condition: Alarm is set <br />
Main flow: <br />
1. User click on settings.
2. Click on "set alarm". 
3. Type in time in numerical value and choose "AM" or "PM". <br />

Alternative flows: <br />
1. App is closed out.
2. User goes back to main screen of app. 

Use Case: Delete Alarm <br />
Actor: User <br /> 
Description: User deletes the set time for the alarm to go off. <br /> 
Precondition: User is on the settings section of the app <br /> 
Post-condition: Alarm is deleted <br /> 
Main flow: <br />
1. User click on settings.
2. Click on "delete alarm". <br /> 

Alternatives flows: <br /> 
1. App is closed out.
1. User goes back to main screen of app. 

Use Case: Set Goal <br />
Actor: User <br /> 
Description: User sets a goal for how far they want to move. An achievement could be unlocked by meeting this distance. <br /> 
Precondition: User is on the settings section of the app <br /> 
Post-condition: Goal is set <br /> 
Main flow: <br />
1. User click on settings.
2. Click on "set goal". 
3. Type in numerical value for distance, and choose "ft", "mi", or "yd" for a unit of measurement. <br /> 

Alternative flows: <br />
1. App is closed out.
2. User goes back to main screen of app. 

Use Case: Choose Activity <br />
Actor: User <br /> 
Description: User sets an activity they want to do in order to fulfill the alarm clock's distance requirements. <br /> 
Precondition: User is on the settings section of the app <br /> 
Post-condition: Acitvity is set <br /> 
Main flow: <br />
1. User click on settings.
2. Click on "choose activity". 
3. Choose between walking, running, or biking. <br /> 

Alternative flows: <br />
1. App is closed out. 
2. User goes back to main screen of app.

---------------------------------------------------------------------------------------------------------------

#7 User Stories

**1.)** As a user, I want to be active so that I have a productive morning. (Priority: 3, Estimated time: ~13-16 hours)

**2.)** As a heavy sleeper, I want a loud and somewhat high-pitched alarm sound so that I wake up. (Priority: 3, Estimated time: ~13-16 hours)

**3.)** As someone who sleeps in a lot, I want to be given a task in order to shut off my alarm so that I don't laze around in bed. (Priority: 4, Estimated time: ~15-20 hours)

**4.)** As an ambitious user, I want to set higher distance goals so that I can challenge myself. (Priority 2: Estimated time: ~4-5 hours)

**5.)** As a fitness-oriented user, I want to be able to track my walking distance without having to set up an alarm. (Priority: 4, Estimated time: ~15-20 hours)

**6.)** As a user, I want to unlock new features so that I can have fun. (Priority: 4, Estimated time: ~15-20 hours)

**7.)** As a disciplined sleeper, I want my friends to wake up so that we all can do things at the same time. (Priority: 2, Estimated time: ~15-20 hours)

**8.)** As someone rarely motivated, I want to see my progress over time so that I can feel accomplished. (Priority 4: Estimated time ~15-20 hours)

**9.)** As a user, I want to save my alarm settings so that I can save time. (Priority: 2, Estimated time: ~15-20 hours)

**10.)** As a user, I want my walks to be timed so that I can aim to improve my walking speed. (Priority: 3, Estimated time: ~13-16 hours)

**11.)** As a user, I want a concise navigation bar so that I can easily learn it. (Priority: 1, Estimated time: ~4-5 hours)

**12.)** As a runner, I want the option to track my distance in miles so that I don't have to convert units of measurement. (Priority: 3, Estimated time: ~13-16 hours)

-------------------------------------------------------------------------------------------------------------------

#8 Issue Tracker

* Link- https://trello.com/cs386walkitoff/home

* Screenshot- ![issue tracker](https://user-images.githubusercontent.com/72279824/134845243-d133873c-a85d-443d-a924-6f9ad7a26a1f.PNG)
