# coya
Sample BDD based Automation framework - Coya

===============. 
This is a sample BDD based automation framework build with selenium, cucumber-jvm and Maven.

###Prerequisites to run the framework:
1. Install Java (JDK + JRE) and set env variable
2. Install Maven and set env variable
3. Its good to have eclipse or some other IDE. Otherwise execution can happen through cmd prompt as well

###Steps to use automation framework:
1.Clone/Download the project from repo: https://github.com/hemanshuchauhan/coya

2.Install Maven and Java on your machine and set environment variables for JAVA_HOME & MAVEN_HOME
Refer this page for steps for setting up environment variables: https://www.studytonight.com/maven/setting-up-maven

3. Download chromedriver from https://chromedriver.storage.googleapis.com/index.html?path=2.43/
and place th executable chromedriver EXE strictly at location C:\chromedriver
(It has been asked to place chromedriver only on above place because this path has been set on framework. 
If you want to install chromedriver somewhere else, then please chance the path in framework)

3. Go to the folder where you cloned the project and run below commands in sequence in command prompt:
mvn clean
mvn install
mvn test

4. It will execute sample feature file created for Coya .....Happy automation !!!!
