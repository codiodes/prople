package com.codiodes.prople;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.codiodes.prople.Fragments.AddPropertyFragment;
import com.codiodes.prople.Fragments.AuctionFragment;
import com.codiodes.prople.Fragments.CommercialFragment;
import com.codiodes.prople.Fragments.PreLeasedFragment;
import com.codiodes.prople.Fragments.RentFragment;
import com.codiodes.prople.Fragments.ResidentialFragment;
import com.codiodes.prople.Fragments.SaleFragment;
import com.codiodes.prople.Helper.Constants;

import com.codiodes.prople.Helper.Constants;


public class LandingPageActivity extends FragmentActivity {

    ViewPager pager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        pager = (ViewPager)findViewById(R.id.pager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        pager.setAdapter(new PageAdapter(fragmentManager));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_landing_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


    class PageAdapter extends FragmentPagerAdapter {

        public PageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new SaleFragment();
                    break;
                case 1:
                    fragment = new RentFragment();
                    break;
                case 2:
                    fragment = new AuctionFragment();
                    break;
                case 3:
                    fragment= new PreLeasedFragment();
                    break;
                case 4:
                    fragment = new ResidentialFragment();
                    break;
                case 5:
                    fragment= new CommercialFragment();
                    break;
                case 6:
                    fragment = new AddPropertyFragment();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return Constants.NO_OF_TABS;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String title = Constants.tabNames[position];
            return title;
        }
    }