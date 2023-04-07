**#1. Introduction**

WalkItOff is a lifestyle app that allows individuals who struggle with mornings, to fundamentally change how they handle beginning their day. WalkItOff utilizes location services to pinpoint user location. Users will set an alarm, and must walk a set distance utilizing the GPS coordinates in order to shut the alarm off. Further implementations include a hi score system, to facilitate competition and further motivation amongst users. The app will eventually have a leveling system, that will allows users to select earned sounds as new alarms based on prior successful uses of the app.

Github: https://github.com/aidenhalili/CS386-Project

Trello:   https://trello.com/cs386walkitoff/members?utm_source=eval-email&utm_medium=email&utm_campaign=team-invite




**#2. Implementation Requirements**


Requirement: As a user, I want to set an alarm.                                             
Issue: https://github.com/aidenhalili/CS386-Project/blob/main/app/src/main/java/com/example/walkitoff/Alarm.java                          
Pull Request: https://github.com/aidenhalili/CS386-Project/commit/4a38340273f577702dfd406ee4a760aa4907cf18      
Implemented by: Aiden                                     
Approved by: Aiden                                     
Print Screen:![Screenshot_20211024-212223_WalkItOff12](https://user-images.githubusercontent.com/89927293/138635210-9a9cb06c-5873-4687-813c-2e9f8ebfb793.jpg)

                                                                             

Requirement: As a user, I want to complete the distance to turn off the alarm.                       
Issue: https://github.com/aidenhalili/CS386-Project/blob/main/app/src/main/java/com/example/walkitoff/Distance.java                            
Pull Request: https://github.com/aidenhalili/CS386-Project/commit/7a51479cd78e16b29d85715cacb6659d639ddb48                             
Implemented by: Aiden, Justin                                                
Approved by: Aiden                                             
Print Screen:             ![Screenshot_20211024-212223_WalkItOff12](https://user-images.githubusercontent.com/89927293/138635334-fe8c82e7-bd9f-44c9-8cff-1f071a8e318f.jpg)
                                                              

Requirement: As a user, I want to see my total score.                                 
Issue: https://github.com/aidenhalili/CS386-Project/blob/main/app/src/main/java/com/example/walkitoff/Score.java                                   
Pull Request: https://github.com/aidenhalili/CS386-Project/commit/f76d54b393b3da167dbb6a5de2fa97db301dec0b                                     
Implemented by: Nick, Jake                                               
Approved by: Aiden                                                           
Print Screen:
![Screenshot_20211024-205624_WalkItOff3](https://user-images.githubusercontent.com/89927293/138635246-074011d8-fd08-49dc-b537-25e26af4c0b0.jpg)

                                                                
Requirement: As a user, I want to unlock new features so that I can have fun.                                                    
Issue: https://github.com/aidenhalili/CS386-Project/blob/main/app/src/main/java/com/example/walkitoff/Sound.java                           
Pull Request: https://github.com/aidenhalili/CS386-Project/pull/52                   
Implemented by: Michael, Aiden                              
Approved by: Aiden                          
Print Screen:                   ![Screenshot_20211024-212223_WalkItOff12](https://user-images.githubusercontent.com/89927293/138635371-96e85f5e-4e59-4e0f-8e47-5f246031ac1a.jpg)
                                                                                                                                       


**#3. Tests**


**#4. Adopted Technologies**


1. *__Android Studio__* - Used for UI design, implementation of android app -- We chose this because it is the framework required to build an android app

2. *__MediaPlayer Class__* - Class inside Android Studio, used to control playback of audio -- We chose this because it was a built in class that met all of our sound needs

3. *__LocationManager Class__* - Class inside Android Studio, used to access location services on Android device -- We chose this because it was the simplest implementation of what we required in a location class, and it did not require using google play services

4. *__MySQL Database Management System__* - Third party software used to store user information on a separate server -- We chose this because we are the most familiar with this database management system, and it offers all the services we need to track our users data 



**#5. Learning/training**

The strategy that our team used to learn the adopted technologies was the extreme programming strategy. This strategy was useful because it allowed us to work efficiently, and by planning in small batches of work we were able to learn as we contributed to the project. The fine scale feedback aspect of extreme programming led to great communication amongst the team members, and if one of us ran into an issue or found out new useful information we would share it with the other team members. Continuous integration by submitting pull requests to the project also allowed us to see how others solved issues we might be having, and discussing it with each other furthered everyone's understanding of the technologies we were using. Communication was key in getting started with the technologies we are using, and extreme programming was a major part in that.



**#6. Deployment**
 
 
Our app will be deployed on android devices in production using the google play store. Our Database runs on the Amazon Web Services Relation Database service, using MYSQL.

System: https://developer.android.com/distribute/google-play

System: https://aws.amazon.com/rds/



**#7. Licensing**
https://www.apache.org/licenses/LICENSE-2.0
We have decided to adopt this license as a means to keep our code safe and protected so that people would not maliciously steal any code or property that our group has created outside of the original owners of the code we had adopted from them. This License specifically gives a free reign for anyone wanting to modify or mess with it but only under the given permission from the file owner. If the License is broken or violated, necessary actions would need to be taken.



**#8. Readme File**

Code of conduct: https://github.com/aidenhalili/CS386-Project/blob/main/CODE_OF_CONDUCT.md

Contributing: https://github.com/aidenhalili/CS386-Project/blob/main/CONTRIBUTING.md

Readme: https://github.com/aidenhalili/CS386-Project/blob/main/README.md


**#9. Look & Feel**

We wanted the look to be simple and accessible. Based on our interviews, we found that the interviewees don't see a significant value
in other features besides the alarm, and they also didn't care for extensive alarm customization. The user only needs to have a time and sound selected
before setting the alarm. We made sure to include a minimal amount of self explanatory buttons so that users can instantly learn how to use the app.
There is also a button to log in to the server, which is something that the developers use for testing and will be altered for the final product.

![](https://github.com/aidenhalili/CS386-Project/blob/main/Screenshot1.jpg?raw=true)
![Screenshot_20211024-205624_WalkItOff3](https://user-images.githubusercontent.com/89927293/138636181-120b50ec-e4d6-485d-8c32-d1e0eac86325.jpg)



**#10. Lessons Learned**

In retrospective our team found themselves learning far more than anticipated. There was a general consensus that the proper use of and knowledge of tools such as IDE’s API’s etc, are paramount and cannot be emphasized enough. We found that tracking and motivating individual developer performance can have challenges aswell.

**#11. Demo**

Link - [https://www.youtube.com/watch?v=QrXdFJhgnxM)
