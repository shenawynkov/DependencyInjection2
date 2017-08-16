package com.example.shenawynkov.dependencyinjection2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Shenawynkov on 8/16/2017.
 */
@Module
public class computationModule {

    @Provides
    @Singleton
    Plus providesPlus()
    {
        return new Plus();
    }
}


