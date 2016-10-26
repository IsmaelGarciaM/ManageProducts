package com.example.manageproducts;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.manageproducts.model.Product;

import java.util.ArrayList;

public class ProductApplication  extends Application{

    private ArrayList<Product> productos = new ArrayList();

    @Override
    public void onCreate(){

        super.onCreate();
        AddProduct(new Product("Ibuprofeno", "Pastillas para dolor muscular", "Bayer", 5.99, 100, R.drawable.ibu, "1gr"));
        AddProduct(new Product("Paracetamol", "Pastillas para la gripe", "Bayer", 3.58, 200, R.drawable.para, "1gr"));
        AddProduct(new Product("Dalsy", "Jarabe para tos", "Bayer", 3.58, 200, R.drawable.dalsy, "15gr"));
        AddProduct(new Product("Ibuprofeno", "Pastillas para dolor muscular", "Bayer", 5.99, 100, 454, "1gr"));
        AddProduct(new Product("Paracetamol", "Pastillas para la gripe", "Bayer", 3.58, 200, 555, "1gr"));
        AddProduct(new Product("Dalsy", "Jarabe para tos", "Bayer", 3.58, 200, 555, "15gr"));
        AddProduct(new Product("Ibuprofeno", "Pastillas para dolor muscular", "Bayer", 5.99, 100, 454, "1gr"));
        AddProduct(new Product("Paracetamol", "Pastillas para la gripe", "Bayer", 3.58, 200, 555, "1gr"));
        AddProduct(new Product("Dalsy", "Jarabe para tos", "Bayer", 3.58, 200, 555, "15gr"));
        AddProduct(new Product("Ibuprofeno", "Pastillas para dolor muscular", "Bayer", 5.99, 100, 454, "1gr"));
        AddProduct(new Product("Paracetamol", "Pastillas para la gripe", "Bayer", 3.58, 200, 555, "1gr"));
        AddProduct(new Product("Dalsy", "Jarabe para tos", "Bayer", 3.58, 200, 555, "15gr"));
        AddProduct(new Product("Paracetamol", "Pastillas para la gripe", "Bayer", 3.58, 200, 555, "1gr"));
        AddProduct(new Product("Dalsy", "Jarabe para tos", "Bayer", 3.58, 200, 555, "15gr"));
        AddProduct(new Product("Ibuprofeno", "Pastillas para dolor muscular", "Bayer", 5.99, 100, 454, "1gr"));
        AddProduct(new Product("Paracetamol", "Pastillas para la gripe", "Bayer", 3.58, 200, 555, "1gr"));
        AddProduct(new Product("Dalsy", "Jarabe para tos", "Bayer", 3.58, 200, 555, "15gr"));
        AddProduct(new Product("Ibuprofeno", "Pastillas para dolor muscular", "Bayer", 5.99, 100, 454, "1gr"));
        AddProduct(new Product("Paracetamol", "Pastillas para la gripe", "Bayer", 3.58, 200, 555, "1gr"));
        AddProduct(new Product("Dalsy", "Jarabe para tos", "Bayer", 3.58, 200, 555, "15gr"));
    }

    public void AddProduct(Product p){

       productos.add(p);


    }

    public ArrayList getProducts(){


        return productos;
    }


}





