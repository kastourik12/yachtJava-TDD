package com.kastouri;

public class Yacht {
    private final DieRoller diceRoller ;



    public Yacht(DieRoller diceRoller) {
        this.diceRoller = diceRoller;
    }

    public String rollDices() {
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < 5 ; i++ ){
            result.append(diceRoller.roll());
        }
        return result.toString();
    }

    public int score(ECategory category) {
        return 0;
    }
}
