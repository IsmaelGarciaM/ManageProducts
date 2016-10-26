package com.example.manageproducts.model;

import java.util.Locale;

/**
 * Created by usuario on 19/10/16.
 */

public class Product {


    private int mId;
    private String mName;
    private String mDescription;
    private String mDose;
    private String mBrand;
    private double mPrice;
    private int mStock;
    private int mImage;


    public void setmBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    public void setmStock(int mStock) {
        this.mStock = mStock;
    }

    public String getmDescription() {

        return mDescription;
    }

    public String getmBrand() {
        return mBrand;
    }

    public int getmId() {
        return mId;
    }

    public int getmImage() {
        return mImage;
    }

    public String getmName() {
        return mName;
    }

    public double getmPrice() {
        return mPrice;
    }

    public int getmStock() {
        return mStock;
    }


    public void setDose(String dose) {
        this.mDose = dose;
    }


    public String getDose() {
        return mDose;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Nombre : '" + mName + '\'' +
                ", Precio :" + mPrice +
                + mImage + '\'' +
                '}';
    }

    public Product(String mName, String mDescription, String mBrand, double mPrice, int mStock, int mImage, String mDose) {


        this.mName = mName;
        this.mDescription = mDescription;
        this.mBrand = mBrand;
        this.mPrice = mPrice;
        this.mStock = mStock;
        this.mImage = mImage;
        this.mDose = mDose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!mName.equals(product.mName)) return false;
        if (!mDose.equals(product.mDose)) return false;
        return mBrand.equals(product.mBrand);

    }



    public String getFormattedPrice(){
        return String.format( "$%s", mPrice);
    }

    public String getFormattedStock(){
        return String.format(Locale.getDefault(), "%d u.", mStock);
    }


}


