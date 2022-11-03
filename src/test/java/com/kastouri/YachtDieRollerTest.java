package com.kastouri;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class YachtTest {

    @Test
    public void rollDicesResultHasFiveNumbers() throws Exception{
        RandomDieRoller diceRoller = new RandomDieRoller();
        //given
        Yacht yacht = new Yacht(diceRoller);
        //when
        String result = yacht.rollDices();
        //where
        assertThat(result)
                .hasSize(5);
    }

    @Test
    public void rollFiveDiceResultsIn123456() throws Exception  {
        //given
        Yacht yacht = new Yacht(new DieRoller() {
            private int die =0;
            @Override
            public Integer roll() {
                return ++die;
            }
        });
        //where
        String result = yacht.rollDices();

        //Then

        assertThat(result)
                .isEqualTo("12345");
    }
}
