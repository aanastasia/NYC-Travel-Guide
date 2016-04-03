package com.example.android.nyctravelguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Anastasia on 02.04.2016.
 */
public class Central_park extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.central_park);
    }
    /**
     * This method is called when button "Admission" is clicked.
     */
    public void onAdmissionParkClick(View v) {
        if (v.getId() == R.id.clickToParkAdmission)

        {
            Intent i = new Intent(Central_park.this, Admission_park.class);
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
        double latitude = 40.7829;
        double longitude = -73.9654;
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
        String url = "http://www.centralparknyc.org/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


}
