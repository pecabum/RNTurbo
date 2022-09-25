package com.turboandroid;

import androidx.annotation.NonNull;

import com.facebook.fbreact.specs.NativeSampleModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;

public class NativeSampleModuleImpl extends NativeSampleModuleSpec {
    public static String NAME = "NativeSampleModule";

    public NativeSampleModuleImpl(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getHelloWorld(String first, String second) {
        return "Hello world: " + first + " " + second ;
    }
}