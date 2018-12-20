package Command;

/**
 * Created by Enes Recep on 20.12.2018.
 */
public class LightCommand implements CommandBase {
    @Override
    public void execute() {
        System.out.println("Opening lights");
    }

    @Override
    public void unexecute() {
        System.out.println("Closing lights");
    }
}
