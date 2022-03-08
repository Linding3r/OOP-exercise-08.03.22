package com.company;

public class Bedroom {

  public static void main(String[] args) {
    Lamp deskLamp = new Lamp();
    Lamp bedLamp = new Lamp(false);
    Lamp mainLamp = new Lamp();

    bedLamp.turnLampSwitch();
    mainLamp.turnLampSwitch();
    System.out.println(deskLamp.toString());
    System.out.println(bedLamp.toString());
    System.out.println(mainLamp.toString());
  }
}
