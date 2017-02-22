package com.example.android.LearnLanguage;
public class Words {

    private String textInForn;
    private String textInNatv;
    private int picOnLeft;

    //Constructors of the section class
    public Words(String textInForn, String textInNatv, int picOnLeft){
        this.textInForn = textInForn;
        this.textInNatv = textInNatv;
        this.picOnLeft = picOnLeft;
    }
    public Words(String textInForn, String textInNatv){
        this.textInNatv = textInNatv;
        this.textInForn = textInForn;
    }

    //getter methods for the member variable
    public String getTextInForn() {
        return textInForn;
    }
    public String getTextInNatv() {
        return textInNatv;
    }
    public int getPicOnLeft() {
        return picOnLeft;
    }
}
