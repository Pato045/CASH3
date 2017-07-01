package com.pena.patricio.cash.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pena.patricio.cash.R;
import com.pena.patricio.cash.model.Entry;

import java.util.ArrayList;

/**
 * Created by patri on 01/07/2017.
 */

public class BalanceAdapterRecyclerView extends RecyclerView.Adapter<BalanceAdapterRecyclerView.EntryViewHolder> {

    private ArrayList<Entry> entries;
    private int resource;

    public BalanceAdapterRecyclerView(ArrayList<Entry> entries, int resource) {
        this.entries = entries;
        this.resource = resource;
    }

    public class EntryViewHolder extends RecyclerView.ViewHolder {

        private TextView account;
        private TextView date;
        private TextView time;
        private TextView amount;

        public EntryViewHolder(View itemView) {
            super(itemView);

            account = (TextView) itemView.findViewById(R.id.account_text_view);
            date = (TextView) itemView.findViewById(R.id.date_text_view);
            time = (TextView) itemView.findViewById(R.id.time_text_view);
            amount = (TextView) itemView.findViewById(R.id.amount_text_view);
        }
    }

    @Override
    public EntryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        return new EntryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EntryViewHolder holder, int position) {
        Entry entry = entries.get(position);
        holder.account.setText(entry.getAccount());
        holder.date.setText(entry.getDate());
        holder.time.setText(entry.getTime());
        holder.amount.setText(entry.getAmount());
    }

    @Override
    public int getItemCount() {
        return entries.size();
    }
}
