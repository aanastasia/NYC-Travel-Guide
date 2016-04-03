package com.example.android.nyctravelguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Anastasia on 02.04.2016.
 */
public class Empire extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empire);
    }

    /**
     * This method is called when button "Admission" is clicked.
     */
    public void onAdmissionEmpireClick(View v) {
        if (v.getId() == R.id.clickToEmpireAdmission)

        {
            Intent i = new Intent(Empire.this, Admission_empire.class);
            startActivity(i);
        }
    }

    /**
     * This method is called when the map button is clicked.
     */
    public void map(View view) {
        /**
         * This intent opens map.
         */
        double latitude = 40.7484;
        double longitude = -73.9857;
        String label = "ABC Label";
        String uriBegin = "geo:" + latitude + "," + longitude;
        String query = latitude + "," + longitude + "(" + label + ")";
        String encodedQuery = Uri.encode(query);
        String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
        Uri uri = Uri.parse(uriString);
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }
    /**
     * This method is called when the website button is clicked.
     */
    public void website(View view) {
        /**
         * This intent opens site in browser.
         */
        String url = "http://www.esbnyc.com/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


}
