package com.example.bharg.cals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg);
    }

public void ab(View a){



    Button yourButton = (Button) findViewById(R.id.lg);

    yourButton.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            startActivity(new Intent(Main2Activity.this, MainActivity.class));
        }
    });


}
    public void reg(View view){

        EditText e1 = (EditText)findViewById(R.id.pass);
        EditText e2 = (EditText)findViewById(R.id.pass2);
        EditText e3 = (EditText)findViewById(R.id.name);
        EditText e4 = (EditText)findViewById(R.id.phn);
        EditText e5 = (EditText)findViewById(R.id.em);



        String email = e5.getText().toString().trim();

        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";



        int var2 = e1.getText().toString().compareTo( e2.getText().toString());

        if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty() || e3.getText().toString().isEmpty() || e4.getText().toString().isEmpty()|| e5.getText().toString().isEmpty()){


            Toast.makeText(this, "plz enter all field", Toast.LENGTH_SHORT).show();

        }
else if(e4.getText().toString().length()!=10){
            Toast.makeText(this, "enter valid num", Toast.LENGTH_SHORT).show();




        }
        else if(var2 != 0){



            Toast.makeText(this, "plz enter both same pass", Toast.LENGTH_SHORT).show();


        }
        else if (email.matches(emailPattern))
        {
            Toast.makeText(getApplicationContext(),"ok ",Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(this, "enter valid email", Toast.LENGTH_SHORT).show();
        }




    }

}
