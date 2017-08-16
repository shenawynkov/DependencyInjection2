package com.example.shenawynkov.dependencyinjection2;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shenawynkov on 8/16/2017.
 */
@Module
public class AppModule {
    Application application;
    AppModule(Application application)
    {
        this.application=application;
    }
    @Provides
     @Singleton
    Application providesApplication()
    {
        return  application;
    }
}
