package com.aleangelozi.logcatmessagesjava;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.aleangelozi.logcatmessagesjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // From top-down, every type of log message shows all types of log messages below it.
        Log.v(TAG, "Verbose log.");
        Log.d(TAG, "Debug log.");
        Log.i(TAG, "Info log.");
        Log.w(TAG, "Warning log.");
        Log.e(TAG, "Error log.");

    }
}