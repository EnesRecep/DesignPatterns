package Command;

/**
 * Created by Enes Recep on 20.12.2018.
 */
public class AirConditionerCommand implements CommandBase {
    @Override
    public void execute() {
        System.out.println("Opening Air conditioner");
    }

    @Override
    public void unexecute() {
        System.out.println("Closing Air conditioner");
    }
}
