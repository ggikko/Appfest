package ggikko.me.appfest;

import android.app.Application;

import ggikko.me.appfest.dagger.test.component.DaggerDepartingComponent;
import ggikko.me.appfest.dagger.test.component.DaggerSpeakingComponent;
import ggikko.me.appfest.dagger.test.component.DepartingComponent;
import ggikko.me.appfest.dagger.test.component.SpeakingComponent;
import ggikko.me.appfest.dagger.test.module.GreetingModule;
import lombok.Getter;

/**
 * Created by admin on 16. 6. 22..
 */
public class AppfestApplication extends Application {

    @Getter private SpeakingComponent speakingComponent;
    @Getter private DepartingComponent departingComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        dependency();
    }

    private void dependency() {
        departingComponent = DaggerDepartingComponent.builder().build();
        speakingComponent = DaggerSpeakingComponent.builder().departingComponent(departingComponent).greetingModule(new GreetingModule()).build();


    }


}
