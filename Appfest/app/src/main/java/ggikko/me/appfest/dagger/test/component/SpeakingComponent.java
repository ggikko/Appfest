package ggikko.me.appfest.dagger.test.component;

import dagger.Component;
import dagger.Module;
import ggikko.me.appfest.dagger.test.module.GreetingModule;
import ggikko.me.appfest.dagger.test.qualifier.PerActivity;
import ggikko.me.appfest.ui.MainActivity;

/**
 * Created by admin on 16. 6. 22..
 */

@PerActivity
@Component(modules = {GreetingModule.class}, dependencies = DepartingComponent.class)
public interface SpeakingComponent {

    void inject(MainActivity mainActivity);
}
