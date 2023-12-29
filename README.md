# oop-di-lab

Generated with:

- Gradle 7.5
- JVM 18.0.2

## Inputs
  - Defined interfaces in `main/java/org/fpm/di/`
      Binder, Configuration, Container, Environment
  - Defined tests in `test/java/org/fpm/di/example`
      Binder, Configuration, Container, Environment

## ToDo
  - Create library for supporting Dependency Injection (DI) & Inversion of Control (IC)
  - Library should implement existing interfaces

## Architecture
  - `Environment` - represent the global runtime environment 
      `Container` - manages the lifecycle of components based on configuration information
         `Configuration` - specifies how components are wired
            `Binders` - responsible for dependency injection, list of methods

  - Interfaces
        Environment {Container configure(Configuration configuration);}
        Container {<T> T getComponent(Class<T> clazz);}
        Configuration {void configure(Binder binder);}

## Library 
  - Implementation us unified and added to `main/java/dilib/`        

## UseA 
  - Abstraction class, to be described


## Hierarchy
  - Main class Draw as interface to generic function printIt(); 
  - Class Shape is a generic eimplementation
  - Classes Figure.. are extenders and do specifics

## Negative Tests
  - Step 2: Circular injection
  - Step 3: Double binding
  - Step 4: Abstract binding
  - Step 5: Unregistered component

## Positive Tests  
  - Step 6: Check singleton  