package programmer_zaman_now.lombok;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class Merchant {

    private final String id;

    private String name;
}
