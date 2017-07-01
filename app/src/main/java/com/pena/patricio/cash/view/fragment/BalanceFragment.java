package com.pena.patricio.cash.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pena.patricio.cash.R;
import com.pena.patricio.cash.adapter.BalanceAdapterRecyclerView;
import com.pena.patricio.cash.model.Entry;

import java.util.ArrayList;

/**
 * Created by patri on 01/07/2017.
 */

public class BalanceFragment extends Fragment {

    public BalanceFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_balance, container, false);

        RecyclerView balanceRecyclerView = (RecyclerView) view.findViewById(R.id.balance_recycler_view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        balanceRecyclerView.setLayoutManager(linearLayoutManager);

        BalanceAdapterRecyclerView balanceAdapterRecyclerView = new BalanceAdapterRecyclerView(buildEntries(), R.layout.entry);
        balanceRecyclerView.setAdapter(balanceAdapterRecyclerView);
        return view;
    }
    public ArrayList<Entry> buildEntries (){
        ArrayList<Entry> entries= new ArrayList<>();
        entries.add(new Entry("Sueldo", "05/07/2017","19:30:00", "6800"));
        entries.add(new Entry("Hipoteca", "10/07/2017", "08:15:00", "1300"));
        entries.add(new Entry("Tarj. Naranja", "10/07/2017", "08:30:00", "1500"));
        entries.add(new Entry("Electricidad", "10/07/2017", "13:00:00", "350"));
        entries.add(new Entry("Internet", "10/07/2017", "13:00:00", "450"));
        entries.add(new Entry("Quincenita", "20/07/2017", "20:00:00", "2500"));
        entries.add(new Entry("Aguinaldo", "20/07/2017", "20:00:00", "3400"));
        return entries;
    }
}