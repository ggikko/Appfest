package ggikko.me.appfest.generic;

/**
 * Created by admin on 16. 6. 21..
 */
public class CGeneric<Type> {

    private Type t;

    private void set(Type t){
        this.t = t;
    }

    private Type get(){
        return t;
    }

}
