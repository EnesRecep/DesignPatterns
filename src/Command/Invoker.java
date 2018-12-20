package Command;

/**
 * Created by Enes Recep on 20.12.2018.
 */
public class Invoker {

    CommandBase light;
    CommandBase airConditioner;
    CommandBase soundSystem;

    public Invoker(CommandBase light, CommandBase airConditioner, CommandBase soundSystem){
        this.light = light;
        this.airConditioner = airConditioner;
        this.soundSystem = soundSystem;
    }

    public void lightOn(){
        this.light.execute();
    }

    public void lightOf(){
        this.light.unexecute();
    }

    public void airConditionerOn(){
        this.airConditioner.execute();
    }

    public void airConditionerOff(){
        this.airConditioner.unexecute();
    }

    public void soundOn(){
        this.soundSystem.execute();
    }

    public void soundOff(){
        this.soundSystem.unexecute();
    }
}
