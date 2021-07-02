# upet assignment 
# Maven project , Selenide , Cucumber , Page object Model  and Browser Stack Integration 

# precondition - 
1) Maven Should installed in your machine, globally accessible in your machine over CMD/terminal.  
2) Java should installed in your machine , globally accessible in your machine over CMD/terminal.

My machine version : Maven - 3.6.3
Java - JDK 1.8



# How to execute test case from local machine
1. Clone/Checkout Project from github Repository
2. Go to directory where you checkout and Open CMD/Terminal window
3. execute command 'mvn test' on root directory of the project
4. while test excution go to browser stack and login there and see the test execution. 

# To execute Test case on Github actions - 
1) Go to Git actions on Git reposiroy 
2) Click on 'Java CI with maven' ![image](https://user-images.githubusercontent.com/5213435/124262393-a01bae00-db4f-11eb-85a0-71e979228438.png)
3) Click on 'Run workflow' and check build execution and see browsertatck for test execution. ![image](https://user-images.githubusercontent.com/5213435/124264049-a4e16180-db51-11eb-8f80-ef491c981ecb.png)


# To execute on IntelliJ Idea 
Precondition : Install Cucumber for java and Gherkin plugins 
1. Clone/Checkout Project from github Repository
2. Go to directory where you checkout and Open in IDE
3. Go to feature file and run it
4. check the test execution on  browserstack account


# Project Structure :
Page Objects :  Created an object repository for storing all web elements and methods.
Path: src/test/java/pageObjects

Step Definitions: Implemented step definitions mentioned on feature file.
Path: src/test/java/stepDefinitions

Cucumber Test Runner : To run cucumber test added cucumber test runner on cucumber test class.
Path: src/test/java/stepDefinitions

Features : Designed Gherkins for test case
Path: src/test/resources/features

utils: Implemented common methods
Path: src/main/java/utils

Browser Stack Integration and Browser capabilities, and selenide configuration setup on base test class.
Path: src/main/java/utils

Git action yml file : maven.yml
Path : .github/workflows/maven.yml


