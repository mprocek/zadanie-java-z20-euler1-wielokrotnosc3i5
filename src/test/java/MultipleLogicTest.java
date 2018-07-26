import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class MultipleLogicTest {

    private MultipleLogic multipleLogic;

    @Before
    public void init(){
        multipleLogic = new MultipleLogic();
    }

    @Test
    public void shouldReturnFor6(){
        //given
        int a = 6;

        //when
        int result = multipleLogic.multiCalc(a);

        //then
        assertThat(result, is(8));
    }

    @Test
    public void shouldReturnFor20(){
        //given
        int a = 20;

        //when
        int result = multipleLogic.multiCalc(a);

        //then
        assertThat(result, is(78));
    }

    @Test
    public void shouldReturnFor40(){
        //given
        int a = 40;

        //when
        int result = multipleLogic.multiCalc(a);

        //then
        assertThat(result, is(368));
    }
}
