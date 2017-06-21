package com.sages.pkrowicki;

import com.google.common.base.Joiner;

import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-06-21.
 */
public class Shop {
    public static void main(String[] args) {



        Storage shop1 = new Storage();

        shop1.addProduct("Milk");
        shop1.addProduct("Egg");
        shop1.addProduct("Water");
        shop1.showList();
        String appendedString = Joiner.on(", ").join(shop1.getProducts());
        System.out.println(appendedString);

    }
}
