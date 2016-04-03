package com.example.android.nyctravelguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when button "Find out more" is clicked.
     */

    public void onButtonClick (View v) {
        if (v.getId() == R.id.clickToMenu)

        {
            Intent i = new Intent(MainActivity.this, Menu.class);
            startActivity(i);
        }

    }
}
