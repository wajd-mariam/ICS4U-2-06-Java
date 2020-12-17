/*
* Copyright (c) 2020
*
* The Flytest.java program calculates virtual speed 
* of planes flight test.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/16
*/

public class Flytest {
  /**
  * This Function runs a virtual flight test on a biplane and an airbus.
  */
  public static void main(String[] args) {

    // Declaring biplane and setting its speed:
    Airplanes biplane = new Airplanes();
    biplane.setSpeed(212);
    System.out.println("The biplane travels at: " + biplane.getSpeed() + "KM/H");

    // Declaring Airbus and setting its speed:
    Jet airbus = new Jet();
    airbus.setSpeed(422);
    System.out.println("The Airbus travels at: " + airbus.getSpeed() + "KM/H");

    // Declaring counter variable:
    int counter = 0;

    // Entering a while loop:
    while (counter < 4) {
      // Accelerating the boe
      airbus.accelerate();
      System.out.println(airbus.getSpeed());
      if (airbus.getSpeed() > 5000) {
        biplane.setSpeed(biplane.getSpeed() * 2);
      } else {
        // Accelerating the boeing aircraft
        airbus.accelerate();
      }
      // Adding 1 to coutnter:
      counter++;
    }
    // Printing out biplane final speed:
    System.out.println(biplane.getSpeed());
  }
}