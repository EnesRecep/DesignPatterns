package Singleton;

/**
 * Created by Enes Recep on 20.12.2018.
 */
public class Single {
    private static Single ourInstance = new Single();

    public static Single getInstance() {
        return ourInstance;
    }

    private Single() {
    }
}
