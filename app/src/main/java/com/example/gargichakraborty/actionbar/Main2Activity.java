package com.example.gargichakraborty.actionbar;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText ednm,edunm,edpass;
    Button btn_r,btn_s;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setIcon(R.drawable.logo);
        actionbar.setTitle("Sign Up or Log in");
        actionbar.setDisplayUseLogoEnabled(true);
        actionbar.setDisplayShowHomeEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);

        ednm=(EditText)findViewById(R.id.ednm);
        edunm=(EditText)findViewById(R.id.edunm);
        edpass=(EditText)findViewById(R.id.edpass);
        btn_r=(Button)findViewById(R.id.btn_r);
        btn_s=(Button)findViewById(R.id.btn_s);
        db=openOrCreateDatabase("projectdata.db", Context.MODE_PRIVATE,null);
        db.execSQL("create table if not exists user_dtls(name varchar,username varchar,pass varchar)");
        btn_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nm=ednm.getText().toString();
                String unm=edunm.getText().toString();
                String pas=edpass.getText().toString();
                db.execSQL("insert into user_dtls values('"+nm+"','"+unm+"','"+pas+"')");
                Intent i=new Intent(getBaseContext(),Main3Activity.class);
                startActivity(i);



            }
        });
        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getBaseContext(),Main3Activity.class);
                startActivity(i);

            }
        });



    }
}
