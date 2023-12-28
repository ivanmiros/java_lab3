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