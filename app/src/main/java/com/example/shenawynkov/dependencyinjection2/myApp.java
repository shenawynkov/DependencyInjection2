package com.example.shenawynkov.dependencyinjection2;

import android.app.Application;



/**
 * Created by smahmoud on 8/16/2017.
 */

public class myApp extends Application {
    Component component;
    @Override
    public void onCreate() {
        super.onCreate();
        component=DaggerComponent.create();
        /*
        // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(this)) // This also corresponds to the name of your module: %component_name%Module
                .netModule(new NetModule("https://api.github.com"))
                .build();

        // If a Dagger 2 component does not have any constructor arguments for any of its modules,
        // then we can use .create() as a shortcut instead:
        //  mNetComponent = com.codepath.dagger.components.DaggerNetComponent.create();
    }
         */
    }

    public Component getComponent() {
        return  component;
    }
}
