package Singleton;

/**
 * Created by Enes Recep on 20.12.2018.
 */
public class Singleton {

    private static Singleton singleton;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton == null)
            singleton = new Singleton();
        return singleton;

    }

}
