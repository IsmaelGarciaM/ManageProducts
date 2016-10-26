package com.example.manageproducts;

import android.content.Intent;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.manageproducts.model.Product;

public class AddProduct extends AppCompatActivity {

    EditText edName;
    EditText edDesc;
    EditText edBrand;
    EditText edDose;
    EditText edPrice;
    EditText edStock;
    Button btnAcceptAdd;
    Button btnCancelAdd;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product);


    }

}
