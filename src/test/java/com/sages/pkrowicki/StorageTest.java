package com.sages.pkrowicki;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Pawel Krowicki on 2017-06-21.
 */
public class StorageTest {

    @Test
    public void storageShouldBeEmptyAfterCreation() {
        //given
        Storage storage = new Storage();  // Tworzymy obiekt klasy, którą testujemy
        List<String> expectedResult = new ArrayList<>();
        //when
        List<String> actualResult = storage.getProducts();
        //then
        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void shouldRetrieveStoredProducts() {
        //given
        Storage storage = new Storage();
        List<String> expectedResult = Arrays.asList("Eggs", "Milks", "Water");
        //when
        storage.addWholeList(expectedResult);
        List<String> actualResult = storage.getProducts();
        //then
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void shouldAddOneItem() {
        //given
        Storage storage = new Storage();
        List<String> expectedResult = Arrays.asList("Eggs");
        //when
        storage.addProduct("Eggs");
        List<String> actualResult = storage.getProducts();
        //then
        Assert.assertEquals(expectedResult,actualResult);
    }
}