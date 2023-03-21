# SpringAOP

This is a simple project aimed at demonstrating the use of Aspect-Oriented Programming (AOP) with Spring framework. It involves a basic bank account transfer functionality implemented using the Spring framework, with AOP used to log before and after each method invocation.

## Getting started

To run this project, you will need to have the following installed:

- Java 8 or higher
- Maven

Clone this repository and navigate to the project root directory. Build the project using the following command:

```
mvn clean install
```

This will download all required dependencies, compile the source code, and run all tests.

After a successful build, run the project with the following command:

```
mvn spring-boot:run
```

The application will start, and you should see the output similar to the following:

```
Starting application...
Before accountTransfeer method is called
After accountTransfeer method is called. Return value is null
Application finished.
```

## Understanding the source code

The `SpringAOPApplication` class is the entry point to the application. It sets up the Spring application context, retrieves an instance of the `AccountService` class from the context, and invokes the `accountTransfeer` method to transfer funds between two bank accounts.

The `AccountService` class implements the bank account transfer functionality. It takes two `Account` objects as arguments, debits the transfer amount from the first account, and credits it to the second account.

The `LoggingAspect` class is the aspect that logs before and after each method invocation. It uses Spring AOP annotations such as `@Aspect` and `@Before` to specify the pointcuts and the advice to be applied. In this case, the `@Before` advice logs before each method execution, and the `@AfterReturning` advice logs after each method execution, including the return value.

## Conclusion

This project demonstrates a simple example of how AOP can be used in Spring framework to separate cross-cutting concerns from the core business logic. It's a powerful technique that can be used to improve the modularity, reusability, and maintainability of your code.
