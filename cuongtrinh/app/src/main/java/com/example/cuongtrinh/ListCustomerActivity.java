package com.example.cuongtrinh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class ListCustomerActivity extends AppCompatActivity {

    RecyclerView rvCustomer;
    AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_customer);

        db = AppDatabase.getAppDatabase(this);
        List<Customer> list = db.customerDao().getAllCustomer();

        CustomerAdapter adapter = new CustomerAdapter(this,list);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        rvCustomer = findViewById(R.id.rvCustomer);
        rvCustomer.setLayoutManager(layoutManager);
        rvCustomer.setAdapter(adapter);
    }
}