package Observer;

/**
 * Created by Enes Recep on 22.11.2018.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        WeatherStation station = new WeatherStation();

        PhoneDisplay phone1 = new PhoneDisplay(station);
        PhoneDisplay phone2 = new PhoneDisplay(station);
        PhoneDisplay phone3 = new PhoneDisplay(station);
        PhoneDisplay phone4 = new PhoneDisplay(station);

        station.add(phone1);
        station.add(phone2);
        station.add(phone3);
        station.add(phone4);

        for(int i = 0 ; i < 10 ; i++){
            station.setTemperature(i*20);
            Thread.sleep(200);
        }
    }
}
