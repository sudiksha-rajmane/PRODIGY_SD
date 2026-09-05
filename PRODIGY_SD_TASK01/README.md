# PRODIGY_SD_TASK01 – Temperature Conversion Program

## 📌 Overview

This project is a Java-based **Temperature Conversion Program** developed as part of my Software Development Internship at **Prodigy InfoTech**.

The program allows the user to enter a temperature and select its original unit. It then converts the temperature into **Celsius, Fahrenheit, and Kelvin**.

## 🚀 Features

- Accepts temperature input from the user
- Supports Celsius, Fahrenheit, and Kelvin
- Converts temperature between different units
- Displays results with two decimal places
- Handles invalid unit selections
- Simple and user-friendly console interface

## 🛠️ Technologies Used

- Java
- Scanner
- Switch Statement
- Mathematical Operations

## 📐 Conversion Formulas

### Celsius to Fahrenheit

`F = (C × 9/5) + 32`

### Celsius to Kelvin

`K = C + 273.15`

### Fahrenheit to Celsius

`C = (F − 32) × 5/9`

### Fahrenheit to Kelvin

`K = (F − 32) × 5/9 + 273.15`

### Kelvin to Celsius

`C = K − 273.15`

### Kelvin to Fahrenheit

`F = (K − 273.15) × 9/5 + 32`

## ▶️ How to Run

1. Clone or download this repository.
2. Open the project in Eclipse or VS Code.
3. Make sure Java JDK is installed.
4. Run `TemperatureConverter.java`.
5. Enter the temperature.
6. Select the original temperature unit.
7. View the converted results.

## 💻 Sample Output

```text
=================================
     TEMPERATURE CONVERTER
=================================

Enter temperature: 25

Select the original unit:
1. Celsius
2. Fahrenheit
3. Kelvin

Enter your choice (1-3): 1

=================================
             RESULT
=================================

Celsius    : 25.00 °C
Fahrenheit : 77.00 °F
Kelvin     : 298.15 K

=================================
