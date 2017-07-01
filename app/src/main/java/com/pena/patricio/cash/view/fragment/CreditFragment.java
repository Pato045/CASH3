package com.pena.patricio.cash.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pena.patricio.cash.R;

/**
 * Created by patri on 01/07/2017.
 */

public class CreditFragment extends Fragment {

    public CreditFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_credit, container, false);
        return rootView;
    }
}