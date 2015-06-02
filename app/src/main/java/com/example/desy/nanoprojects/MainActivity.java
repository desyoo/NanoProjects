package com.example.desy.nanoprojects;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


    /** Called when the user touches the button */
    public void MyAppSendMessage(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void SpotifySendMessage(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Spotify app";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void SuperDuoSendMessage(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Super Duo";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void BuildBiggerSendMessage(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Build it Bigger";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void XYZSendMessage(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch XYZ Reader";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void CapstoneSendMessage(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Capstone";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
