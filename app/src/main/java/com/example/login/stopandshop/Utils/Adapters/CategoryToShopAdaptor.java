package com.example.login.stopandshop.Utils.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.login.stopandshop.R;

/**
 * Created by Login on 3/11/2018.
 */

public class CategoryToShopAdaptor extends RecyclerView.Adapter<CategoryToShopAdaptor.CategoryToShopViewHolder>{

    private static final String data[] = {"test","test","test","test","test","test","test","test","test","test","test","test","test","test","test","test","test","test","test","test","test","test",};

    public CategoryToShopAdaptor(){

    }

    @Override
    public CategoryToShopViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForListItem = R.layout.the_categories_to_shop_row_layout;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, parent, shouldAttachToParentImmediately);
        CategoryToShopViewHolder holder = new CategoryToShopViewHolder(view);

        return holder;


    }

    @Override
    public void onBindViewHolder(CategoryToShopViewHolder holder, int position) {
        holder.OnBind(position);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }



    //Create Holder first
    class CategoryToShopViewHolder extends RecyclerView.ViewHolder
    {
        TextView taskCounter;


        public CategoryToShopViewHolder(View itemView) {
            super(itemView);
            taskCounter = (TextView)itemView.findViewById(R.id.test_The_first_part);

        }

        public void OnBind(int position){

            taskCounter.setText(data[position]);
        }

    }

}
