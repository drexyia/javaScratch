package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void testConstruction() {
        Person p = new Person("Hello", 12, "emailId");
        assertEquals(p.getName(), "Hello");
    }

}
