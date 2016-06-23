package ggikko.me.appfest.dagger.test.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by admin on 16. 6. 22..
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
