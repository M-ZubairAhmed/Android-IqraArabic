package com.example.android.LearnLanguage;

public class Words {

    private final static int NO_IMAGE = -1;
    private final static int NO_SOUND = -5;
    private String englishWords;
    private String arabicWords;
    private int pictureRep = NO_IMAGE;
    private int spellSounds = NO_SOUND;

    /**
     * Constructor with english and arabic words.
     * @param englishWords  : English words.
     * @param arabicWords   : Arabic words.
     */
    public Words(String englishWords, String arabicWords) {
        this.englishWords = englishWords;
        this.arabicWords = arabicWords;
    }

    /**
     * Constructro with picture representation, english and arabic words.
     * @param englishWords  : English words.
     * @param arabicWords   : Arabic words.
     * @param pictureRep    : image resource id of picture representation.
     */
    public Words(String englishWords, String arabicWords, int pictureRep) {
        this.englishWords = englishWords;
        this.arabicWords = arabicWords;
        this.pictureRep = pictureRep;
    }

    /**
     * Constructor with picture, sound representation, english and arabic words.
     * @param englishWords  : Initalizes English words.
     * @param arabicWords   : Initalizes Arabic words.
     * @param pictureRep    : Initalizes image resource id of picture representation.
     * @param spellSound    : Initalizes sounds of the words in arabic.
     */
    public Words(String englishWords, String arabicWords, int pictureRep, int spellSound){
        this.englishWords = englishWords;
        this.arabicWords = arabicWords;
        this.pictureRep = pictureRep;
        this.spellSounds = spellSound;
    }

    /**
     * getter method for arabic words.
     * @return arabicWords : returns arabic Words.
     */
    public String getArabicWords() {
        return arabicWords;
    }

    //getter for native numbers

    /**
     * getter method for english words.
     * @return englishWords : returns string value english words.
     */
    public String getEnglishWords() {
        return englishWords;
    }

    /**
     * getter method for picture representation.
     * @return pictureRep  : returns int id of picture.
     */
    public int getPictureRep() {
        return pictureRep;
    }

    /**
     * method for checking if image has be inialized.
     * @return boolean value if picture image id is null or not null.
     */
    public boolean hasPictureRep(){
        return pictureRep != NO_IMAGE;
    }

    /**
     * getter method for sound files.
     * @return spellSounds : returns sound id of associated sound file.
     */
    public int getSpellSounds() {
        return spellSounds;
    }

    /**
     * method for checking if sound has been initialized.
     * @return boolean value if sound if is null or not null.
     */
    public boolean hasSound(){
        return spellSounds != NO_SOUND;
    }
}
