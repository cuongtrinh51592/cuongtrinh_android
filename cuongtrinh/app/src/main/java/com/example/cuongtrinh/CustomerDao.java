package com.example.cuongtrinh;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CustomerDao {

    @Insert
    long insertCustomer(Customer customer);

    @Query("Select * from customer where id = :id")
    Customer findCustomer(int id);

    @Query("Select * from customer")
    List<Customer> getAllCustomer();
}
