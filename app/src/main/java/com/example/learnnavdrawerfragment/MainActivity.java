package com.example.learnnavdrawerfragment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

//    Basic Variables for the Navigation Drawer
    DrawerLayout mDrawerLayout;
    ActionBarDrawerToggle mActionBarDrawerToggle;
    Toolbar mToolbar;
    NavigationView mNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        The Custom Toolbar created
        mToolbar = findViewById(R.id.nav_drawer_toolbar);
        setSupportActionBar(mToolbar);

//        References to Navigation Drawer variables
        mDrawerLayout = findViewById(R.id.nav_drawer_main_activity);
        mNavigationView = findViewById(R.id.navigationView);

//        Add the Navigation Drawer(DrawerLayout and ToolBar) to this Activity
        mActionBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar,
                R.string.open, R.string.close);
//        Add a listener for this toggle
        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);
//        Enable the Hamburger Sign
        mActionBarDrawerToggle.setDrawerIndicatorEnabled(true);
//        Sync the State of the navigation drawer - is it open or closed
        mActionBarDrawerToggle.syncState();


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//        This listens to the Menu Items that Appear on the Navigation Drawer
        int itemId = menuItem.getItemId();
        switch (itemId){
            case(R.id.menu_home):
                break;
            case(R.id.menu_new):
                break;
            case(R.id.menu_share):
                break;
            case(R.id.menu_email):
                break;
            default:
                break;
        }
        return true;
    }
}