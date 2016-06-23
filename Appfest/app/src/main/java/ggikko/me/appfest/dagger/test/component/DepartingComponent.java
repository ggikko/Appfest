package ggikko.me.appfest.dagger.test.component;

import javax.inject.Singleton;

import dagger.Component;
import ggikko.me.appfest.dagger.test.module.DepartModule;
import ggikko.me.appfest.dagger.test.qualifier.PerActivity;
import ggikko.me.appfest.ui.SubMainActivity;

/**
 * Created by admin on 16. 6. 22..
 */

@Component(modules = {DepartModule.class})
@Singleton
public interface DepartingComponent {
}
