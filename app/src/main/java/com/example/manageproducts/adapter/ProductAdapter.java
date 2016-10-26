package com.example.manageproducts.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.manageproducts.ProductApplication;
import com.example.manageproducts.R;
import com.example.manageproducts.model.Product;

/**
 * Created by usuario on 21/10/16.
 */

public class ProductAdapter extends ArrayAdapter<Product> {


    public ProductAdapter(Context context) {
        super(context, R.layout.item_product, ((ProductApplication)context.getApplicationContext()).getProducts());

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView;
        ProductHolder ph ;

        //If initialized it is reused
        if(item == null) {
            //Step 1 : Create an object inflater to initialize the context LayoutInflater
            //LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            LayoutInflater ltInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Step 2 : Inflate sight. Put in memory the View object containing the widget xml
            item = ltInflater.inflate(R.layout.item_product, null);
            ph = new ProductHolder();

            //Step 3 : Assign variables widgets by findViewById of each item*****
            ph.product_image = (ImageView) item.findViewById(R.id.imgProduct);
            ph.txvName = (TextView) item.findViewById(R.id.txvNameItem);
            ph.txvBrand = (TextView) item.findViewById(R.id.txvBrandItem);
            ph.txvPrice = (TextView) item.findViewById(R.id.txvPriceItem);
            ph.txvStock = (TextView) item.findViewById(R.id.txvStockItem);
            item.setTag(ph);
        }
        else
            ph = (ProductHolder) item.getTag();

        //Step 4 : Assign data from adapter to the widgets
        ph.product_image.setImageResource(getItem(position).getmImage());
        ph.txvName.setText(getItem(position).getmName());
        ph.txvBrand.setText(getItem(position).getmBrand());
        ph.txvPrice.setText(getItem(position).getFormattedPrice());
        ph.txvStock.setText(getItem(position).getFormattedStock());

        if(position % 2 != 0)
            item.setBackgroundResource(R.color.colorImpar);
        else
            item.setBackgroundResource(R.color.colorPar);


        return item;

    }

    /**
     * Internal class that contains the widgets from XML file
     */
    class ProductHolder{
        ImageView product_image;
        TextView txvName;
        TextView txvBrand;
        TextView txvPrice;
        TextView txvStock;

    }
}
