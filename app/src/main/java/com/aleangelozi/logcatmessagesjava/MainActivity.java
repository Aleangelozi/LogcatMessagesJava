package com.aleangelozi.logcatmessagesjava;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // From top-down, every type of log message shows all types of log messages below it.
        Log.v(TAG, "Verbose log.");
        Log.d(TAG, "Debug log.");
        Log.i(TAG, "Info log.");
        Log.w(TAG, "Warning log.");
        Log.e(TAG, "Error log.");

    }
}