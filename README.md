# 🚀 Enterprise Test Automation Framework

A robust, cloud-native automated testing framework built to validate web application functionality and stability. Designed with continuous integration and scalability in mind.

## ⚙️ Tech Stack
* **Language:** Java 17
* **UI Automation:** Selenium WebDriver (Headless)
* **Testing Framework:** TestNG
* **Build Tool:** Maven
* **CI/CD:** GitHub Actions
* **Environment:** Linux (Ubuntu)

## 🏗️ Architecture & Features
* **Page Object Model (POM) Ready:** Structured for high reusability and low maintenance.
* **Headless Execution:** Configured to run silently in cloud containers without UI dependencies.
* **Continuous Integration:** Fully integrated with GitHub Actions. The suite automatically boots a Linux server, provisions the JDK, and executes regression tests on every push to the `main` branch.

## 🚀 How to Run Locally
Ensure you have Java 17 and Maven installed on your machine. 

1. Clone the repository:
   ```bash
   git clone [https://github.com/yogarajjuju/AutoTest-Suite.git](https://github.com/yogarajjuju/AutoTest-Suite.git)


2. Navigate to the project directory:

   cd AutoTest-Suite

3. Execute the test suite:

    mvn clean test


📊 Pipeline Status

This repository is monitored by a GitHub Actions CI/CD pipeline to ensure code quality and test reliability on every commit.