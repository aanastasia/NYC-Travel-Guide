package com.example.android.nyctravelguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


/**
 * Created by Anastasia on 01.04.2016.
 */
public class Menu extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }

    /**
     * This method is called when button "One World Trade Center Observatory" is clicked.
     */
    public void onButtonClick(View v) {
        if (v.getId() == R.id.clickToOWTC)

        {
            Intent i = new Intent(Menu.this, owtc.class);
            startActivity(i);
        }

    }

    /**
     * This method is called when button "Top of The Rock Observation Deck" is clicked.
     */
    public void onTopClick(View v) {
        if (v.getId() == R.id.clickToTopOfTheRock)

        {
            Intent i = new Intent(Menu.this, top.class);
            startActivity(i);
        }

    }

    /**
     * This method is called when button "Empire State Building" is clicked.
     */
    public void onEmpireClick(View v) {
        if (v.getId() == R.id.clickToEmpireStateBuilding)

        {
            Intent i = new Intent(Menu.this, Empire.class);
            startActivity(i);
        }

    }

    /**
     * This method is called when button "Statue of Liberty and Ellis Island Immigration Museum" is clicked.
     */
    public void onStatueClick(View v) {
        if (v.getId() == R.id.clickToStatueOfLiberty)

        {
            Intent i = new Intent(Menu.this, Statue.class);
            startActivity(i);
        }

    }

    /**
     * This method is called when button "American Museum of Natural History" is clicked.
     */
    public void onMuseumClick(View v) {
        if (v.getId() == R.id.clickToAmericanMuseum)

        {
            Intent i = new Intent(Menu.this, Museum.class);
            startActivity(i);
        }

    }

    /**
     * This method is called when button "Central Park" is clicked.
     */
    public void onParkClick(View v) {
        if (v.getId() == R.id.clickToCentralPark)

        {
            Intent i = new Intent(Menu.this, Central_park.class);
            startActivity(i);
        }

    }
}
