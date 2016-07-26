package com.support.android.intentfilters;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the intent that started this activity
        Intent intent = getIntent();
        Uri data = intent.getData();

        // Figure out what to do based on the intent type
        if (intent.getType().indexOf("image/") != -1) {
            // Handle intents with image data ...
            returnResult(1);
        } else if (intent.getType().equals("text/plain")) {
            // Handle intents with text ...
            returnResult(1);
        }
        else returnResult(0);


    }

    public void returnResult(int x)
    {
        if(x==1)
        {
            // Create intent to deliver some kind of result data
            Intent result = new Intent("com.example.RESULT_ACTION", Uri.parse("content://result_uri"));
            setResult(Activity.RESULT_OK, result);
            finish();

            /**
             * If you simply need to return an integer that indicates one of several result options,
             * you can set the result code to any value higher than 0. If you use the result code
             * to deliver an integer and you have no need to include the Intent,
             * you can call setResult() and pass only a result code.
             */
            //setResult(RESULT_COLOR_RED);

        }
        else
        {
            // Create intent to deliver some kind of result data
            Intent result = new Intent("com.example.RESULT_ACTION", Uri.parse("content://result_uri"));
            setResult(Activity.RESULT_CANCELED, result);
            finish();
        }
    }
}
