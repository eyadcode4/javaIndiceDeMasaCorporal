package eyad.dev.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class PersonTest {
    
    Person person;

    @BeforeEach
    void setUp() {
        person = new Person(90.00, 1.80);
    }
    @Test
    void testPersonHas2Field() {
        assertThat(person.getClass().getDeclaredFields().length, is(2));
    }

    @Test
    void testName(){
        assertThat(person.getWeight(), is(90.00));
    }

    @Test
    void testPersonHeight() {
        assertThat(person.getHeight(), is(1.80));
    }
}
