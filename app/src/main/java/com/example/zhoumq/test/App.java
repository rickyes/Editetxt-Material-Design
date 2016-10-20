package com.example.zhoumq.test;

import android.app.Application;

/**
 * Created by zhoumq on 16-10-20.
 */

public class App extends Application{

    public static boolean DEBUG = false;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static void setDebug(boolean debug){
        DEBUG = debug;
    }

    public static boolean isDEBUG() {
        return DEBUG;
    }
}
