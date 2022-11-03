package com.kastouri;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class DieTest {
    @Test
    public void rollResultsIsBetween1to6() throws Exception{
        //given
        RandomDieRoller dieRoller = new RandomDieRoller();

        //when
        Integer result = dieRoller.roll();

        //then
        assertThat(result)
                .isBetween(1,6);

    }
}
