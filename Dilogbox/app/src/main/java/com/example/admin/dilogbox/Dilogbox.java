package com.example.admin.dilogbox;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import  android.widget.Button;
import android.widget.Toast;
import  android.view.View;
import android.content.Context;
import android.app.Activity;

public class Dilogbox extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private  Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilogbox);
        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertdilog = new AlertDialog.Builder(Dilogbox.this).create();
                alertdilog.setTitle("Confirmation");
                alertdilog.setMessage("Single Button");
                alertdilog.setIcon(R.drawable.ic_save);

                alertdilog.setButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_LONG).show();
                    }
                });
//

                alertdilog.show();
            }
        });
     btn2.setOnClickListener(new View.OnClickListener(){
         public  void onClick(View v)
         {
             AlertDialog alertdilog = new AlertDialog.Builder(Dilogbox.this).create();
             alertdilog.setTitle("Confirmation");
             alertdilog.setMessage("Second Button");
             alertdilog.setIcon(R.drawable.ic_save);

             alertdilog.setButton(DialogInterface.BUTTON_POSITIVE,"OK", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_LONG).show();
                 }
             });
             alertdilog.setButton(DialogInterface.BUTTON_NEGATIVE,"yes", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     Toast.makeText(getApplicationContext(), "Clicked yes", Toast.LENGTH_LONG).show();
                 }
             });
//
             alertdilog.show();
         }
     });

        btn3.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v)
            {
                AlertDialog alertdilog = new AlertDialog.Builder(Dilogbox.this).create();
                alertdilog.setTitle("Confirmation");
                alertdilog.setMessage("Second Button");
                alertdilog.setIcon(R.drawable.ic_save);

                alertdilog.setButton(DialogInterface.BUTTON_POSITIVE,"YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Clicked OK", Toast.LENGTH_LONG).show();
                    }
                });
                alertdilog.setButton(DialogInterface.BUTTON_NEGATIVE,"NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Clicked yes", Toast.LENGTH_LONG).show();
                    }
                });
                alertdilog.setButton(DialogInterface.BUTTON_NEUTRAL,"Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Clicked Cancel", Toast.LENGTH_LONG).show();
                    }
                });
//
                alertdilog.show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dilogbox, menu);
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
}
