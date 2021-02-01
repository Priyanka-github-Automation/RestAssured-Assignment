# API Automation using RestAssured
## Requirement

1. Use any 2 methods(Get, and Delete) from end-points listed in
http://dummy.restapiexample.com/
2. Perform assertions for 
   - Get & Delete - Status code to be Successful.
   - Get - Return specific Employee details(Any).
   - Delete - "message": "successfully! deleted Records".

## Implementation details

- Automated the above requirement using RestAssured library, Maven project and TestNG framework.
- Passed the employee id whose details need to be retrieved and whose record needs to be deleted as parameter through TestNG.xml file.

## Prerequisites to run on your local machine
- Java version 8 or higher.
- Maven installed on machine to compile and run from the command line or an IDE like Eclipse to compile and run. 

## How to Run
- clone the project from https://github.com/Priyanka-github-Automation/RestAssured-Assignment.git to your local machine.
- To run from the command line, in the terminal, navigate to the corresponding folder and give the maven command 'mvn test'.
- To run in an IDE, import the project into your IDE, open the TestNG.xml file in the path src/test/resources and run as TestNG Suite.




