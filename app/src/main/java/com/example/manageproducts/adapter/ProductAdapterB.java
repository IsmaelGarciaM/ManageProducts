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

/**
 * Created by usuario on 21/10/16.
 */

public class ProductAdapterB extends ArrayAdapter<Product> {


    public ProductAdapterB(Context context) {
        super(context, R.layout.item_product, ((ProductApplication)context.getApplicationContext()).getProducts());

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView;
        ImageView product_image;
        TextView txvName;
        TextView txvBrand;
        TextView txvPrice;
        TextView txvStock;

        if(item == null) {
            LayoutInflater ltInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            item = ltInflater.inflate(R.layout.item_product, null);
        }
        product_image = (ImageView) item.findViewById(R.id.imgProduct);
        txvName = (TextView) item.findViewById(R.id.txvNameItem);
        txvBrand = (TextView) item.findViewById(R.id.txvBrandItem);
        txvPrice = (TextView) item.findViewById(R.id.txvPriceItem);
        txvStock = (TextView) item.findViewById(R.id.txvStockItem);


        product_image.setImageResource(getItem(position).getmImage());
        txvName.setText(getItem(position).getmName());
        txvBrand.setText(getItem(position).getmBrand());
        txvPrice.setText(getItem(position).getFormattedPrice());
        txvStock.setText(getItem(position).getFormattedStock());


        return item;

    }
}
