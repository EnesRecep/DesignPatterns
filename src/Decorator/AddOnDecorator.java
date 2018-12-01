package Decorator;

/**
 * Created by Enes Recep on 2.12.2018.
 */
public abstract class AddOnDecorator extends Beverage{

    //Middle level of decorator class for add ons

    public abstract String getDescription();
    public abstract int cost();
}
