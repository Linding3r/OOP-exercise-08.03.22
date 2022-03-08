package com.company;

public class Lamp {
  private boolean lampSwitch = false;

  public Lamp (boolean lampSwitch){
    this.lampSwitch = lampSwitch;
  }

  public Lamp (){
    this.lampSwitch = lampSwitch;
  }

  public boolean isLampSwitch() {
    return lampSwitch;
  }

  public String outcome (){
    if (lampSwitch==true){
      return "ON";
    }else return "OFF";
  }

  public boolean turnLampSwitch(){
    if (lampSwitch == true){
      return lampSwitch = false;
    } else return lampSwitch = true;
  }
  public String toString(){
    return "The lamp is: " + outcome();
  }
}
