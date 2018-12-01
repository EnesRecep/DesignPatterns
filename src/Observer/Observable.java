package Observer;

/**
 * Created by Enes Recep on 22.11.2018.
 */
public interface Observable{

    public void add(Observer observer);
    public void remove(Observer observer);
    public void notifyObserver();
}
