package com.example.cuongtrinh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter {

    Activity activity;
    List<Customer> listCustomer;

    public CustomerAdapter(Activity activity, List<Customer> listCustomer) {
        this.activity = activity;
        this.listCustomer = listCustomer;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.item_customer, parent, false);
        CustomerHolder holder = new CustomerHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CustomerHolder ch = (CustomerHolder) holder;
        Customer model = listCustomer.get(position);
        ch.tvCustomerName.setText(model.id + "");
        ch.tvEmailAddress.setText(model.customerName);
        ch.tvPhoneNumber.setText(model.phoneNumber);
    }

    @Override
    public int getItemCount() {
        return listCustomer.size();
    }

    public class CustomerHolder extends RecyclerView.ViewHolder {

        TextView tvCustomerName, tvEmailAddress, tvPhoneNumber;

        public CustomerHolder(@NonNull View itemView) {
            super(itemView);
            tvCustomerName = itemView.findViewById(R.id.tvCustomerName);
            tvEmailAddress = itemView.findViewById(R.id.tvEmailAddress);
            tvPhoneNumber = itemView.findViewById(R.id.tvPhoneNumber);
        }
    }
}