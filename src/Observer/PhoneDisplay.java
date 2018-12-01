package Observer;

/**
 * Created by Enes Recep on 22.11.2018.
 */
public class PhoneDisplay implements Observer{

    WeatherStation station = new WeatherStation();

    public PhoneDisplay(WeatherStation station){
        this.station = station;
    }


    @Override
    public void update() {
        System.out.println("Updated Temperature: " + station.getTemperature());
    }
}
