package com.example.gargichakraborty.actionbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Toast.makeText(this,"Groove with music all day long",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this,Main5Activity.class));
    }
}
