package com.example.shenawynkov.dependencyinjection2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.constraint.solver.Cache;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
   @Inject
    Plus plus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((myApp)getApplication()).component.inject(this);
        Toast.makeText(getApplicationContext(),plus.plus(1,5)+"",Toast.LENGTH_LONG).show();


    }
}
