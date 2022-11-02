package com.kastouri;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class YachtTest {

    @Test
    public void rollDicesResultHasFiveNumbers() throws Exception{
        //when
        Yacht yacht = new Yacht();
        //given
        String result = yacht.rollDices();
        //where
        assertThat(result)
                .hasSize(5);
    }
}
