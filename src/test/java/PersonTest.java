import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getName() {
        Person person = new Person("Alex");
        assertEquals("Alex", person.getName());
    }

    @Test
    public void getFriend() {
        Person person = new Person("Adam");
        Person second = new Person(person, "John");
        assertNull(person.getFriend());
        assertEquals(person, second.getFriend());
    }
}