package ggikko.me.appfest.generic;

/**
 * Created by admin on 16. 6. 21..
 */
public class HowTo<T extends MacBook> {

    T t;

    public void callBack(T test){
        this.t.getMacBook();
        test.getMacBook();
    }
}
