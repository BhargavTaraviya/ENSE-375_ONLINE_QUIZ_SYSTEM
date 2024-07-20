# Boundry Value Testing
## Functional Requirements:  
1.	The system must allow adding a new user with a unique username and password.
2.	The username must not exceed 15 characters.
3.	The username must not contain any special characters.
4.	The password must be at least 6 characters long.
5.	The password must not exceed 15 characters.

## Test Requirements for AddUser function:  
1.	Test the lower and upper boundary values for the username length.
2.	Test the lower and upper boundary values for the password length.
3.	Test the presence of special characters in the username.
4.	Verify that appropriate error messages are displayed for invalid inputs.
5.	Verify that the user is added successfully for valid inputs.

Here is the table for AddUser:

|     Test Case    |                  Test Description                 |     Username Length    |     Password Length    |     Username Contains Special Character    |                    Expected Result                   |
|:----------------:|:-------------------------------------------------:|:----------------------:|:----------------------:|:------------------------------------------:|:----------------------------------------------------:|
|           1      |     Minimum valid username and password length    |            1           |            6           |                      No                    |                User added successfully               |
|         2        |           Minimum invalid username length         |            0           |            6           |                      No                    |     Username cannot be longer than 15 characters.    |
|         3        |      Just below maximum valid username length     |            14          |            6           |                      No                    |                User added successfully               |
|         4        |        Exactly maximum valid username length      |            15          |            6           |                      No                    |                User added successfully               |
|         5        |      Just above maximum valid username length     |            16          |            6           |                      No                    |     Username cannot be longer than 15 characters.    |
|         6        |            Minimum valid password length          |            6           |            6           |                      No                    |                User added successfully               |
|         7        |          Just below minimum valid password length     |            6           |            5           |                      No                    |                             Password must be at least 6 characters long.                            |
|         8        |          Just below maximum valid password length     |            6           |            14          |                      No                    |                                        User added successfully                                      |
|         9        |          Exactly maximum valid password length        |            6           |            15          |                      No                    |                                        User added successfully                                      |
|        10        |        Just above maximum valid password length       |            6           |            16          |                      No                    |                             Password cannot be longer than 15 characters.                           |
|        11        |            Username with special characters           |            6           |            6           |                     Yes                    |                             Username cannot contain special characters.                             |
|        12        |          Username and password at upper bounds        |            15          |            15          |                      No                    |                                        User added successfully                                      |
|        13        |         Username and password at lower bounds         |            1           |            6           |                      No                    |                                        User added successfully                                      |
|        14        |     Username with special characters at min length    |            1           |            6           |                     Yes                    |                              Username cannot contain special characters.                            |
|        15        |      Username and password just below lower bounds    |            0           |            5           |                      No                    |     Username cannot be longer than 15 characters. & Password must be at least 6 characters long.    |

