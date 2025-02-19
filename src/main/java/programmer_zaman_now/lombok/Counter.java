package programmer_zaman_now.lombok;

import lombok.Synchronized;

public class Counter {

    private final Object objectLock = new Object();

    private Long counter = 0L;

    @Synchronized(value = "objectLock")
    public void increment() {
        counter = counter + 1;
    }

    @Synchronized(value = "objectLock")
    public Long getCounter() {
        return counter;
    }
}
