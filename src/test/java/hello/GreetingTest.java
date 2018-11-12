package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingTest {

    @Test
    public void testConstruction() {
        Greeting g = new Greeting(10l, "Hello");
        assertEquals(g.getId(), 10l);
    }
}
