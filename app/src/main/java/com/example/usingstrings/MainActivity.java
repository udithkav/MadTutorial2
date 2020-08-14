package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Life Cycle","OnCreate() Invoked");
        TextView mmm = findViewById(R.id.TvMsg2);
        mmm.setText(R.string.Msg2);


    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Life Cycle", "OnStart Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Life Cycle", "OnRestart Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Life Cycle", "OnResume Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Life Cycle", "OnPause Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Life Cycle", "OnStop Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Life Cycle", "OnDestroy Called");
    }
}