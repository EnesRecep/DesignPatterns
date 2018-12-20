package Command;

/**
 * Created by Enes Recep on 20.12.2018.
 */
public class Main {

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new LightCommand(), new AirConditionerCommand(), new SoundSystem());

        invoker.lightOn();
        invoker.lightOf();
        invoker.airConditionerOn();
        invoker.airConditionerOff();
        invoker.soundOn();
        invoker.soundOff();
    }
}
