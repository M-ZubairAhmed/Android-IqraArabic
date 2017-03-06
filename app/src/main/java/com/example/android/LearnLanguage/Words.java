package com.example.android.LearnLanguage;

public class Words {

    private static int NO_IMAGE = -1;
    private String englishWords;
    private String arabicWords;
    private int pictureRep = NO_IMAGE;

    //contructor of the class
    public Words(String englishWords, String arabicWords) {
        this.englishWords = englishWords;
        this.arabicWords = arabicWords;
    }

    public Words(String englishWords, String arabicWords, int pictureRep) {
        this.englishWords = englishWords;
        this.arabicWords = arabicWords;
        this.pictureRep = pictureRep;
    }

    //getter for foreign numbers
    public String getArabicWords() {
        return arabicWords;
    }

    //getter for native numbers
    public String getEnglishWords() {
        return englishWords;
    }

    public int getPictureRep() {
        return pictureRep;
    }

    public boolean hasPictureRep(){
        return pictureRep != NO_IMAGE;
    }


}
