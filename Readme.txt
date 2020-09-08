Student Name : Jaspreet Singh
Student ID : 014638390
Email ID : jaspreet.singh03@sjsu.edu

Instructions: Load the class files and pom.xml as a Maven project in an IDE and run the App.class as java application.

The Project contains following files :
1> Greeter : it is the interface with a greet method.
2> CoolGreeter and WarmGreeter : they are the concrete classes which implements the Greeter interface, with an overriden greet method with a message.
3> GreeterModule : GreeterModule extends the AbstractModule and it is used to configure the binding for Greeter interface. The ambiguity is resolved using annotatedWith 
	method, which resolves the ambiguity and binds the greeter to the concrete implementation of Greeter interface i.e CoolGreeter/WarmGreeter. 
4> App : it is the class with main method, it instantiates an injector (using a GreeterModule ) which injects the dependencies annotated with Inject annotation.  
5> pom.xml : it contains the location of guice dependencies. 

The Project is build through Maven ( version 3.6.3 ) , Guice ( version 4.1.0 ) and Eclipse IDE ( version 4.14.0 )