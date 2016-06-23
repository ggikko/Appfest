package ggikko.me.appfest.dagger.test.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ggikko.me.appfest.dagger.test.AwayClass;
import ggikko.me.appfest.dagger.test.ByeClass;
import ggikko.me.appfest.dagger.test.HelloClass;
import ggikko.me.appfest.dagger.test.HiClass;
import ggikko.me.appfest.dagger.test.qualifier.PerActivity;

/**
 * Created by admin on 16. 6. 22..
 */
@Module
public class DepartModule {

    @Provides
    @Singleton
    AwayClass providesAwayClass(){
        return new AwayClass();
    }

    @Provides
    @Singleton
    ByeClass providesByeClass(){
        return new ByeClass();
    }

}
