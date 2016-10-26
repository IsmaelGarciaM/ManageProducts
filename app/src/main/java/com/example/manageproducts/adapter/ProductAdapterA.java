package com.example.manageproducts.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.manageproducts.ProductApplication;
import com.example.manageproducts.R;
import com.example.manageproducts.model.Product;

import java.util.List;

/**
 * Created by usuario on 21/10/16.
 */

public class ProductAdapterA extends ArrayAdapter<Product> {

    ImageView product_image;
    TextView txvName;
    TextView txvBrand;
    public ProductAdapterA(Context context) {
        super(context, R.layout.item_product, ((ProductApplication)context.getApplicationContext()).getProducts());

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Step 1 : Create an object inflater to initialize the context LayoutInflater
        //LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        LayoutInflater ltInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        //Step 2 : Inflate sight. Put in memory the View object containing the widget xml
        View item = ltInflater.inflate(R.layout.item_product, null);

        //Step 3 : Assign variables widgets by findViewById of each item*****
        product_image = (ImageView) item.findViewById(R.id.imgProduct);
        txvName = (TextView) item.findViewById(R.id.txvNameItem);
        txvBrand = (TextView) item.findViewById(R.id.txvBrandItem);

        //Step 4 : Assign data from adapter to the widgets
        product_image.setImageResource(getItem(position).getmImage());
        txvName.setText(getItem(position).getmName());
        txvBrand.setText(getItem(position).getmBrand());


        return item;

    }
}
