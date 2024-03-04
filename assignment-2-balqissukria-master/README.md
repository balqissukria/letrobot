[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/Aksgd23X)
## Requirements for Assignment #2
[Read the instruction](https://github.com/STIW3054-A222/class-activity-activityteam/blob/main/Assignment-2.md)

## Your Info:
1. 279865 Balqis Binti Sukria<br>![IMG_1032](https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/a30e3dff-f5dc-4ef2-882f-43fbc3f9f7ad)

2. Bot name : LectroBot
3. Bot Link : https://t.me/s279865_bot

## LectroBot
## Abstract (in 300 words)
   1. Background <br> This assigment is focus on developing a Telegram bot called "LectroBot" that interacts with users and performs database operations to search for lecturers especially in School Of Computing (SOC). This bot allow user to type in the name of the lecturer that they want to find and the result will be showed the room's number of the lecturers. This bot will use Telegram platform and will give advantage to student who are having difficulities in finding SOC's lecturers room.

   2. Problem Statement (from article or news paper or social media) <br> Finding lecturer information quickly and efficiently in educational institutions can be difficult for students, teachers, and staff. For lecturer information such as room number, manual searches or contacting administrative employees can be time-consuming and ineffective. Furthermore, using room numbers to locate lecturers nearby can be difficult. To improve the overall user experience, a system that automates the lecturer search process, delivers information that is accessible, and offers proximity-based details is needed. The student always lost when they want to go to class. It show that if the student can lost when finding class, therefore they will also have a diificulities to find lecturer's room. <br> <br> <img width="1440" alt="Screenshot 2023-06-05 at 10 36 05 PM" src="https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/df1705c1-b5e3-4f22-9965-0b317cc2ac3d"> <br><img width="1440" alt="Screenshot 2023-06-05 at 10 35 58 PM" src="https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/242b6332-7aff-4cc0-8888-4d824ee715ce"><br>
   3. Main objective <br>1. To search SOC lecturer's room <br>2. To count total number of SOC's lecturers <br> 3. To display the list of SOC's lecturers
   4. Methodology <br> 1. Requirements Analysis: Define the requirement and identify the objective.<br> 2. Set up Development Environment: Install the necessary tools and libraries for development. <br>3. Design User Interaction: Determine the commands and messages supported by the bot. Plan the flow of user interactions.<br>4. Implement Telegram Bot: Use the TelegramBots library to create a Telegram bot class. Handle user messages and commands.<br>5. Connect to Database: Establish a connection to the SQLite database using JDBC. <br> 6. Retrieve Lecturer Information: Implement methods to search for lecturers based on their names. Retrieve relevant details from the database. <br>7. Handle Nearby Lecturers: Develop logic to retrieve nearby lecturers based on room numbers. Format and display the information.<br> 8. Test and Debug: Conduct through testing of the system to ensure its functionality and address any issues or bugs. <br> 
   5. Result <br> A fully functional Telegram bot that users can interact with to search for lecturer information and receive relevant details have been developed. This telebot has ability for users to search for lecturers by their names and retrieve their full names, staff IDs, and room numbers. Next,the feature that retrieves and presents details of nearby lecturers based on the room number of the searched lecturer created.
   6. Conclusion <br> By employing this telegram bot (LectroBot), educational institutions can improve communication and engagement between students, faculty, and staff by streamlining the process of acquiring lecturer information. The bot saves users time and effort by offering a quick replacement for manual searches.

## UML Class Diagram <img width="1045" alt="Screenshot 2023-06-06 at 12 39 17 AM" src="https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/768ae1f4-2ab6-4800-ab64-65f1800e790d">


## JavaDoc
<img width="1440" alt="1" src="https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/3a63af30-643b-447c-831c-0de8052a16e9"><br>
<img width="1440" alt="2" src="https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/af7c7293-784b-4402-a085-bb0bf530d142"><br>
<img width="1440" alt="3" src="https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/3b778cd2-1660-42e1-8798-caddefd3c533"><br>
<img width="1440" alt="4" src="https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/28acbc60-3874-4fcc-9920-3f495fe995ce"><br>
<img width="1440" alt="5" src="https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/ae0b17e0-528b-48c5-8bb3-d89dfec72739">

## Result/Output (Screenshot of the output)
![PHOTO-2023-06-05-17-57-05](https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/c010742d-e419-4aed-9d3b-f57a0534f627)
<br> ![PHOTO-2023-06-05-17-57-05 2](https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/d18073f5-a7f9-4b01-8e8e-d42fed70d806)
<br>![PHOTO-2023-06-05-17-57-06](https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/038dd56e-eab4-4ddf-a451-7d22393a1caf)
<br>![PHOTO-2023-06-05-17-57-06 2](https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/fcf293a7-f209-453b-a339-16338e4fc300)
<br>![PHOTO-2023-06-05-17-57-06 3](https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/7111e9cb-e500-4faa-b9d5-d665ec66e1fe)
<br>![PHOTO-2023-06-05-17-57-06 4](https://github.com/STIW3054-A222/assignment-2-balqissukria/assets/102510966/604a36be-9e61-4f7c-80f6-1689c201e46f)

## References (Not less than 20)
1. YouTube. (2022, April 6). Creating and using a telegram bot with Java. YouTube. https://www.youtube.com/watch?v=LCuC88s6m4k <br>
2. M. (2021, January 10). GitHub - MonsterDeveloper/java-telegram-bot-tutorial: Java Telegram Bot Tutorial. Feel free to submit issue if you found a mistake. GitHub. https://github.com/MonsterDeveloper/java-telegram-bot-tutorial<br>
3. Telegram Bot API. (n.d.). Telegram Bot API. https://core.telegram.org/bots/api <br>
4. R. (2023, May 30). GitHub - rubenlagus/TelegramBots: Java library to create bots using Telegram Bots API. GitHub. https://github.com/rubenlagus/TelegramBots <br>
5. Creating and using a Telegram Bot with Java - Sebastian Daschner. (2022, April 6). Creating and Using a Telegram Bot With Java - Sebastian Daschner. https://blog.sebastian-daschner.com/entries/telegram-bot-with-java<br>
6. From BotFather to “Hello World.” (n.d.). From BotFather to “Hello World.” https://core.telegram.org/bots/tutorial<br>
7. Telegram Bot in Java, introduction for developers. (2018, September 17). CodeGym. https://codegym.cc/groups/posts/telegram-bot-in-java<br>
8. Wail Mardini, Yaser Khamayseh, and Ashraf Smadi. 2017. Messenger Bot for IoT devices. In Proceedings of the 9th International Conference on Information Management and Engineering (ICIME 2017). Association for Computing Machinery, New York, NY, USA, 182–186. https://doi-org.eserv.uum.edu.my/10.1145/3149572.3149611<br>
9. Viktoria Konovalova, Nikita Kazakov, Hamza Mohammed Ridha Al-Khafaji, Maxim Kovtsur, and Anton Kistruga. 2022. Messengers integration methods with corporate information systems: The introduction and application of instant messengers to the corporate information system. In The 5th International Conference on Future Networks &amp; Distributed Systems (ICFNDS 2021). Association for Computing Machinery, New York, NY, USA, 581–586. https://doi-org.eserv.uum.edu.my/10.1145/3508072.3508191<br>
10. Hang Li, Bevan Koopman, Ahmed Mourad, and Guido Zuccon. 2023. AgAsk: A Conversational Search Agent for Answering Agricultural Questions. In Proceedings of the Sixteenth ACM International Conference on Web Search and Data Mining (WSDM '23). Association for Computing Machinery, New York, NY, USA, 1140–1143. https://doi-org.eserv.uum.edu.my/10.1145/3539597.3573034<br>
11. Sarah Nikkhah, Andrew D. Miller, and Alyson L. Young. 2018. Telegram as An Immigration Management Tool. In Companion of the 2018 ACM Conference on Computer Supported Cooperative Work and Social Computing (CSCW '18). Association for Computing Machinery, New York, NY, USA, 345–348. https://doi-org.eserv.uum.edu.my/10.1145/3272973.3274093 <br>
12. Arash Dargahi Nobari, Negar Reshadatmand, and Mahmood Neshati. 2017. Analysis of Telegram, An Instant Messaging Service. In Proceedings of the 2017 ACM on Conference on Information and Knowledge Management (CIKM '17). Association for Computing Machinery, New York, NY, USA, 2035–2038. https://doi-org.eserv.uum.edu.my/10.1145/3132847.3133132 <br>
13. How to Find a Chat ID in Telegram. (2022, November 14). Alphr. https://www.alphr.com/find-chat-id-telegram/<br>
14. Telegram Bot - how to get a group chat id? (2015, September 6). Stack Overflow. https://stackoverflow.com/questions/32423837/telegram-bot-how-to-get-a-group-chat-id <br>
15. SQlite Java - How To Use JDBC To Interact with SQLite. (n.d.). SQLite Tutorial. https://www.sqlitetutorial.net/sqlite-java/ <br>
16. Working with Databases in Java: JDBC & SQLite. (2021, December 2). YouTube. https://www.youtube.com/watch?v=0beocykXUag <br>
17. Oliveira, M. (2022, June 16). How to Connect to SQLite with Java. Terminal Root. https://terminalroot.com/how-to-connect-to-sqlite-with-java/<br>
18. Java SQLite Example - javatpoint. (n.d.). www.javatpoint.com. https://www.javatpoint.com/java-sqlite <br>
19. How to create Telegram Bot in Java [ Tutorial ]. (2018, February 9). YouTube. https://www.youtube.com/watch?v=xv-FYOizUSY<br>
20. Java Telegram Bot. Lesson 1: Create Telegram Bot. (2020, July 16). YouTube. https://www.youtube.com/watch?v=rDU3RGlm37k<br>
21. G. (2023, May 30). Build software better, together. GitHub. https://github.com<br>
22. View of DESIGN OF ACADEMIC INFORMATION SYSTEM BASED ON BOT TELEGRAM IN SMART CAMPUS CONCEPT. (2023). Asrojournal-Sttal.ac.id. https://asrojournal-sttal.ac.id/index.php/ASRO/article/view/310/248


## Youtube Presentation
https://youtu.be/7sBb8zLDVDA

