/*
* Copyright (c) 2020
*
* The Airplanes.java file is a superclass for Jet.java file.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/16
*/

// Airplane class
public class Airplanes {
  // fields
  private int speed;
  
  // defining airplane constructor
  public Airplanes() {
    this.speed = 0;
    
  }  
  
  // Method for getting speed 
  public int getSpeed() {
    return this.speed;
  }
  
  // Method for setting speed 
  public void setSpeed(int speed) {
    this.speed = speed;
  }
}