package com.kastouri;

import java.util.Random;

public class RandomDieRoller implements DieRoller {
    private final Random random = new Random();
   @Override
   public Integer roll(){
       return random.nextInt(6 ) + 1 ;
   }


}
