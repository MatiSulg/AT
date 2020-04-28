package hello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GreeterTest{

    @InjectMocks
    Greeter greeter;

    @Mock
    Counter counter;

    @Test
    public void testSayNice() {
        String name = "John";
        when(counter.nameLength(name)).thenReturn(4);
        assertEquals("Nice to see you, John. I see that your name length is 4 letters.",
                greeter.sayNice(name) );

    }
}