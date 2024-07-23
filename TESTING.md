# Boundry Value Testing
## Functional Requirements:  
1.	The system must allow adding a new user with a unique username and password.
2.	The username must not exceed 15 characters.
3.	The username must not contain any special characters.
4.	The password must be at least 6 characters long.
5.	The password must not exceed 15 characters.

## Non-functional Requirements:
1.	The system should provide feedback messages for invalid inputs.
2.	The system should successfully add the user if all inputs are valid.

## Test Requirements for AddUser function:  
1.	Test the lower and upper boundary values for the username length.
2.	Test the lower and upper boundary values for the password length.
3.	Test the presence of special characters in the username.
4.	Verify that appropriate error messages are displayed for invalid inputs.
5.	Verify that the user is added successfully for valid inputs.

Here is the table for AddUser class:

|     Test Case    |                  Test Description                 |     Username Length    |     Password Length    |     Username Contains Special Character    |                    Expected Result                   |
|:----------------:|:-------------------------------------------------:|:----------------------:|:----------------------:|:------------------------------------------:|:---------------------------------------------------:|
|         1        |     Minimum valid username and password length    |            1           |            6           |                      No                    |                User added successfully              |
|         2        |           Minimum invalid username length         |            0           |            6           |                      No                    |     Username cannot be longer than 15 characters.   |
|         3        |      Just below maximum valid username length     |            14          |            6           |                      No                    |                User added successfully              |
|         4        |        Exactly maximum valid username length      |            15          |            6           |                      No                    |                User added successfully              |
|         5        |      Just above maximum valid username length     |            16          |            6           |                      No                    |     Username cannot be longer than 15 characters.   |
|         6        |            Minimum valid password length          |            6           |            6           |                      No                    |                User added successfully              |
|         7        |      Just below minimum valid password length     |            6           |            5           |                      No                    |   Password must be at least 6 characters long.  |
|         8        |         Just below maximum valid password length  |            6           |            14          |                      No                    |        User added successfully                  |
|         9        |          Exactly maximum valid password length    |            6           |            15          |                      No                    |           User added successfully             |
|        10        |        Just above maximum valid password length   |            6           |            16          |                      No                    |   Password cannot be longer than 15 characters. |
|        11        |            Username with special characters       |            6           |            6           |                     Yes                    |   Username cannot contain special characters.   |
|        12        |          Username and password at upper bounds    |            15          |            15          |                      No                    |    User added successfully  |
|        13        |         Username and password at lower bounds     |            1           |            6           |                      No                    |       User added successfully            |
|        14        |     Username with special characters at min length|            1           |            6           |                     Yes                    |     Username cannot contain special characters. |
|        15        |      Username and password just below lower bounds|            0           |            5           |                      No                    |     Username cannot be longer than 15 characters. & Password must be at least 6 characters long.    |

# Use Case Testing
## Functional Requirements:
1.	The system must display all available quizzes for the user to choose from.
2.	The system must allow the user to select a quiz to take.
3.	The system must display each question of the selected quiz along with its options.
4.	The user must be able to select one option for each question.
5.	The system must calculate and display the user's score after completing the quiz.
## Non-functional Requirements:
1.	The system should provide feedback messages for invalid inputs.
2.	The system should handle the quiz selection and question answering smoothly.

Here is the table for TakeQuiz class:
|     Test Case    |     Test Description          |     Quiz Available    |     Selected Quiz           |     User Answers       |     Expected Result           |      Expected Result                            |
|:----------------:|:-----------------------------:|:---------------------:|:---------------------------:|:----------------------:|:-----------------------------:|:-----------------------------------------------:|
| 1                |     Take a quiz with valid selections              |     Yes        |     Valid Quiz         |     All Correct     |     Display score with all   correct answers   |     Quiz created successfully |
| 2                |     Take a quiz with valid selections and some wrong answers   |     Yes    |     Valid Quiz   |     Some Correct |     Display score with some correct answers     |     Quiz created successfully  |
| 3                |     Select a quiz that does not exist     |     No  |     Invalid Quiz       |     -       |     Display "Invalid quiz   number" message      |     Quiz created successfully                     |
| 4                |     Attempt to take a quiz with no quizzes available     |     No                |     -             |     -        |     Display "No quizzes available" message    |     Quiz created successfully    |
| 5                |     Take a quiz and provide out-of-range option index     |     Yes       |     Valid Quiz       |     Out-of-Range     |     Display error message for invalid option  | Please enter a valid number   of questions (1 to 20). |
| 6                |     Take a quiz and do not   answer all questions     |     Yes     |     Valid Quiz        |     Partial Answers   |     Display score for answered   questions and skip unanswered    |     Please enter a valid number   of questions (1 to 20).          |
| 7                |     Take a quiz with mixed   correct and incorrect answers     |     Yes               |     Valid Quiz              |     Mixed Answers      |     Display score with mixed   correct and incorrect answers               |     Please enter a valid number   of options (1 to 4).             |
| 8                |     Take a quiz, exit midway,   and then complete the quiz             |     Yes               |     Valid Quiz              |     Complete Midway    |     Allow resuming and   completing the quiz with final score displayed    |     Please enter a valid number   of options (1 to 4).             |
| 9                |     Take a quiz with a single   question                               |     Yes               |     Single Question Quiz    |     Correct Answer     |     Display score for the   single question     |     Correct answer index must   be within the range of options.    |
| 10               |     Take a quiz with maximum   questions                               |     Yes               |     Max Questions Quiz      |     Mixed Answers      |     Display score for all quest                 |     Quiz created successfully                                      |
| 11               |     Create a quiz with no title                                        |                       |     1                       |     1                  |     0                                            |     Quiz created successfully                                      |
| 12               |     Create a quiz with valid   title, maximum questions and options    |     Valid Title       |     20                      |     4                  |     3                                            |     Quiz created successfully                                      |                                             

# Decision Table Testing

## Conditions:
1.	Username length <= 15
2.	Username length > 15
3.	Username does not contain special characters
4.	Username contains special characters
5.	Username is unique
6.	Username is not unique
7.	Password length >= 6
8.	Password length < 6
9.	Password length <= 15
10.	Password length > 15
## Actions:
1.	Prompt for new username
2.	Notify "Username cannot be longer than 15 characters."
3.	Notify "Username cannot contain special characters."
4.	Notify "A user with this username already exists."
5.	Prompt for new password
6.	Notify "Password must be at least 6 characters long."
7.	Notify "Password cannot be longer than 15 characters."
8.	Add new user
9.	Notify "User added successfully."

Here is the Decision Table for AddUser class
## Conditions:
|                      Conditions                        |     Rule 1 |     Rule 2 |     Rule 3 |     Rule 4 |     Rule 5 |     Rule 6 |
|:------------------------------------------------------:|:----------:|:----------:|:----------:|:----------:|:----------:|:----------:|
|                 Username length <= 15                  |      F     |      T     |      T     |      T     |      T     |      T     |
|     Username does not contain special characters       |            |      F     |      T     |      T     |      T     |      T     |
|                  Username is unique                    |            |      -     |      F     |      T     |      T     |      T     |
|               Password length >= 6                     |            |      -     |      -     |      F     |      T     |      T     |
|               Password length <= 15                    |            |      -     |      -     |      -     |      F     |      T     |

## Actions: 
|                         Actions                        |     Rule   1    |     Rule   2    |     Rule   3    |     Rule   4    |     Rule   5    |     Rule   6    |
|:------------------------------------------------------:|:---------------:|:---------------:|:---------------:|:---------------:|:---------------:|:---------------:|
|                 Prompt for new username                |        X        |        X        |        X        |                 |                 |                 |
| Notify "Username cannot be longer than 15 characters." |        X        |                 |                 |                 |                 |                 |
|  Notify "Username cannot contain special characters."  |                 |        X        |                 |                 |                 |                 |
|   Notify "A user with this username already exists."   |                 |                 |        X        |                 |                 |                 |
|                 Prompt for new password                |                 |                 |                 |        X        |        X        |                 |
|  Notify "Password must be at least 6 characters long." |                 |                 |                 |        X        |                 |                 |
| Notify "Password cannot be longer than 15 characters." |                 |                 |                 |                 |        X        |                 |
|                      Add new user                      |                 |                 |                 |                 |                 |        X        |
|            Notify "User added successfully."           |                 |                 |                 |                 |                 |        X        |

# Equivalence Class Testing


# Data Flow Testing
A data flow testing diagram is created to show the flow of data in our online quiz system
![Data Flow Diagram](Documents/Data_Flow_Diagram.pdf)

# Unit Testing
With unit testing, we can test individual classes and their methods in isolation. We tested classes including **User**, **UserManager**, **Authentication**, **Question**, **Quiz**, and **QuestionManager**.

# Integration Testing
The parts in the online quiz system are tested in a group to see how they interact with each other. The classes tested are **AddUser**, **CreateQuiz**, **EditQuiz**, **DeleteQuiz**, **HandleLogin**, **ShowAdminMenu**, **ShowUserMenu**, **TakeQuiz**, and **ViewQuizzes**. 
![Link for Unit Testing and Integration Testing](Testing/CompleteQuizSystemTestSuite.java)Testing/CompleteQuizSystemTestSuite.java
