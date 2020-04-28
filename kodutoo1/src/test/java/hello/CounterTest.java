package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CounterTest{
    Counter counter = new Counter();

    @Test
    public void testNameLength_4(){
        assertEquals(4, counter.nameLength("Jeff"), 0.0);
    }

    @Test
    public void testNameLength_0(){
        assertEquals(0, counter.nameLength(""), 0.0);
    }
}