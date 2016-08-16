package com.example.admin.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context;
import android.view.View.OnClickListener;
import  android.content.Intent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
      private Button btn;
      private EditText editText;
      private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.editText);
        editText1=(EditText)findViewById(R.id.editText2);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name=editText.getText().toString();
                 String pass=editText1.getText().toString();
                if(name.equals("Arun")&& pass.equals("123"))
              {
                  Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                  intent1.putExtra("name", name);
                   intent1.putExtra("pass",pass);
                   startActivity(intent1);
              }
              else
              {
                  Toast.makeText(MainActivity.this, "Invalid Username & password pair.", Toast.LENGTH_LONG).show();
              }

              //Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                //intent.putExtra("name",name);
                //startActivity(intent);
            }
        });


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
}
