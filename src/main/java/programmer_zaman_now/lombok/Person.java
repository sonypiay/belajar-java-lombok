package programmer_zaman_now.lombok;

import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String id;

    private String name;

    private int age;

    @Singular
    private List<String> hobbies;
}
