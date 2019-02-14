package com.example.rajayambigms.componentcollectionandroid;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

/*
*
*
*
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottomNavi_View);

        final HomeFragment homeFragment = new HomeFragment();
        final BussinessFragment bussinessFragment = new BussinessFragment();
        final CallFragment callFragment = new CallFragment();
        final ContactFragment contactFragment = new ContactFragment();
        final MisscallFragment misscallFragment = new MisscallFragment();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int id = menuItem.getItemId();
                if(id == R.id.home_menu_item)
                {
                    setFragemnts(homeFragment);
                    return true;
                }
                else if(id == R.id.buss_menu_item)
                {
                    setFragemnts(bussinessFragment);
                    return true;
                }
                else if(id == R.id.dialcall_menu_item)
                {
                    setFragemnts(callFragment);
                    return true;
                }
               else if(id == R.id.contact_menu_iitem)
                {
                    setFragemnts(contactFragment);
                    return true;
                }
                else if(id == R.id.misscall_menu_item)
                {
                    setFragemnts(misscallFragment);
                    return true;
                }

                return false;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.home_menu_item);
    }

    public void setFragemnts(Fragment fragemnts)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.commit();
        transaction.replace(R.id.Frame,fragemnts);

    }
}
