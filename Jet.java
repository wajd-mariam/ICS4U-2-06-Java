/*
* Copyright (c) 2020
*
* The Jet.java is a subclass for Airplanes.java file.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/16
*/

// Airplane class
public class Jet extends Airplanes {
  // fields
  public static final int MULTIPLIER = 2;
  
  // defining Jet constructor
  public Jet() {
    super();
  }  

  // Setting Speed Method
  public void setSpeed(int speed) {
    super.setSpeed(speed * MULTIPLIER);
  }
  
  // Acceleration Method
  public void accelerate() {
    super.setSpeed(getSpeed() * 2);
  }
}