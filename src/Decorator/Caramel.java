package Decorator;

/**
 * Created by Enes Recep on 2.12.2018.
 */
public class Caramel extends AddOnDecorator {

    //Caramel add on class , outermost level of decorator

    Beverage beverage;

    public Caramel(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Add On Caramel";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 6;
    }
}
