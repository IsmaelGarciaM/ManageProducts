package com.example.manageproducts;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.manageproducts.adapter.ProductAdapter;
import com.example.manageproducts.adapter.ProductAdapterA;
import com.example.manageproducts.adapter.ProductAdapterB;

public class ListProductActivity extends ListActivity {

    private ListView listView;
    //private ArrayAdapter<Product> adapterP;

    private ProductAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);

        //Case 1
        //adapterP = new ArrayAdapter<Product>(this, android.R.layout.simple_list_item_1, ((ProductApplication)getApplicationContext()).GetProducts());


        adapter = new ProductAdapter(this);
        getListView().setAdapter(adapter);


    }
}
