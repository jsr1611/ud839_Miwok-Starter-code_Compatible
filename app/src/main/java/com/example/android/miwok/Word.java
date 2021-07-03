package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn. It contains a default translation and a miwok translation for that word.
 */
public class Word {
    private String mDefaultTranslation;
    private String mMiworkTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mPronunciationFileId;

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

    /**
     * Get the associated image resource id of the word.
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Get the associated pronunciation music file id for the word
     *
     * @return
     */
    public int getmPronunciationFileId() {
        return mPronunciationFileId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    /**
     * Create a new Word object
     *
     * @param mDefaultTranslation  is the word in a language that user is using(such as English)
     * @param mMiworkTranslation   is the word in the Miwok language
     * @param mPronunciationFileId is the music file resource ID for the pronunciation music file.
     */
    public Word(String mDefaultTranslation, String mMiworkTranslation, int mPronunciationFileId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiworkTranslation = mMiworkTranslation;
        this.mPronunciationFileId = mPronunciationFileId;
    }

    /**
     * Create a new Word object
     *
     * @param mDefaultTranslation  is the word in a language that user is using(such as English)
     * @param mMiworkTranslation   is the word in the Miwok language
     * @param mImageResourceId     is the drawable resource ID for the image asset.
     * @param mPronunciationFileId is the music file resource ID for the pronunciation music file.
     */
    public Word(String mDefaultTranslation, String mMiworkTranslation, int mImageResourceId, int mPronunciationFileId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiworkTranslation = mMiworkTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mPronunciationFileId = mPronunciationFileId;
    }

}
