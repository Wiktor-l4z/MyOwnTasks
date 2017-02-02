package com.example.android.miwok;

public class Word {

    private String mDeafaultTranstaltion;

    private String mMiwokTranslation;

    private int ImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDeafaultTranstaltion, String mMiwokTranslation, int imageResourceID) {
        this.mDeafaultTranstaltion = mDeafaultTranstaltion;
        ImageResourceID = imageResourceID;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public Word(String mMiwokTranslation, String mDeafaultTranstaltion) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDeafaultTranstaltion = mDeafaultTranstaltion;
    }

    public int getImageResourceID() {
        return ImageResourceID;
    }

    public String getmDeafaultTranstaltion() {
        return mDeafaultTranstaltion;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }


    public boolean hasImage() {
       return ImageResourceID != NO_IMAGE_PROVIDED;
    }
}
