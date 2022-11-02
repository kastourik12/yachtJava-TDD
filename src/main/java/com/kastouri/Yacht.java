package com.kastouri;

public class Yacht {
    private final DiceRoller diceRoller = new DiceRoller();


    public String rollDices() {
        String result = "";
        for (int i = 0 ; i < 5 ; i++ ){
            result += String.valueOf(diceRoller.roll());
        }
        return result;
    }
}
