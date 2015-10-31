package com.example.pratik.bostonhacks;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

public class Home extends Activity {


    ArrayList<String> drinksConsumed = new ArrayList<String>();
    private double weight;
    Button button;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        addListenerOnButton1();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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

    public double getWeight () {
        return this.weight;
    }


    // Button listener for
    public void addListenerOnButton1() {
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                setText();
                /*
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                startActivity(browserIntent);
                */
            }
        });
    } // end of method


    // Button listener for weight
    public void addListenerOnButton2() {
        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                
                setText();
                /*
                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.mkyong.com"));
                startActivity(browserIntent);
                */
            }
        });
    } // end of method

    public void setText () {
        EditText userWeight = (EditText) findViewById(R.id.weight);
        TextView text = (TextView) findViewById(R.id.textView1);
        text.setText(userWeight.getText().toString());
    } // end of method

    public void spinnerListener () {

    }
} // end of class
