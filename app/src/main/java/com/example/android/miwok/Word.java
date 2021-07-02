package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn. It contains a default translation and a miwok translation for that word.
 */
public class Word {
    private String mDefaultTranslation;
    private String mMiworkTranslation;

    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
    /**
     * Get the Miwok translation of the word.
     */
    public String getmMiworkTranslation() {
        return mMiworkTranslation;
    }

    public Word(String mDefaultTranslation, String mMiworkTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiworkTranslation = mMiworkTranslation;
    }
}
