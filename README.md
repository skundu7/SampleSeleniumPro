# SampleSeleniumPro
**Selenium + Cucumber + Maven + Jenkins Integration**

This Automation framework uses Selenium webdriver with Java, maven ,github as a version control tool, jenkins for CI/CD and test cases for Feature files are written using Gherkin plain text. 

The framework uses xml file to get test data, which is used in the scripts as expected data.

The framework uses page object model with page factory pattern. Which helps managing the elements according to each page and it simplifies the framework and reduces the maintenance effort of the Automation framework.

Below is how the project structure looks like.

<img width="237" alt="projectstructure" src="https://user-images.githubusercontent.com/37755917/48909659-f9180580-eec1-11e8-86a2-e64e7ea83b26.png">

The below points will describe this Automation framework:

**--> utils Package**
Utils folder consist of all the main classes like driver factory which create the driverfactory, via SeleniumUtils 
we are passing our driver to all the Page classes, it usually consists all the common methods.

--> SeleniumUtils class is the Super class which gets extended by all the page classes.

**Pages :**

All the pages of the application are in  Pages package, all the page classes contains webelements for each page.

**StepDefinitions:**

The stepdifiniton for all steps of feature files are categoried and for each page different stepdifintion classes are created..

**Src/test/features:**

This src folder consist all the feature files, written in gherkin plain text.


**Pom.xml:**

The pom.xml consist all the dependencies for Selenium, Java , Cucumber and goals. In Goals we have used a failsafe plugin 
which helps us run the test scripts using mvn verify command from command line or from jenkins as well.


**Jenkins integration**

We can integrate our github project and keep our gihub repo as the source code management in the Jenkins. 
we can use invoke top level maven target to trigger the test scripts. In Post build actions we use the cucmber reports and email notification.

below is the screenshot fo how the cucumber reports look like. The cucumber reports link of jenkins can be shared with the team.

<img width="945" alt="cucmber reports" src="https://user-images.githubusercontent.com/37755917/48910413-059d5d80-eec4-11e8-8ec7-02babbd5cb64.png">










