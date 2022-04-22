package com.example.random_spitter;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    int[] theNumbers = {1,8,4,8,0,9,9,6,3};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //onClick function for button1(Spit Deon)
    public void spitDeon(View view)
    {
        int microchip;
        TextView outputBox = (TextView) findViewById(R.id.outputBox);

        Random rand = new Random();
        microchip = rand.nextInt(1+5);

        for (int i = 1; i <= microchip; i++)
        {
            outputBox.append("\nDeon");
        }
    }

    //onClick function for button2(Spit Ray)
    public void spitRay(View view)
    {
        int javascript;
        TextView outputBox = (TextView) findViewById(R.id.outputBox);

        Random rand = new Random();
        javascript = rand.nextInt(1+5);

        for (int i = 1; i <= javascript; i++)
        {
            outputBox.append("\nRay");
        }
    }

    //onClick function for button3(Spit the Numbers)
    public void spitTheNumbers(View view)
    {
        int demons;
        int cat;
        TextView outputBox = (TextView) findViewById(R.id.outputBox);

        Random rand = new Random();
        demons = rand.nextInt(8);
        Random rand2 = new Random();
        cat = rand2.nextInt(1+5);

        for (int i = 1; i <= cat; i++)
        {
            outputBox.append("\n" + theNumbers[demons]);
        }
    }

    //onClick function for button4(Spit it All)
    public void spitItAll(View view)
    {
        int tac;
        int dog;
        int god;
        int sensations;
        TextView outputBox = (TextView) findViewById(R.id.outputBox);

        Random rand = new Random();
        tac = rand.nextInt(1+5);
        Random rand2 = new Random();
        dog = rand2.nextInt(1+5);
        Random rand3 = new Random();
        god = rand3.nextInt(1+5);
        Random rand4 = new Random();
        sensations = rand4.nextInt(8);

        for (int i = 1; i <= tac; i++)
        {
            outputBox.append("\nDeon");
        }

        for (int i = 1; i <= dog; i++)
        {
            outputBox.append("\nRay");
        }

        for (int i = 1; i <= god; i++)
        {
            outputBox.append("\n" + theNumbers[sensations]);
        }
    }

    //onClick function for button5(Clear)
    public void clear(View view)
    {
        TextView outputBox = (TextView) findViewById(R.id.outputBox);
        outputBox.setText("Here is your Output:\n");
    }
}

