package Decorator;

/**
 * Created by Enes Recep on 2.12.2018.
 */
public class Main {

    public static void main(String[] args) {


        Beverage b = new Caramel(new Espresso()); //Outside add ons, inside base coffee
        Beverage b2 = new Milk(new Caramel(new Mocha()));
        Beverage b3 = new Milk(new Milk(new Milk(new Caramel(new Caramel(new Mocha())))));

        System.out.println(b.cost());
        System.out.println(b2.cost());
        System.out.println(b3.cost());

    }
}
