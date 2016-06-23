package ggikko.me.appfest.dagger.test.module;

import dagger.Module;
import dagger.Provides;
import ggikko.me.appfest.dagger.test.ByeClass;
import ggikko.me.appfest.dagger.test.HelloClass;
import ggikko.me.appfest.dagger.test.HiClass;
import ggikko.me.appfest.dagger.test.qualifier.PerActivity;

/**
 * Created by admin on 16. 6. 22..
 */

@Module
public class GreetingModule {

    @Provides
    @PerActivity
    HelloClass providesHelloClass(){
        return new HelloClass();
    }

    @Provides
    @PerActivity
    HiClass providesHiClass(){
        return new HiClass();
    }

}
