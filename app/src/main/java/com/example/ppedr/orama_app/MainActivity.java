package com.example.ppedr.orama_app;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    //private NavigationView mNavigationView;
    private android.support.v7.widget.Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mToolbar = findViewById(R.id.nav_action);
        //setSupportActionBar(mToolbar);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        //mNavigationView = (NavigationView) findViewById(R.id.nav_menu);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }

    public void clickRendaFixa(View v){

        Intent RendaFixaActivity = new Intent(this, RendaFixaActivity.class);
        startActivity(RendaFixaActivity);

    }

    public void clickEstrategias(View v){

        Intent EstrategiasActivity = new Intent(this, EstrategiasActivity.class);
        startActivity(EstrategiasActivity);

    }

    public void clickRendaVariavel(View v){

        Intent RendaVariavelActivity = new Intent(this , RendaVariavelActivity.class);
        startActivity(RendaVariavelActivity);
    }

    public void clickTodos(View v){

        Intent TodosActivity = new Intent(this , TodosActivity.class);
        startActivity(TodosActivity);
    }
}