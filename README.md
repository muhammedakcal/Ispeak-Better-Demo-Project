# IspeakBetterCucumberProject

Session Agenda: Integration of Automation Testing in Sprint Cycles

Objective: To demonstrate the critical role of QA Automation Engineers within the sprint, focusing on maintaining UI consistency during software updates.

Scenario: A new QA Automation Engineer has joined the CUP team. Recently, the UI of the homepage has undergone a modification where the logo was updated from "CareMore" to "Carelon."

Completed Preparations:
* Manual Testing: The manual testing phase has been successfully completed and documented in qTest, ensuring initial QA benchmarks are met.

Automation Testing Focus:

Primary Task: As part of our regression testing strategy, the automation will verify that the header elements on the homepage have not been inadvertently altered during the logo update. This is essential to ensure that the overall page structure and navigation remain consistent for end-users.

Requirements for Automation:
* Specific Tests: The automation suite needs to include tests that check the integrity and naming of all header elements on the Home Page.
* Reporting: Post-test, the automation suite should generate a detailed report confirming the stability of the homepage elements and adherence to our software quality standards. 

Expected Outcomes:
* This session aims to show the practical benefits of integrating automation testing within our sprint activities. By doing so, we enhance our ability to detect and address issues early, ensuring that updates are both effective and reliable. 

Let's Start: Setting Up the Automation Framework

Prerequisite Tools:
* Java 11: programming language to interact with Selenium.
* Maven: Manages project dependencies.
* IntelliJ IDEA: Facilitates code development.
* Git: Controls version and collaborates code changes.
* Chrome Driver .exe: Browser-Specific Driver, Communication Bridge, Implementation of WebDriver Protocol


Development Setup Steps:
* Create a Feature Branch: Start by creating a feature branch in Bitbucket using the Jira ticket number for easy tracking.
* Clone the Project: Clone the 'cup-test' project to your local machine.
* Switch Branch: Switch to the feature branch you created earlier.
* Handle Certificates: Import the WellPoint certificate into the Java keystore to ensure secure connections.
* Configure Maven: Set up the settings.xml file in the Maven .m2 directory to manage project settings and dependencies.
* Set Up IntelliJ Plugins: Install the required plugins in IntelliJ to get the tools you need.
* Explore pom.xml: Check the pom.xml file to see why it's important for our project.
* Check the Code Structure POM and Factory Design Pattern: Look through the main, test, resources and target packages to understand how the code is organized.
* Review BDD Files: Go over the step definitions and feature files in Cucumber to see how we use BDD.
* Understand Gherkin: Explore how tests are written in Gherkin language and learn about its benefits.
* Look at Step Definitions and Hooks: Understand the coding structure within Step Definitions and Hooks classes.
* Learn Maven Commands: Get familiar with Maven commands such as clean, compile, and install.
* Create a New Feature File: Write a new feature file to design an automated test.
* Write Test Method: Add a new method in the step definitions class to check the homepage header.
* Create Custom Locator: Develop a custom locator to identify the headers on the homepage.
* Create WebElement: Use your custom locator to create a WebElement for the headers.
* Set Up Assertions: Implement an assertion to compare expected and actual outcomes for the test.
* Enhance Assertions: Modify the assertion to check all headers at once, simplifying the code.
* Implement Data-Driven Testing: Use a data-driven approach in your feature file for more dynamic testing.
* Optimize your code using co-pilot
* Run Test with Maven: Learn how to execute the test using Maven commands.
* Review Test Report: Examine the generated report to assess the test results.
* Push Code Changes: Upload your updated code to Bitbucket.
* Create a Pull Request: Submit your changes for review through a pull request.
* Set Up Selenium Grid: Configure Selenium Grid for executing tests remotely.
* Set Up CI/CD: Configure a continuous integration and delivery tool like Bamboo or Jenkins.
* Configure Bamboo Plan: Include notifications, Maven commands, and integration of the Cucumber report in your Bamboo plan.
* Explore Framework Details: Understand the base classes, utilities, and environment enumeration classes within the framework.
* Expand Testing for APIs: Set up the framework to include testing for REST APIs using Rest Assured.
* Configure Database Validation: Set up database validations within the testing framework.
* Explore Project Structure: Understand the relationship and structure between parent and child projects.




