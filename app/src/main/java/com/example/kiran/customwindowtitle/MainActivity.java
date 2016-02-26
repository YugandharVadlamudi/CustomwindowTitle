package com.example.kiran.customwindowtitle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        boolean s=requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        Log.d("svalueis",Boolean.toString(s));
        setContentView(R.layout.activity_main);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,R.layout.customheader);
    }
}
