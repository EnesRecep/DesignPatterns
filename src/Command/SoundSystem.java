package Command;

/**
 * Created by Enes Recep on 20.12.2018.
 */
public class SoundSystem implements CommandBase {
    @Override
    public void execute() {
        System.out.println("Opening sound system");
    }

    @Override
    public void unexecute() {
        System.out.println("Closing sound system");
    }
}
