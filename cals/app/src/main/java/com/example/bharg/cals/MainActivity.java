package com.example.bharg.cals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    EditText un,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_activity);

    }
    public void btnlogin_Click(View v)
    {

        un=(EditText)findViewById(R.id.etusername);
        pass=(EditText)findViewById(R.id.etpassword);
        String user=un.getText().toString();
        String pas=pass.getText().toString();

        if(un.getText().toString().equals("bha") && pass.getText().toString().equals("abc")){


            Toast.makeText(this, "thai gyu", Toast.LENGTH_SHORT).show();

        }
          else if (un.getText().toString().equals("") && pass.getText().toString().equals("")) {


            Toast.makeText(this, "bhai kaik to nakh", Toast.LENGTH_SHORT).show();


        }
        else {

            Toast.makeText(this, "halto tha hve", Toast.LENGTH_SHORT).show();



        }

      }




    public void btnlogin(View e){


        Button yourButton = (Button) findViewById(R.id.btnlo);

        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }

    }



