package com.sages.pkrowicki;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-06-21.
 */


//Co wsadzę za pomocą addProduct, wyciągnę za pomocą getProducts.

public class Storage {
    private List<String> products = new ArrayList<>();

    public boolean addProduct(String singleProduct){
        if(products.add(singleProduct)) {
            System.out.println("Produkt "+ singleProduct+" dodany!");
            return true;
        } else {
            System.out.println("Blad dodawania produktu! :(");
            return false;
        }
    }

    public List<String> getProducts() {
        return products;
    }

    public void addWholeList(List<String> newProducts){
        this.products=newProducts;
    }

    public void showList() {
        for(String product : products) {
            System.out.println("1. "+product);
        }
    }
}
