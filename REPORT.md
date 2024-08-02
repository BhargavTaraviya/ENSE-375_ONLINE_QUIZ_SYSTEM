# ENSE 375 – Software Testing and Validation

# Interactive Quiz System

## Team Members:
- Trupalkumar Dharmeshbhai Ukani (200515399)
- Bhargav Taraviya (200518969)
- Yi Xu (200457644)

## Table of Contents

[1 Introduction](#_Toc43885122)

[2 Design Problem](#_Toc43885123)

[2.1 Problem Definition](#_Toc43885124)

[2.2 Design Requirements](#_Toc43885125)

[2.2.1 Functions](#_Toc43885126)

[2.2.2 Objectives](#_Toc43885127)

[2.2.3 Constraints](#_Toc43885128)

[3 Solution](#_Toc43885129)

[3.1 Solution 1](#_Toc43885130)

[3.2 Solution 2](#_Toc43885131)

[3.3 Final Solution](#_Toc43885132)

[3.3.1 Components](#_Toc43885133)

[3.3.2 Features](#_Toc43885134)

[3.3.3 Environmental, Societal, Safety, and Economic Considerations](#_Toc43885135)

[3.3.4 Test cases and results](#_Toc43885136)

[3.3.5 Limitations](#_Toc43885137)

[4 Team Work](#_Toc43885138)

[4.1 Meeting 1](#_Toc43885139)

[4.2 Meeting 2](#_Toc43885140)

[4.3 Meeting 3](#_Toc43885141)

[4.4 Meeting 4](#_Toc43885142)

[4.5 Meeting 5](#_Toc43885143)

[4.6 Meeting 6](#_Toc43885144)

[4.7 Meeting 7](#_Toc43885145)

[4.8 Meeting 8](#_Toc43885146)

[4.9 Meeting 9](#_Toc43885147)

[4.10 Meeting 10](#_Toc43885148)

[4.11 Meeting 11](#_Toc43885149)


[5 Project Management](#_Toc43885150)

[6 Conclusion and Future Work ](#_Toc43885151)

[7 References](#7-references)

## List of Figures
[1. Block Diagram](#_Toc43885152)  

[2. Gantt Chart](#_Toc43885153)
## List of Tables
[1. Solution Comparison Table](#_Toc43885154)

# <a name="_toc43885122"></a>**1 &nbsp;Introduction**
- This project focuses on designing and developing the Interactive Quiz System, a Java-based application for creating and managing quizzes. Our goal is to simplify the process of quiz administration so users can take and manage quizzes easily. Since traditional paper quizzes are time-consuming for feedback, and hard to save for long time, we are motivated to provide this quiz system for effective quiz management that benefits users. 
- The following sections will cover problem definition, design requirements and solutions. Finally, there is a conclusion and ideas for future work.

# <a name="_toc43885123"></a>**2 &nbsp;Design Problem**
## <a name="_toc43885124"></a>2.1 &nbsp;Problem Definition
### **Problems for Ineffective Quiz Management:**

**1. Inconvenience:** Traditional paper-based quizzes require significant time and efforts for distribution and evaluation. \
**2. Limited Accessibility:** Traditional methods do not support easy access and management of quizzes from remote locations, which can be lost somewhere easily. \
**3. Complexity of Existing Solutions:** Many existing digital solutions are overly complex and not user-friendly. 

### **Benefits of an Digital Solution:** 

**1. Improved Efficiency:** A digital system can automate quiz creation, distribution, and evaluation, saving time and effort. \
**2. User-Friendly Interface:** A straightforward interface makes it easier for users to manage quizzes. \
**3. Remote Accessibility:** Users can access and manage quizzes from any location, facilitating remote learning. 

### **Rationale** 

It was evident that there is a need for this project through the various issues related to the difficulties of using traditional approaches, as well as managing digital quiz packages and tools that are currently available. A wide range of users will benefit from improved management of quizzes provided by the Interactive Quiz System, which focuses on a simple, efficient, and accessible service. Our system avoids the major drawbacks of purely paper-based systems and complex electronic systems. It maintains the productivity of a system without some redundant features.

## <a name="_toc43885125"></a>2.2 &nbsp;Design Requirements
### <a name="_toc43885126"></a>2.2.1 Functions
The Interactive Quiz System provides the following key functions: 

- **Create Quiz**: Users can create new quizzes by adding various types of questions. 
- **Edit Quiz**: Users can modify existing quizzes, including updating quiz name and questions. 
- **Delete Quiz**: Users can remove existing quizzes from the system. 
- **Add Question**: Users can add new questions to quizzes, with different question types such as multiple choice and true/false. 
- **Edit Question**: Users can update the content of existing questions in the quiz. 
- **Take Quiz**: Users can participate in quizzes. The questions will be presented and answers chosen by users will be recorded. 
- **Score Quiz**: Automatically calculate and display score immediately after finishing the quiz, providing immediate feedback on performance.
### <a name="_toc43885127"></a>2.2.2 Objectives
The design of the Interactive Quiz System aims to achieve the following objectives: 

- **User-Friendly**: The system should provide an intuitive and easy-to-navigate interface to improve user interaction and satisfaction. 
- **Efficient**: The system should ensure a smooth and seamless user experience without causing errors. 
- **Responsive**: The system should offer real-time scoring and immediate feedback upon quiz completion. 
- **Reliable**: The system should function correctly and consistently under normal usage conditions, maintaining data integrity and accuracy. 
- **Maintainable**: The system should be designed with clean and modular code, facilitating easy maintenance and future enhancements. 
- **Secure**: The system should store user data and quiz content securely to prevent unauthorized access and ensure data privacy. 
### <a name="_toc43885128"></a>2.2.3 Constraints
The Interactive Quiz System will consider the following constraints: 

- **Economic factors:**  Since there is no budgets for this project, we will keep this project in a small size.
- **Regulatory compliance**: Users are required to sign in to the system for using the service, and we will prevent personal account information from leaking.
- **Reliability**: The quiz system can be maintained to ensure an excellent user experience
- **Ethics**: The grading criteria for the quizzes are equal for all users.

# <a name="_toc43885129"></a>**3 &nbsp;Solution**

## <a name="_toc43885130"></a>3.1 &nbsp;Solution 1

Our initial solution was to implement the Interactive Quiz System using a basic structure focusing on essential functionalities. The primary features included a login system, adding quizzes, deleting quizzes, and viewing all quizzes. We aimed to build a foundation before adding more complex features. 

**Reason for Not Selecting This Solution** 

This approach had significant drawbacks. The application only supported adding quizzes without the ability to add questions and answers, making the system incomplete. Managing multiple users and quizzes through a CLI was unmanageable. Given these limitations, we decided that this solution would not be suitable for our project goals and needed further enhancement.

**Summary of Available Features**
- Login System: Basic user authentication to secure access.
- Add Quiz: Users can add quizzes to the system.
- Delete Quiz: Users can delete existing quizzes.
- View All Quizzes: Users can list all available quizzes.

## <a name="_toc43885131"></a>3.2 &nbsp;Solution 2
For the second solution, the login system will identify admins and regular users. More basic functionalities are added based on the first solution by introducing additional features to create, edit, delete and manage quizzes with a structured approach. This version included the use of several classes to handle different parts of the quiz system which made the code more readable and easier to maintain.

**Reason for Not Selecting This Solution** 

While this solution was a good improvement over Solution 1, it still had some limitations. Without the input validations for the account system and quiz system, there could be many potential risks, leading to poor user experience. 

**Summary of Available Features**
- Login System: Authentication is supported for identifying admin and regular users.
-	Create Quiz: Admins can create quizzes with multiple questions, improving the method of the first solution.
-	Edit Quiz: Admins can edit existing quizzes, including quiz titles and questions.
-	Delete Quiz: Admins can also delete quizzes.
-	View All Quizzes: Both admins and regular users can view all the available quizzes, with detailed information on questions and options.
-	Take Quiz: Users can take quizzes and receive immediate scores, improving feedback system.
-	Add User: Admins can add new users which supports better user management.

## <a name="_toc43885132"></a>3.3 &nbsp;Final Solution
In the final solution, the validations for username and password are implemented. For quiz creation, admins will see error messages if any issues exist. The final solution contains all basic functionalities needed for an online quiz system. The table below shows the comparision among solutions of different versions. 
<a name="_toc43885154"></a>
| Functionalities/Solutions | Solution 1 | Solution 2 | Final Solution |
|:-------------------------:|:----------:|:----------:|:--------------:|
|        Login System       |      ✓     |      ✓     |        ✓       |
| Admin and User Separation |            |      ✓     |        ✓       |
|       Quiz Creation       |      ✓     |      ✓     |        ✓       |
|       Quiz Deletion       |      ✓     |      ✓     |        ✓       |
|       Quiz Execution      |            |      ✓     |        ✓       |
|        Quiz Edition       |            |      ✓     |        ✓       |
|      Input Validation     |            |            |        ✓       |

Table 1 - Solution Comparison Table
### <a name="_toc43885133"></a>3.3.1 Components
<a name="_toc43885152"></a>
In our solution, the components include Authentication system, Admins, Users, User Management, Quiz Management, Question Management and Quiz Execution. 

![Block Diagram](Documents/Block_Diagram.png)

Figure 1 - Block Diagram
### <a name="_toc43885134"></a>3.3.2 Features
- User Authentication: While logging in, show different menus for admins and users
- Add new user: Admins can add users by providing username and password that can pass the validation
- View all quizzes: Admins can view the quizzes they have made in the admin menu

### <a name="_toc43885135"></a>3.3.3 Environmental, Societal, Safety, and Economic Considerations
- Environmental Consideration: The online quiz system saves paper, and it will save a lot resources for long-term usage. 
- Societal Consideration: For professors, the online quiz system saves the time of collecting and distributing the quiz papers
- Safety Consideration: With login system and password validation, the safety of the account can be ensured
- Economic Consideration: As the time is not sufficient for a large-sized prpject, we keep this project small with all functionalities needed
### <a name="_toc43885136"></a>3.3.4 Test cases and results
For AddUser function, we use Boundry Value Testing, Decision Tables Testing and Equivalence Class Testing.  
For TakeQuiz function, we choose Use Case Testing. 
The Unit Testing and Integration Testing are also implemented. 
Detailed information about testing are provided in [TESTING.md](TESTING.md) file. 
### <a name="_toc43885137"></a>3.3.5 Limitations
- Lack of User Review: Users can not review the results of the quizzes they have taken before
- Weak User feedback: Users got an instant feedback which shows the mark they got, but they don't know the specific questions are right or wrong
# <a name="_toc43885138"></a>**4 &nbsp;Team Work**
### Here are the weekly meeting records:
## <a name="_toc43885139"></a>4.1 &nbsp;Meeting 1

Time: May 24, 2024: 9am to 11am  \
Agenda: Problem Definition Discussion
|           Team Member          | Previous Task | Completion State |      Next Task     |
|:------------------------------:|:-------------:|:----------------:|:------------------:|
| Trupalkumar Dharmeshbhai Ukani |      N/A      |        N/A       | Define the problem |
|        Bhargav Taraviya        |      N/A      |        N/A       | Define the problem |
|              Yi Xu             |      N/A      |        N/A       | Define the problem |

## <a name="_toc43885140"></a>4.2 &nbsp;Meeting 2

Time: May 30, 2024: 2pm to 4pm  \
Agenda: Design Requirements and Constraints Discussion
|               Team Member               |        Previous Task        | Completion State |                  Next Task                 |
|:---------------------------------------:|:---------------------------:|:----------------:|:------------------------------------------:|
|     Trupalkumar   Dharmeshbhai Ukani    |     Define the problem      |     100%         |     Define requirements                    |
|     Bhargav Taraviya                    |     Define the problem      |     100%         |     Define requirements and constraints    |
|     Yi Xu                               |     Define the   problem    |     100%         |     Define   constraints                   |

## <a name="_toc43885141"></a>4.3 &nbsp;Meeting 3

Time: June 6, 2024: 2pm to 4pm  \
Agenda: Brainstorming of Solutions and distribution of Solution 1 Tasks
|               Team Member               |                Previous Task               | Completion State |                         Next Task                     |
|:---------------------------------------:|:------------------------------------------:|:----------------:|:-----------------------------------------------------:|
|     Trupalkumar   Dharmeshbhai Ukani    |     Define requirements                    |     100%         |     Brainstorm Solution and write codes for solution1 |
|     Bhargav Taraviya                    |     Define requirements and constraints    |     100%         |     Brainstorm Solution and write codes for solution1 |
|     Yi Xu                               |     Define   constraints                   |     100%         |     Brainstorm Solution                               |

## <a name="_toc43885142"></a>4.4 &nbsp;Meeting 4

Time: June 13, 2024: 2pm to 5pm  \
Agenda: Review of Solution 1 Progress and Distribution of Solution 2 Tasks
|               Team Member               |                       Previous Task                      | Completion State |                            Next Task    |
|:---------------------------------------:|:--------------------------------------------------------:|:----------------:|:---------------------------------------:|
|     Trupalkumar   Dharmeshbhai Ukani    |     Brainstorm Solution and write codes for solution1    |     100%         |     Evaluate Solution1 and write codes for Solution 2           |
|     Bhargav Taraviya                    |     Brainstorm Solution and write codes for solution1    |     100%         |     Evaluate Solution1 and write codes for Solution 2           |
|     Yi Xu                               |     Brainstorm   Solution                                |     100%         |     Evaluate   Solution 1 and Check Markdown Document syntax    |

## <a name="_toc43885143"></a>4.5 &nbsp;Meeting 5

Time: June 20, 2024: 2pm to 4pm  \
Agenda: Review of Solution 2 Progress
|               Team Member               |                          Previous Task                          | Completion State |                             Next Task                            |
|:---------------------------------------:|:---------------------------------------------------------------:|:----------------:|:----------------------------------------------------------------:|
|     Trupalkumar   Dharmeshbhai Ukani    |     Evaluate Solution1 and write codes for Solution 2           |     80%          |     Complete Solution 2                                          |
|     Bhargav Taraviya                    |     Evaluate Solution1 and write codes for Solution 2           |     80%          |     Complete Solution 2                                          |
|     Yi Xu                               |     Evaluate   Solution 1 and Check Markdown Document syntax    |     90%          |     Documentation   for everything before Week 7 in REPORT.md    |

## <a name="_toc43885144"></a>4.6 &nbsp;Meeting 6

Time: June 27, 2024: 2pm to 4pm  \
Agenda: Final Solution Discussion
|               Team Member               |                           Previous Task                          | Completion State |                   Next Task                  |
|:---------------------------------------:|:----------------------------------------------------------------:|:----------------:|:--------------------------------------------:|
|     Trupalkumar   Dharmeshbhai Ukani    |     Complete Solution 2                                          |     100%         |     Think about final solution features      |
|     Bhargav Taraviya                    |     Complete Solution 2                                          |     100%         |     Think about testing                      |
|     Yi Xu                               |     Documentation   for everything before Week 7 in REPORT.md    |     100%         |     Think   about final solution features    |

## <a name="_toc43885145"></a>4.7 &nbsp;Meeting 7

Time: July 4, 2024: 2pm to 4pm  \
Agenda: Distribution of Final Solution Tasks
|               Team Member               |                 Previous Task                | Completion State |                     Next Task                     |
|:---------------------------------------:|:--------------------------------------------:|:----------------:|:-------------------------------------------------:|
|     Trupalkumar   Dharmeshbhai Ukani    |     Think about final solution features      |     100%         |     Write codes for Final solution and testing    |
|     Bhargav Taraviya                    |     Think about testing                      |     100%         |     Write codes for Final solution                |
|     Yi Xu                               |     Think   about final solution features    |     100%         |     Provide   feedback on Final solution          |

## <a name="_toc43885146"></a>4.8 &nbsp;Meeting 8

Time: July 11, 2024: 2pm to 4pm  \
Agenda: Review of Final Solution Progress
|               Team Member               |                    Previous Task                    | Completion State |                                    Next Task                                   |
|:---------------------------------------:|:---------------------------------------------------:|:----------------:|:------------------------------------------------------------------------------:|
|     Trupalkumar   Dharmeshbhai Ukani    |     Write codes for final solution and testing    |     50%          |     Write codes for final solution and testing                                 |
|     Bhargav Taraviya                    |     Write codes for final solution                  |     50%          |     Write codes for final solution                                             |
|     Yi Xu                               |     Provide   feedback on final solution            |     60%          |     Provide   feedback on final solution and do documentation for REPORT.md    |
## <a name="_toc43885147"></a>4.9 &nbsp;Meeting 9

Time: July 18, 2024: 2pm to 4pm  \
Agenda: Review of Final Solution Progress
|               Team Member               |                                  Previous Task                                 | Completion State |                         Next Task                        |
|:---------------------------------------:|:------------------------------------------------------------------------------:|:----------------:|:--------------------------------------------------------:|
|     Trupalkumar   Dharmeshbhai Ukani    |     Write codes for final solution and testing                                 |     80%          |     Complete final solution and testing                  |
|     Bhargav Taraviya                    |     Write codes for final solution                                             |     85%          |     Complete final solution                              |
|     Yi Xu                               |     Provide feedback   on final solution and do documentation for REPORT.md    |     70%          |     Complete   REPORT.md and TESTING.md documentation    |

## <a name="_toc43885148"></a>4.10 &nbsp;Meeting 10

Time: July 25, 2024: 2pm to 4pm  \
Agenda: Distribution of presentation Tasks
|               Team Member               |                       Previous Task                      | Completion State |                                  Next Task                                 |
|:---------------------------------------:|:--------------------------------------------------------:|:----------------:|:--------------------------------------------------------------------------:|
|     Trupalkumar   Dharmeshbhai Ukani    |     Complete final solution and testing                  |     100%         |     Prepare for presentation and make slides for presentation                 |
|     Bhargav Taraviya                    |     Complete final solution                              |     100%         |     Prepare for presentation                                               |
|     Yi Xu                               |     Complete   REPORT.md and TESTING.md documentation    |     100%         |     Complete   REPORT.md documentation and make slides for presentation    |

## <a name="_toc43885149"></a>4.11 &nbsp;Meeting 11

Time: August 1, 2024: 12:30pm to 3pm  \
Agenda: Presentation Recording
|               Team Member               |                                Previous Task                               | Completion State |                          Next Task                         |
|:---------------------------------------:|:--------------------------------------------------------------------------:|:----------------:|:----------------------------------------------------------:|
|     Trupalkumar   Dharmeshbhai Ukani    |     Prepare for presentation and make slides for presentation                                              |     90%         |     Complete presentation recording                        |
|     Bhargav Taraviya                    |     Prepare for presentation                                               |     100%         |     Complete presentation recording                        |
|     Yi Xu                               |     Complete   REPORT.md documentation and Make slides for presentation    |     90%         |     Complete   presentation recording and all documentation    |

# <a name="_toc43885150"></a>**5 &nbsp;Project Management**
Here is the Gantt Chart showing the work progress:
<a name="_toc43885153"></a>
![Gantt_Chart](Documents/Gantt_Chart.jpg)
Figure 2 - Gantt Chart
* The critical path is in red, and the slack is the black lines connected to non-critical activities.
* Weekends are excluded from the schedule.
* Testing is integrated throughout the coding process.
# <a name="_toc43885151"></a>**6 &nbsp;Conclusion and Future Work**
For ENSE 375 project, we learned a lot about how to design and develop a software step by step, and we understood software testing in a better way with a real project created by ourselves. Here are the design functions and objectives we have done: 
- Login system which can identify admins and regular users.
- Admins that can create, delete, edit and view quizzes.
- Quiz system that allows adding questions with many options.
- Testing system that provides notifications to users.
- Users that can take quiz and view quiz results.

For future work, a graphical user interface can be implemented for better user experience. Also, animations can be added relating to the quiz score. 

# <a name="7-references"></a>**7 &nbsp;References**

1. P. Ammann and J. Offutt, *Introduction to Software Testing*, 2nd ed. Cambridge, UK: Cambridge University Press, 2016.

2. "The Complete Guide to Software Testing," Guru99. [Online]. Available: [https://www.guru99.com/software-testing.html](https://www.guru99.com/software-testing.html).

3. "Effective Online Quiz Design," TEL Sussex. [Online]. Available: [https://blogs.sussex.ac.uk/tel/2015/08/04/effective-online-quiz-design/](https://blogs.sussex.ac.uk/tel/2015/08/04/effective-online-quiz-design/).

4. "Learn Java," W3Schools. [Online]. Available: [https://www.w3schools.com/java/](https://www.w3schools.com/java/).

5. "Introduction to Pattern Designing," GeeksforGeeks. [Online]. Available: [https://www.geeksforgeeks.org/introduction-to-pattern-designing/](https://www.geeksforgeeks.org/introduction-to-pattern-designing/).

6. "Java Best Practices," Stratoflow. [Online]. Available: [https://stratoflow.com/java-best-practices/](https://stratoflow.com/java-best-practices/).


## Video Demonstration

[Watch the Presentation video](https://drive.google.com/file/d/1LDc4oFJKZTE3qbhCy5GUTetkhg2fZ5ST/view?usp=drive_link)

