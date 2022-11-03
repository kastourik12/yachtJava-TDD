package com.kastouri;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class YachtScoringTest {

    @Test
    public void rollOf23456ResultsInScoreOfZeroForAces() throws Exception{
        //given
        Yacht yacht = new Yacht(new DieRoller() {
            private int die = 1;
            @Override
            public Integer roll() {
                return ++die;
            }
        });

        //where
        int result = yacht.score(ECategory.ACES);

        //then
        assertThat(result)
                .isEqualTo(0);


    }
}
