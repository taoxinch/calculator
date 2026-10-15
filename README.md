# Calculator

A simple Maven-based Java calculator with JUnit 5 unit tests and a GitHub Actions CI pipeline.

[![CI Calculator](https://github.com/taoxinch/calculator/actions/workflows/ci-calculator.yml/badge.svg)](https://github.com/taoxinch/calculator/actions/workflows/ci-calculator.yml)

## Overview

This project implements a basic calculator that evaluates arithmetic expressions such as `2 + 3`, supporting addition, subtraction, multiplication, and division. Division by zero throws an `ArithmeticException`.

It is built and tested automatically on every push and pull request via GitHub Actions (see `.github/workflows/ci-calculator.yml`).

## Requirements

- JDK 21
- Maven 3.9+

## Build & Test

```bash
# Compile the project
mvn clean compile

# Run all unit tests
mvn test

# Package into a JAR
mvn package
```

## Project Structure

```
src/main/java/com/taoxincheng/Calculator.java   # core calculator logic
src/main/java/com/taoxincheng/App.java          # command-line entry point
src/test/java/com/taoxincheng/CalculatorTest.java  # JUnit 5 unit tests
.github/workflows/ci-calculator.yml             # CI workflow (GitHub Actions)
```
