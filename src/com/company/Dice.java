package com.company;

public class Dice {
  private int faceValue;

  /*public Dice(){
    this.faceValue = faceValue;
  }*/

  public int rollDice(){
    return faceValue = (int) (Math.random() * 6 + 1);
  }

  public String toString(){
    return "Dice: " + faceValue;
  }

}
