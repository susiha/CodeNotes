package com.susiha.codenotes.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.susiha.codenotes.R;

/**
 * Created by 苏斯哈 on 2016/10/21.
 */

public class MainRecycleAdapter extends RecyclerView.Adapter<MainRecycleAdapter.MainRecycleViewHolder> {



    @Override
    public MainRecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MainRecycleViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }



    public class MainRecycleViewHolder extends RecyclerView.ViewHolder
    {

        TextView item_tv;
        public MainRecycleViewHolder(View itemView) {
            super(itemView);
            item_tv=(TextView)itemView.findViewById(R.id.item);
        }
    }


}
