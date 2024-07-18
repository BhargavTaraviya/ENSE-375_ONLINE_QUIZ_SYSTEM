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

[5 Project Management](#_Toc43885143)

[6 Conclusion and Future Work ](#_Toc43885144)

[7 References](#_Toc43885145)

[8 Appendix](#_Toc43885146)

## List of Figures

## List of Tables

# <a name="_toc43885122"></a>**1. Introduction**
- This project focuses on designing and developing the Interactive Quiz System, a Java-based application for creating and managing quizzes. Our goal is to simplify the process of quiz administration so users can take and manage quizzes easily. Since traditional paper quizzes are time-consuming for feedback, and hard to save for long time, we are motivated to provide this quiz system for effective quiz management that benefits users. 
- The following sections will cover problem definition, design requirements and solutions. Finally, there is a conclusion and ideas for future work.

# <a name="_toc43885123"></a>**2. Design Problem**
## <a name="_toc43885124"></a>2.1 Problem Definition
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

## <a name="_toc43885125"></a>2.2 Design Requirements
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

# <a name="_toc43885129"></a>**3 Solution**

## <a name="_toc43885130"></a>3.1  Solution 1

Our initial solution was to implement the Interactive Quiz System using a basic structure focusing on essential functionalities. The primary features included a login system, adding quizzes, deleting quizzes, and viewing all quizzes. We aimed to build a foundation before adding more complex features. 

**Reason for Not Selecting This Solution** 

This approach had significant drawbacks. The application only supported adding quizzes without the ability to add questions and answers, making the system incomplete. Managing multiple users and quizzes through a CLI was unmanageable. Given these limitations, we decided that this solution would not be suitable for our project goals and needed further enhancement.

**Summary of Available Features**
- Login System: Basic user authentication to secure access.
- Add Quiz: Users can add quizzes to the system.
- Delete Quiz: Users can delete existing quizzes.
- View All Quizzes: Users can list all available quizzes.

## <a name="_toc43885131"></a>3.2  Solution 2
The second solution added more of the basic functionalities in the first solution by introducing additional features such as the ability to create, edit, and delete quizzes, add users, and manage quizzes with a structured approach. This version included the use of several classes to handle different parts of the quiz system which made the code more readable and easier to maintain.

**Reason for Not Selecting This Solution** 

While this solution was a good improvement over Solution 1, it still had some limitations. Specifically, it lacked a direct method to update an existing quiz. Users had to delete the old quiz and create a new one to update a quiz, which was not very user-friendly.

**Summary of Available Features**
- Login System: Authentication is supported for identifying admin and regular users.
-	Add Quiz: Admins can add quizzes with multiple questions, improving the method of the first solution.
-	Edit Quiz: Admins can edit existing quizzes, including quiz titles and questions.
-	Delete Quiz: Admins can also delete quizzes.
-	View All Quizzes: Both admins and regular users can view all the available quizzes, with detailed information on questions and options.
-	Take Quiz: Users can take quizzes and receive immediate scores, improving feedback system.
-	Add User: Admins can add new users which supports better user management.

## <a name="_toc43885132"></a>3.3 Final Solution

### <a name="_toc43885133"></a>3.3.1 Components

### <a name="_toc43885134"></a>3.3.2 features

### <a name="_toc43885135"></a>3.3.3 Environmental, Societal, Safety, and Economic Considerations

### <a name="_toc43885136"></a>3.3.4 Test cases and results

### <a name="_toc43885137"></a>3.3.5 Limitations

# <a name="_toc43885138"></a>**4 Team Work**

## <a name="_toc43885139"></a>4.1 Meeting 1

## <a name="_toc43885140"></a>4.2 Meeting 2

## <a name="_toc43885141"></a>4.3 Meeting 3

## <a name="_toc43885142"></a>4.4 Meeting 4

# <a name="_toc43885143"></a>**5 Project Management**

# <a name="_toc43885144"></a>**6 Conclusion and Future Work**

# <a name="_toc43885145"></a>**7 References**

# <a name="_toc43885146"></a>**8 Appendix**


