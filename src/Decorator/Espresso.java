package Decorator;

/**
 * Created by Enes Recep on 2.12.2018.
 */
public class Espresso extends Beverage{

    //Concrete coffee class

    @Override
    public String getDescription() {
        return "This is Espresso";
    }

    @Override
    public int cost() {
        return 5;
    }
}
