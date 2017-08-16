package com.example.shenawynkov.dependencyinjection2;

import javax.inject.Singleton;

/**
 * Created by smahmoud on 8/16/2017.
 */
@Singleton
@dagger.Component (modules = computationModule.class)
public interface Component {
    void inject(MainActivity mainActivity);
}
