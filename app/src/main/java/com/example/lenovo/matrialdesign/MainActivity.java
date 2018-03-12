package com.example.lenovo.matrialdesign;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{
    ImageButton image , img2,signbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.id);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);

        toggle.syncState();






        NavigationView navigationView = (NavigationView) findViewById(R.id.menu);
        navigationView.setNavigationItemSelectedListener(this);
        image=(ImageButton)findViewById(R.id.imageButton);
        img2=(ImageButton)findViewById(R.id.imageButton3);
        signbtn=(ImageButton)findViewById(R.id.imageButton2);
        image.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }

        });
        img2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent butt2 = new Intent(MainActivity.this,SearchText.class);
                startActivity(butt2);
            }
        });
        signbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent butt2 = new Intent(MainActivity.this,FirstActivity.class);
                startActivity(butt2);
            }
        });

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawar);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }







    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.camera) {
            // Handle the camera action

        } else if (id == R.id.search) {

        } else if (id == R.id.microphone) {

        } else if (id == R.id.support) {

        } else if (id == R.id.conect_us) {


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawar);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
