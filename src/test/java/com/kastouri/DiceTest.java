package com.kastouri;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class DiceTest {
    @Test
    public void rollResultsIsBetween1to6() throws Exception{
        //given
        DiceRoller diceRoller = new DiceRoller();

        //when
        Integer result = diceRoller.roll();


        //where
        assertThat(result)
                .isBetween(1,6);

    }
}
