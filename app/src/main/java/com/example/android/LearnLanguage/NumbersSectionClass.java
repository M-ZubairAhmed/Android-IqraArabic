package com.example.android.LearnLanguage;

public class NumbersSectionClass {

    private String storeEnNumbers;
    private String storeArNumbers;

    //contructor of the class
    public NumbersSectionClass(String storeEnNumbers, String storeArNumbers){
        this.storeEnNumbers = storeEnNumbers;
        this.storeArNumbers = storeArNumbers;
    }

    public String getStoreArNumbers() {
        return storeArNumbers;
    }

    public String getStoreEnNumbers() {
        return storeEnNumbers;
    }
}
