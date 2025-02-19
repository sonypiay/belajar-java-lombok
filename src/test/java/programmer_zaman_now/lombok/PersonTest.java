package programmer_zaman_now.lombok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test
    void createViaConstructor() {
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("Game");
        hobbies.add("Sport");
        hobbies.add("Music");

        Person person = new Person("1", "sony", 28, hobbies);
    }

    @Test
    void createViaSetter() {
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("Game");
        hobbies.add("Sport");
        hobbies.add("Music");

        Person person = new Person();
        person.setId("1");
        person.setName("sony");
        person.setAge(28);
        person.setHobbies(hobbies);
    }

    @Test
    void createViaBuilder() {
        List<String> hobbies = new ArrayList<String>();
        hobbies.add("Game");
        hobbies.add("Sport");
        hobbies.add("Music");

        Person person = Person.builder()
                .id("1")
                .name("sony")
                .age(28)
                .hobbies(hobbies)
                .build();

        System.out.println(person);;
    }
}
