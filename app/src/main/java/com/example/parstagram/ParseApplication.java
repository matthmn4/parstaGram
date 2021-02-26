package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KBONSiMzfycLYNcWtFRlfd2qIO10nTnNdrZrgxDy")
                .clientKey("8pusSJ1wjpRpgHNYC618TnJAY5z1jKI80M9xCaGe")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
