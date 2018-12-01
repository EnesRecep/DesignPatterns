package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enes Recep on 22.11.2018.
 */
public class WeatherStation implements Observable {

    List<Observer> observerList = new ArrayList<Observer>();
    private int temperature;

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }


    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList){
            observer.update();
        }
    }


    public int getTemperature(){
        return temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Temperature is setted to :" + temperature);
        notifyObserver();
    }
}
