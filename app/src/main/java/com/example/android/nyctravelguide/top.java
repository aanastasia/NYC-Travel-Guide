package com.example.android.nyctravelguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Anastasia on 02.04.2016.
 */
public class top extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topoftherock);
    }
    /**
     * This method is called when button "Admission" is clicked.
     */
    public void onAdmissionTopClick(View v) {
        if (v.getId() == R.id.clickToTopAdmission)

        {
            Intent i = new Intent(top.this, Admission_top.class);
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
        double latitude = 40.7589;
        double longitude = -73.9794;
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
        String url = "http://www.rockefellercenter.com/attractions/top-of-the-rock-observation-deck/";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


}