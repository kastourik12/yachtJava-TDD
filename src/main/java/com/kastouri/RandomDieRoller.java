package com.kastouri;

import java.util.Random;

public class DiceRoller {
    private final Random random = new Random();
   public Integer roll(){
       return random.nextInt(6 ) + 1 ;
   }


}
