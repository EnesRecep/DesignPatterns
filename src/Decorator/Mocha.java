package Decorator;

/**
 * Created by Enes Recep on 2.12.2018.
 */
public class Mocha extends Beverage{

    //Concrete Coffee class

    @Override
    public String getDescription() {
        return "This is Mocha";
    }

    @Override
    public int cost() {
        return 4;
    }
}
