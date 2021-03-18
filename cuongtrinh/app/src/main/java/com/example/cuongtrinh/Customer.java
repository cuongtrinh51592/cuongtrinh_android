package com.example.cuongtrinh;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "customer")
public class Customer {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "customerName")
    public String customerName;

    @ColumnInfo(name = "emailAddress")
    public String emailName;

    @ColumnInfo(name = "phoneNumber")
    public String phoneNumber;

    @ColumnInfo(name = "gender")
    public String gender;
}
