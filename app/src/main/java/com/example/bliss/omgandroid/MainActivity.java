package com.example.bliss.omgandroid;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView arms, ears, nose, eyebrows, eyes, glasses, hat, moustache, mouth, shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arms = findViewById(R.id.Arms);
        ears = findViewById(R.id.Ears);
        eyebrows = findViewById(R.id.Eyebrows);
        eyes = findViewById(R.id.Eyes);
        nose = findViewById(R.id.Nose);
        glasses = findViewById(R.id.Glasses);
        mouth = findViewById(R.id.Mouth);
        hat = findViewById(R.id.Hat);
        moustache = findViewById(R.id.Moustache);
        shoes = findViewById(R.id.Shoes);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.cbArms:
                ImageView imgArms = findViewById(R.id.Arms);
                if (checked)
                    imgArms.setVisibility(View.VISIBLE);
            else
                    imgArms.setVisibility(View.INVISIBLE);
                break;
            case R.id.cbEars:
                ImageView imgEars = findViewById(R.id.Ears);
                if (checked)
                    imgEars.setVisibility(View.VISIBLE);
                else
                    imgEars.setVisibility(View.INVISIBLE);
                break;
            case R.id.cbEyebrows:
                ImageView imgEyebrows = findViewById(R.id.Eyebrows);
                if (checked)
                    imgEyebrows.setVisibility(View.VISIBLE);
                else
                    imgEyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.cbEyes:
                ImageView imgEyes = findViewById(R.id.Eyes);
                if (checked)
                    imgEyes.setVisibility(View.VISIBLE);
                else
                    imgEyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.cbGlasses:
                ImageView imgGlasses = findViewById(R.id.Glasses);
                if (checked)
                    imgGlasses.setVisibility(View.VISIBLE);
                else
                    imgGlasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.cbHat:
                ImageView imgHat = findViewById(R.id.Hat);
                if (checked)
                    imgHat.setVisibility(View.VISIBLE);
                else
                    imgHat.setVisibility(View.INVISIBLE);
                break;
            case R.id.cbMoustache:
                ImageView imgMoustache = findViewById(R.id.Moustache);
                if (checked)
                    imgMoustache.setVisibility(View.VISIBLE);
                else
                    imgMoustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.cbMouth:
                ImageView imgMouth = findViewById(R.id.Mouth);
                if (checked)
                    imgMouth.setVisibility(View.VISIBLE);
                else
                    imgMouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.cbNose:
                ImageView imgNose = findViewById(R.id.Nose);
                if (checked)
                    imgNose.setVisibility(View.VISIBLE);
                else
                    imgNose.setVisibility(View.INVISIBLE);
                break;
            case R.id.cbShoes:
                ImageView imgShoes = findViewById(R.id.Shoes);
                if (checked)
                    imgShoes.setVisibility(View.VISIBLE);
                else
                    imgShoes.setVisibility(View.INVISIBLE);
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("arms_vis", arms.getVisibility());
        outState.putInt("eyes_vis", eyes.getVisibility());
        outState.putInt("eyebrows_vis", eyebrows.getVisibility());
        outState.putInt("nose_vis", nose.getVisibility());
        outState.putInt("hat_vis", hat.getVisibility());
        outState.putInt("mouth_vis", mouth.getVisibility());
        outState.putInt("moustache_vis", moustache.getVisibility());
        outState.putInt("shoes_vis", shoes.getVisibility());
        outState.putInt("ears_vis", ears.getVisibility());
        outState.putInt("glasses_vis", glasses.getVisibility());
    }

    @Override
    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);

        int value_stored = inState.getInt("arms_vis");
        arms.setVisibility(value_stored);

        value_stored = inState.getInt("eyes_vis");
        eyes.setVisibility(value_stored);

        value_stored = inState.getInt("eyebrows_vis");
        eyebrows.setVisibility(value_stored);

        value_stored = inState.getInt("nose_vis");
        nose.setVisibility(value_stored);

        value_stored = inState.getInt("glasses_vis");
        glasses.setVisibility(value_stored);

        value_stored = inState.getInt("ears_vis");
        ears.setVisibility(value_stored);

        value_stored = inState.getInt("hat_vis");
        hat.setVisibility(value_stored);

        value_stored = inState.getInt("mouth_vis");
        mouth.setVisibility(value_stored);

        value_stored = inState.getInt("moustache_vis");
        moustache.setVisibility(value_stored);

        value_stored = inState.getInt("shoes_vis");
        shoes.setVisibility(value_stored);
    }

}
