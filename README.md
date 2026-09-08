# Weather Station Simulator

This is a simple Java project for practicing the Observer design pattern.

The program simulates a weather station that runs in its own thread and changes the temperature randomly. When the temperature changes, all registered observers are notified.

The project has three observers:
- Phone Display
- Window Display
- Weather Logger

During the simulation, the Window Display observer is removed. After that, it does not receive any more temperature updates.

## How to run

Compile the Java files:

javac *.java

Run the program:

java Main

## Design Pattern

This project uses the Observer design pattern.
