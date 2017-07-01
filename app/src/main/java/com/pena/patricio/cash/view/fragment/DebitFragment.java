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

public class DebitFragment extends Fragment {

    public DebitFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_debit, container, false);
        return rootView;
    }
}