package com.example.login.stopandshop.Utils.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.login.stopandshop.R;
import com.example.login.stopandshop.Utils.Adapters.Pojo.Signup;

import java.util.ArrayList;

/**
 * Created by Login on 3/21/2018.
 */

public class SignUpAdapter extends RecyclerView.Adapter<SignUpAdapter.MyViewHolder> {
    private ArrayList<Signup> data = new ArrayList<>();

    public SignUpAdapter(ArrayList<Signup> data) {
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.signup_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }



    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.sign_up);
        }
    }
}
