package com.codiodes.prople.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codiodes.prople.BuyActivity;
import com.codiodes.prople.R;
import com.codiodes.prople.RentActivity;
import com.codiodes.prople.SellActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    //  Event Listener of Buy Button.
    public void onClickBtnBuy(View v)
    {
        Intent i = new Intent(getActivity(), BuyActivity.class);
        startActivity(i);
    }

    //  Event Listener of Sell Button.
    public void onClickBtnSell(View v)
    {
        Intent i = new Intent(getActivity(), SellActivity.class);
        startActivity(i);
    }

    //  Event Listener of Rent Button.
    public void onClickBtnRent(View v)
    {
        Intent i = new Intent(getActivity(), RentActivity.class);
        startActivity(i);
    }

    //  Event Listener of Rent Button.
    public void onClickBtnListings(View v)
    {
        Intent i = new Intent(getActivity(), RentActivity.class);
        startActivity(i);
    }
}
