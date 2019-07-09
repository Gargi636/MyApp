package com.example.gargichakraborty.actionbar;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setIcon(R.drawable.logo);
        actionbar.setDisplayUseLogoEnabled(true);
        actionbar.setDisplayShowHomeEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.mysongs:
                Toast.makeText(this,"Now Listen To Your Favourita Songs.",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Main5Activity.class));
                break;

            case R.id.comments:
                Toast.makeText(this,"Comment in this section to show your love",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Main7Activity.class));
                break;

            case R.id.user:
                Toast.makeText(this,"Sign up or log in",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Main2Activity.class));
                break;

            case R.id.contact:
                Toast.makeText(this,"Contact Us",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Main8Activity.class));
                break;


        }



        return super.onOptionsItemSelected(item);
    }
}
