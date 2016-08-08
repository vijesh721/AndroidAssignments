package com.example.admin.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import  android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater menuInflater=getMenuInflater();
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()){

            case R.id.menu_bookmark:
                Toast.makeText(MainActivity.this,"Bookmark is Selected",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.menu_save:
                Toast.makeText(MainActivity.this,"Save is Selected",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.menu_search:
                Toast.makeText(MainActivity.this,"Search is Selected",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.menu_share:
                Toast.makeText(MainActivity.this,"Share is Selected",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.menu_delete:
                Toast.makeText(MainActivity.this,"Delete is Selected",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.menu_preferences:
                Toast.makeText(MainActivity.this,"Preferences is Selected",Toast.LENGTH_SHORT).show();
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    }

