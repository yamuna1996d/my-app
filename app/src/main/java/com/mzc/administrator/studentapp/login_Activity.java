package com.mzc.administrator.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_Activity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1,b2;
    String st,pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_);
        ed1=(EditText)findViewById(R.id.studid);
        ed2=(EditText)findViewById(R.id.pwd);
        b1=(Button)findViewById(R.id.login);
        b2=(Button)findViewById(R.id.register);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st=ed1.getText().toString();
                pd=ed2.getText().toString();
                if(st.equals("mzc")&&pd.equals("college"))
                {
                    Intent i=new Intent(getApplicationContext(),welcomeActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),reggActivity.class);
                startActivity(i);
            }
        });
    }
}
