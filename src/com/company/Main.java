package com.company;

public class Main {
    Dice dice = new Dice();
    int one = 0;
    int two = 0;
    int three = 0;
    int four = 0;
    int five = 0;
    int six = 0;

    public void roll100(){
        for (int x = 0; x < 100; x++){
            switch(dice.rollDice()){
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
            }
        }
    }

    public void output(){
        roll100();
        System.out.println("One's: " + one);
        System.out.println("Two's: " + two);
        System.out.println("Three's: " + three);
        System.out.println("Four's: " + four);
        System.out.println("Five's: " + five);
        System.out.println("Six's: " + six);
    }

    public static void main(String[] args) {

        Main prg = new Main();
        prg.output();

    }
}
