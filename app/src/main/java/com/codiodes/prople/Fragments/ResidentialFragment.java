package com.codiodes.prople.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codiodes.prople.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResidentialFragment extends Fragment {


    public ResidentialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_residential, container, false);
    }


}
