package com.example.pratik.bostonhacks;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;

public class DataCollect extends Activity {

    int weight;
    int amount;
    int age;
    int minutes;
    Button beerButton;
    Button wineButton;
    Button liquorButton;
    Button getBLA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collect);
        amount = getAlcoholAmount();
        age = getUserAge();
        weight = getUserWeight();
        minutes = getLastTimeAmount();

        beerButton = (Button) findViewById(R.id.beer);
        beerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("BEER");
                System.out.println(getAlcoholAmount());
                System.out.println(getUserAge());
                System.out.println(getUserWeight());
                System.out.println(getLastTimeAmount());
                Beer b = new Beer (age, weight, amount, minutes, true);
                double temp = b.getBAC();
                if (temp > 0.08) {

                }
            }
        });

        wineButton = (Button) findViewById(R.id.wine);
        wineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("WINE");
                System.out.println(getAlcoholAmount());
                System.out.println(getUserAge());
                System.out.println(getUserWeight());
                System.out.println(getLastTimeAmount());
                Wine w = new Wine (age, weight, minutes, amount, true);
                double temp = w.getBAC();
                if (temp > 0.08) {

                }
            }
        });

        liquorButton = (Button) findViewById(R.id.liquor);
        liquorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("LIQUOR");
                System.out.println(getAlcoholAmount());
                System.out.println(getUserAge());
                System.out.println(getUserWeight());
                System.out.println(getLastTimeAmount());
                Liquor l = new Liquor (age, weight, minutes, amount, true);
                double temp = l.getBAC();
                if (temp > 0.08) {

                }
            }
        });

        getBLA = (Button) findViewById(R.id.getBLA);
        getBLA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });











    } // end of method

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_data_collect, menu);
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
    } // end of method

    // Method to get amount of alcohol
    public int getAlcoholAmount () {
        EditText temp = (EditText) findViewById(R.id.amount);
        return Integer.parseInt(temp.getText().toString());
    }

    // Method to get the user age
    public int getUserAge () {
        EditText temp = (EditText) findViewById(R.id.age);
        return Integer.parseInt(temp.getText().toString());
    }

    // Method to get the userInputedWeight
    public int getUserWeight () {
        EditText temp = (EditText) findViewById(R.id.weight);
        return Integer.parseInt(temp.getText().toString());
    }

    // Method to get the amount since the last drink
    public int getLastTimeAmount () {
        EditText temp = (EditText) findViewById(R.id.time);
        return Integer.parseInt(temp.getText().toString());
    }
} // end of class