package com.mzc.administrator.studentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class reggActivity extends AppCompatActivity {
    EditText name,admno,rollno,college,place,studentid,password,confpassword;
    Button b3,b4;
    String nm,ano,rno,colg,plc,stid,pswd,cpswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regg);
        name=(EditText)findViewById(R.id.name);
        admno=(EditText)findViewById(R.id.add);
        rollno=(EditText)findViewById(R.id.rollno);
        college=(EditText)findViewById(R.id.colge);
        place=(EditText)findViewById(R.id.plce);
        studentid=(EditText)findViewById(R.id.studid);
        password=(EditText)findViewById(R.id.password);
        confpassword=(EditText)findViewById(R.id.con);
        b3=(Button)findViewById(R.id.reg);
        b4=(Button)findViewById(R.id.alr);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nm=name.getText().toString();
                ano=admno.getText().toString();
                rno=rollno.getText().toString();
                colg=college.getText().toString();
                plc=place.getText().toString();
                stid=studentid.getText().toString();
                pswd=password.getText().toString();
                cpswd=confpassword.getText().toString();
                Toast.makeText(getApplicationContext(),nm,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),ano,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),rno,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),colg,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),plc,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),stid,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),pswd,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),cpswd,Toast.LENGTH_LONG).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(getApplicationContext(),login_Activity.class);
                startActivity(i);

                }


        });
    }
}
