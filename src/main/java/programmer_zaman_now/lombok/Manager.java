package programmer_zaman_now.lombok;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Manager extends Employee {

    private Integer totalEmployee;
}
