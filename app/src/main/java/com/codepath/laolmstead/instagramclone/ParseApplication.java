package com.codepath.laolmstead.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("P7c4WIcuAFkaJpeJVr4GhIUSQiYUW21sEBcuDfBy")
                .clientKey("BDOxiNEtEf4p0oFeTkmySTW4qIbbDGyUdev5ULGh")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
