# SampleSeleniumPro
**Selenium + Cucumber + Maven + Jenkins Integration**

This Automation framework uses Selenium webdriver with Java, and test ases for Feature files are written using Gherkin plain tet. 

The framrework uses page objet model with page fatory pattern. Whih helps managing the elements aording to eah page and it simplifies 
the framework and redues the maintenane effort of the Automation framework.

<img width="237" alt="projectstructure" src="https://user-images.githubusercontent.com/37755917/48909659-f9180580-eec1-11e8-86a2-e64e7ea83b26.png">

The below points will describe the Automation framework:

**--> utils Package**
Utils folder consist of all the main classes like driver factory which create the driverfactory, SeleniumUtils 
has all the common methods that could be used in all the Page classes.

--> SeleniumUtils class is the SUper class which gets extended by all the page classes.

**Pages :**

All the pages of the application are in a Pages package, all the page classes are extended by the Selenium Utils class, and it also contains 
the element for each page.

**StepDefinitions:**

The stepdifiniton for all the Page classes are in stepdefinitions.

**Src/test/features:**

This src folder consist all the feature files, written in gherkin plain text.


**Pom.xml:**

The pom.xml consist all the dependencies for Selenium, Java , Cucumber and goals. In Goals we have used a failsafe plugin 
which helps us run the test scripts using mvn verify command from command line or from jenkins as well.












