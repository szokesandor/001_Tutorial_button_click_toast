package com.szokesandor.tutorials.tutorial_button_click_toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonOnClick(View v)
    {
        Button button = (Button) v;
        ((Button) v).setText("Toast was displayed!");
        Toast.makeText(MainActivity.this, "Toast message :)",Toast.LENGTH_LONG).show();
    }

}
