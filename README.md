# Weather Station Simulator

This project is a simple weather station simulator written in Java.

The purpose of the project is to practice the Observer design pattern.

The weather station runs in its own thread and changes the temperature randomly. When the temperature changes, the registered observers receive the new temperature.

There are three observers in the program:
- PhoneDisplay
- WindowDisplay
- WeatherLogger

During the simulation, one observer is removed to demonstrate that it no longer receives updates.

## Running the program

Run the Main class to start the simulation.

## Technologies

- Java
- Observer Design Pattern
- Threads
