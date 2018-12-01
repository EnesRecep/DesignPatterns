package Decorator;

/**
 * Created by Enes Recep on 2.12.2018.
 */
public class Milk extends AddOnDecorator {

    //Milk add on class , outermost level of decorator

    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Add On Milk";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 8;
    }
}
