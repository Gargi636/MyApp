package com.example.gargichakraborty.actionbar;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText edu,edp;
    Button bt_log;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edu=(EditText)findViewById(R.id.edu);
        edp=(EditText)findViewById(R.id.edp);
        bt_log=(Button)findViewById(R.id.bt_log);
        db=openOrCreateDatabase("projectdata.db", Context.MODE_PRIVATE,null);
        bt_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String u=edu.getText().toString();
                String p=edp.getText().toString();
                Cursor c=db.rawQuery("select * from user_dtls where username ='"+u+"'and pass='"+p+"'",null);
                if(c.moveToNext()){

                    Intent i=new Intent(getBaseContext(),Main4Activity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getBaseContext(),"Wrong data",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
