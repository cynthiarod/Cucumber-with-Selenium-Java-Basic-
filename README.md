# Cucumber-with-Selenium-Java-Basic-
Cucumber with Selenium Java (Basic)
Section 1 – Cucumber Focused
1.	Introduction 
BDD- Behavioral Driven Development is based on Test Driven Development (TDD) and it aims to bridge the gap between Business analyst and developers.
BDD not only bridges the gap between business analyst and developers but also between 
•	Manual QA with Automation testers (who write DBB)
•	Manual QA with Developers
BDD seems to be like a plan text, but they have their own syntax based on certain tools (with we will discuss next)
BDD Support tools
There are many tolls available to supports BDD, some most famous tools are
•	Cucumber
•	Jbehave
•	Nbejave
•	SpecFlow
All the above tolls are used in conjunction with many different platforms and languages like JAVA, C#, Ruby,  Python, Jruby, etc.
Gherkin 
Gherkin is the format for Cucumber specification.
It is a business readable, Domain specific language which will let anybody to understand the software behavior easily(effortlessly), since they are PLAIN TEXT.
Gherkin has some spaces and indentation define structure.
Gherkin has very few syntax which make the parser (the tool which uses Gherkin) to behave based on the structure.
The syntax of Gherkin is very simple and are pretty readable as plain text (which we will discuss next)
Gherkin Syntax
Here are few of Gherkin 
1.	Feature
2.	Background 
3.	Scenario
4.	Given
5.	When
6.	Then
7.	And
8.	But
9.	Scenario outline
10.	Examples
11.	Scenario Templates
BDD vs traditional 
BDD	Traditional Automation
Its plain text and easy to understand 	Its full of code and hard to understand
Its easy to understand by BA/QA/DEV/Automation Test Engineer and all will be in same page	The code is understood only by Automation test engineer (Sometimes Dev)
Since its plain text format, BDD can be shared even to stakeholders
Impossible
Easy to learn and implement	More knowledge is required while designing 


2.	Getting started with Cucumber (Part A)
Cucumber 
As said, cucumber is a tool which helps Behavioral Driven Development (BDD).
Cucumber as a tools support different languages implementation like Java, JS, PHP, Ruby, C# etc.
We have already discussed about C# based implementation of cucumber in our Execute Automation channel a lot using tool called Specflow.
Installation pre- requisite 
Along with that we need following JAR file
•	Cucumber-core
•	Cucumber-java
•	Cucumber-java-deps
•	Cucumber-jvm
•	Gherkin
•	Selenium (and its related jars)
How are we going to install or reference the JAR
If you are from Visual Studio background and have already watched video series on Specflow C#, we referenced related DLL via Nugget repository, whereas in Java world, we can easily do via Maven public repository.
3.	Part 3- Getting start with Cucumber (Part B)
4.	Creating our first feature file using Cucumber for Java
Feature file  
While starting to work cucumber, the first thing we will encounter is going to be the feature file.
Feature file is more like a plain text file but with .feature extension (as discussed in specflow video series)
If you are from specflow background you might have noticed that, there will be a code behind file for every feature file along with step definition file something like this 
•	Feature file
•	Code behind file
•	Step file
Cucumber 
But in cucumber we will not have any code behind file for the feature file rather the IDE like Eclipse or IntelliJ are more intelligent enough to map it.
But if you are going to run cucumber file but from an IDE, something like command-line, the surely you need to use a different approach called testRunner with RunWithattribute (which we will discuss later in the course)
The Step definition file are yet another java class file which holds all the steps written with feature file.
Again, if you are from Specflow background, you might have noticed that each step definitions files will be decorated with [Bindings] attribute, whereas in cucumber it’s not required.
5.	Part 5- Working with Scenarios in detail using Cucumber
Cucumber scenario
Lest create our first scenario as one shown below
 
How to execute the feature file if you just click this it will execute the main.
 
But if you click the dropdown you will see nothing here
 
And the reason is because the feature file is not yet recognized. 
So you can go to the right configuration and here there is something called as cucumber are Java 
 
You can actually try to glue your step definition along with the feature which you will discussing a lot greater than in our upcoming videos of this bigger video series. But for now, just be informed that there is an option something like here.
So just go right click and there is something called Run scenario log in with correct username and password.
 
So currently is executing the test for us and it’s asking me to unlick the firewall of course and will allow the access.
  
Note Error with :
If you can see that it is throwing some error here and say is that undefined a step given, and I bring it to the logon page and define a step and I enter a username and password as admin.
So all these steps are being undefined. 
And if I go to the logon step you can see the reason is because we need to map our glue the features steps from this particular file to this particular step definitions file available in the log in step darted Java. 
So the bluing can be done by going to the Arnott configuration of this particular feature file which is actually available on here if you just click this dropdown. You can see there is something called the red configuration. If I go here, you can see that there is a camera Java and that is a scenario name all those thing. And we need to glue with the step file.
The final change you-re going to do is the right configuration. So you can see there is something called Glue and if you click this there will be a empty text box in. So what does this glue mean. Basically it says that I want to map all the steps available from the steps Folder or the directory for the package and then hit ok. 
So that’s why we have Blueridge right here and now if I try to run this particular scenario you can see that this time in has executed without any problem. So it is a very one scenario and four steps and it got and that’s what is happening.
You need to glue the feature file along with the file from this particular configuration but you can do this operation programmatically without doing that. In this particular configuration by means of. I’d run with attribute that we discussed north light so we you discuss about that as well.
6.	Part 6- Working With Multiple Data using DataTables
Working with multiple data using DataTable
We might need to supply multiple data instead of hardcoded values passed in steps.
This can be done using DataTable class available in Cucumber.
Tables are not new in Cucumber, but according to Gherkin specification, the table exist in all the tools (even specflow, Jbehave, etc)
Table in the scenario looks something like this 
 
You will have a pipe symbol and the first line of the table which you’re seeing here the username and password is always considered as the column name and following the first line are always considered as the column values. So you can have any number of values within beneath each and every column and you can have a number of rows is well.
The bad is in C-sharp we have something called create dynamic instance method. So C-sharp support the dynamic keyword and you can on the fly convert a value into dynamic and you can then play around with it. So the variable you are the type will be resolved during runtime.
In java those kinds of different supercooled thing are not available though. But still there are some cool thing available in java as well. So we can live with it for now but maybe in future. So you cannot do to create an instance as you did inspect flow in cucumber for Java implementation.

7.	Part 6a- Working With Multiple Data using DataTable with Custom class type 
Custom class via POJO
JAVA
POJO: Plain Old Java Object
C#
POJO: Plain Old Class Object 

 
8.	Part 7- Working with Scenario Outline of Cucumber
Scenario outline 
We worked with scenario (Part 5 and Part 6), but there are situations where we may need to run same scenario another time with different data (that happen most of the time)
Using Scenario Outline we can same scenario with different data with the help of Examples.
Scenario outline looks something like this
 
Note:
When the function has some regular expression, we need to add ^ and $ in the sentence 
Like this:
@And("^I enter ([^\"]*) and ([^\"]*)$")



9.	Part 8 – Working with cucumber Hooks to initialize and teardown test
Cucumber hooks
If you are from Specflow background, you might have notices there are different types of hooks available like
 
But unfortunately, in cucumber hooks for Java we have only two hooks on this. 
@Before
@After
Limitation in cucumber for Java 
In Specflow, you can hooks for each and every 
•	Steps,
•	Features,
•	Scenario,
•	Scenario block and
•	Whole test run 
But it’s not possible with cucumber for Java
Tagged hooks
You can tag hooks much like Specflow for both @Before and @After hooks for running them during specific call.
So you can tag that up by giving up before and I log in as an administrator and like that
So if you use something like this that particular Hook will be executed only for that particular step or that particular scenario.

10.	Part 9- Dependency Injection with Picocontainer for cucumber
Dependency Injections
If you are from Specflow background, you should have worked with dependency injections built in Specflow out-of-box.
But in cucumber for Java, the dependency injection is not built out-of-box in cucumber-core or cucumber-jvm, rather we need to add additional dependency called cucumber-picocontainer.
So how they look
Basically, they look something like this.
11.	Part 10. Step Argument Transformation using Cucumber with Selenium 
Argument Transformation 
A step argument transformation can simplest be described as a way to get typed objected for a certain pattern in a Given/When/Then
It allows transformation of a step definition argument to a custom type, giving you full control over how that type is instantiated.
So this is really awesome because if you want to convert student types from a step definition argument to a specific type that you want to say if you want to convert an integer to a string or a string to a data time format then you can do that using this argument transformation concept available in cucumber out of the box.
Argument transformation
If you are from Scpecflow background, you should have worked with Step argument transformation, which comes with Specflow.Assist.Dynamic DLL
But in cucumber for Java, argument transformation comes out-of-box and we can achive it using Transformer class ( Transformer<String> )
Specflow vs Cucumber
To achieve step argument transformation following rules needs to be followed
Specflow
•	The return type of the transformation should be same as the parameter type
•	The regular expression (if specified) should matching to the original (string) argument
•	If there are multiple matching transformation available, a warning is provided in the trace and the first transformation is used. 
Cucumber 
•	Extend Transformer<> class for the type to be transformed
•	Override transform method
•	Call @ Transform annotation as parameter in calling method param 
Note:
Method overriding, is a language feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its superclasses or parent classes. 
•	The implementation in the subclass overrides (replaces) the implementation in the superclass by providing a method that has same name, same parameters or signature, and same return type as the method in the parent class. The version of a method that is executed will be determined by the object that is used to invoke it. If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed. Some languages allow a programmer to prevent a method from being overridden.


12.	Part 11 – New Feature of Cucumber – Java 8
Cucumber-Java 8
Cucumber-Java8 is another branch of cucumber-java in maven. They both share same version (currently its 1.2.5)
The major difference is in the step definition representation using lambda expression


Section 2 – Selenium focused
13.	Part 1 – Introduction to Cucumber with Selenium (Selenium focused)
Adding Selenium dependency 
Before starting to work with Selenium, its super important that we add the reference of Selenium jar files
As usual we are going to do it in pom.xml
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.0.0-alpha-6</version>
</dependency>
https://github.com/executeautomation
Note:
What is setProperty in Selenium?
As the name suggests, the setProperty method enables QAs to set the properties for the desired browser to be used in test automation.
The setProperty method has two attributes – “propertyName” and “value.” The propertyName represents the name of the browser-specific driver, and the value points to the path of that browser driver.
Example :
System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");




What is the use of setProperty method?
To automate tests for a specific browser, QAs need to download the browser-specific drivers first as browsers do not have built-in servers for test automation. These drivers act as a bridge between test scripts and browsers for test automation.
One can check the complete list of available browser drivers on the official site of Selenium. Once the driver is downloaded for a specific browser, QAs need the setProperty() method to define the path for that driver before writing any test cases.
This helps the Selenium WebDriver identify the browser on which tests are to be executed.
14.	Part 2 – Writing  an simple code for Selenium with cucumber
Note: 
When you want to use Assert, you have to add a dependency to be able to use it in your code
If you are using Maven, add the following to your pom.xml:
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.12</version>
    <scope>test</scope>
</dependency>
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>6.5.0</version>
    <scope>test</scope>
</dependency>
15.	Part 3 – Page Object Model for Selenium for cucumber
PageFactory.
So it’s this PageFactory you can initialize all the elements by calling this particular constructor.
So driver of this means it’s going initialized this particular page. And since we have a constructor out there you need to specify this as well base.driver for this method.
16.	Part 4 – Running Selenium with cucumber via Maven
Maven (Expert)
We have already converted our project to Maven structure on the first video of this series. 
Now its time to execute application out of IntelliJ IDE rather running it within IDE.
So we are going to do the following 
1.	Download Maven
2.	Set home path
3.	Run Maven against project
Project Change
We need to do following changes to the project as well, mainly in POM.xml
1.	Add Maven compiler plugin
2.	Add Maven surefire plugin 
Surefire plugin 
The Surefire Pugin is used during the test phase of the build lifecycle to execute the unit test of an application. It generates reports in two different file formats:
1.	Plain test files (*.txt)
2.	XML files (*.xml)
By default, these files are generated at $(basedir)/target/surefire-reports
The Surefire Plugin has only one goal:
Surefire: test runs the unit test of an application. 
Steps:
1.	We need to add the two dependencies as we sign the slide.
So I’m going to the POM file and here I’m going to add two plugin under the build tag.
I’m going to search for cucumber Maven compiler plugin and that’s going to be available in the Maven Repository.
 
2.	So now let me just download the MAVEN. So the MAVEN is available from the official site so you can just download, you can see that there is a download you are available.
I’m going to set the environment variable. So if you can see here there is something called us MAVEN underscore home. And this MAVEN underscore home also set in the path.

 
3.	I’m just going to go over here to this project folder. Right click and select the option “Directory path”, let’s open this folder and then when I do and just going to run in a command prompt.
      
4.	So right now if I just write something like mvn and hit enter you can see that it is going to bring you all the commands.
And it say that there is no goals specified for this bird. So you have to specify the goal here. So you can just specify the goals something like mvn clean. So if you specify the clean you can see that the target folder will disappear. You can see the target for the disappear meaning the target folder is the actual compiled version of the files.

mvn clean 
 
5.	So that particular files disappear right now once you’ve done the clean and once you if you want to just build it so you can just say mvn compile, so if you do we can compile. So it’s just going to compile your project and it has to the target folders and see that everything will be in the classes or here right 
mvn compile

 
6.	And then we need to run that test right now. So since we have the sure file plugin out there you know our POM xml file no you file just type mvn test and hit enter you can see that it is just going to scan all those files. That’s it. It’s just searching for some test but it couldn’t find anything. Basically, there is no unit test that’s what it says there’s nothing in there to test it. But actually we have something out there to run the test but it couldn’t identify that. 
mvn test
 
7.	We need to create a runner of file. So, we are going to do that, and I will tell you why we are creating this file once again once we start written code. Basically, we are running the test right now by just right clicking this particular feature. But behind the scenario it is actually calling plugin in far a cucumber which is actually also running the cucumber G-Unitest. So, if you see our public some file, we have added something called cucumber-junit.
 
8.	I need to run the cucumber test from this trainer. That’s very straightforward way. So this is how you can run the test from maven when using G-Unit and using this test runner which is available.
Note:
If you have some imported packages in your code and you don't use them, remove them or comment on them, because when you run with maven in command prompt, maven takes the imported package and tries to run it and it will cause a problem.
Example:
Issue
 
 

Solved
 
 

Note:
You are mixing different versions of Cucumber. Take a careful look at the version numbers.
You are also including more dependencies then strictly needed. Merely using cucumber-java and cucumber-junit would be sufficient. Both cucumber-core and junit are transitive dependencies.
After you fix your dependencies makes sure to reimport the maven project.
<dependencies>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>4.4.0</version>
    </dependency>
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-junit</artifactId>
        <version>4.4.0</version>
    </dependency>
</dependencies>

17.	Part 5 – Running cucumber test with TestNG
TestNG
TestNG is a testing framework designed to simplify a broad range of testing needs, from unit testing (testing a class in isolation of the others) to integration testing (testing entire systems made of several classes, several packages and even several external framework, such as applications severs).
•	Annotations.
•	Run your tests in arbitrarily big thread pools with various polices available.
•	Test that your code is multithread safe.
•	Flexible test configuration.
•	Support for data-driven testing (with @DataProvider).
•	Support for parameters.
•	Powerful execution model (no more TestSuite).
•	Support by a variety of tolls and plug-ins (Eclipse, IDEA, Maven, etc)
•	Embeds BeanShell for future flexibility.
•	Default JDK functions for runtime and logging (no dependencies).
•	Depended methods for application sever testing.
Steps:
1.	I’m going to quickly add to the dependences.
https://cucumber.io/docs/cucumber/checking-assertions/#testng
   
2.	So, once I come back here for the test runner. And we just gave the Cucumber option for the feature and the glue and it is working fine. So, once you come on this code, you’re not running the gender right now. You must specify the test runner so far that what I’m going to do is I’m going to extend the abstracttestngcucumbertest class. So, once I extend this right now you can see that we have a decision here to run the test so you can run that test in the test right now. So, what I’m going to do is I’m just going to run the test and test. I’m just can right click and run the test runner class.
 
18.	Part 6 – Reporting in Cucumber for Selenium (Part A)
Reporting / Living Documentation 
Cucumber is by itself an living documentation, since you can see that the feature files are much more readable an understandable. 
Pickles for Specflow
We have already discussed about the same concept in pickles far aspect flow in our exit our image in the YouTube channel and we told how to run the test how to generate a living documentation for the Specflow  feature files and how to link the test run with all the POS and failed razored. So we’re oing to be exactly the same thing for cucumber with selenium java.
Reporting beyond living documentation
There are different other reporting options supported by cucumber options attribute for reporting such as 
•	HTML
•	Json
•	Text
So we need to specify cucumbers options something like this.
Format = { “json:target/cucumber.json”, html:target/site/cucumber-pretty”}
We have a property called summered and we can specify what kind of reporting option you need to read.
Note:
Error when written format code –
Solution : replace format with plugin
Reference: https://cucumber.io/docs/cucumber/reporting/

NOTE: 9/1/2020
Change the URL and elements because the original URL return 404 error and I was not able to work with it.


 
