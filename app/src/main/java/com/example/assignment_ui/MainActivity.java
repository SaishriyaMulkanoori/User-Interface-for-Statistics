package com.example.assignment_ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> {
            switch(menuItem.getItemId()){
                case R.id.statistics:
                    startActivity(new Intent(getApplicationContext(),Statistics.class));
                    overridePendingTransition(0,0);
                    return true;

                case R.id.profile:
                    startActivity(new Intent(getApplicationContext(), ContactsContract.Profile.class));
                    overridePendingTransition(0,0);
                    return true;

                case R.id.payments:
                    startActivity(new Intent(getApplicationContext(),payments.class));
                    overridePendingTransition(0,0);
                    return true;

                case R.id.home:

                    return true;

            }
            return false;
        });

    }



}