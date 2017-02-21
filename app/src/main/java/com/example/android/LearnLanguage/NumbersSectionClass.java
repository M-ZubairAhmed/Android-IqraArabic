package com.example.android.LearnLanguage;

public class NumbersSectionClass {

    private String storeEnNumbers;
    private String storeArNumbers;
//    private int storermNumbers;

    //contructor of the class
    public NumbersSectionClass(String storeEnNumbers, String storeArNumbers){
        this.storeEnNumbers = storeEnNumbers;
        this.storeArNumbers = storeArNumbers;
//        this.storermNumbers = storermNumbers;
    }

    //getter for foreign numbers
    String getStoreArNumbers() {
        return storeArNumbers;
    }

    //getter for native numbers
    String getStoreEnNumbers() {
        return storeEnNumbers;
    }
/*
    public int getStorermNumbers() {
        return storermNumbers;
    }*/
}
