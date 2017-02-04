package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int SoundResourceID;

    private int ImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;


    public Word(String mDefaultTranslation, String mMiwokTranslation, int imageResourceID, int soundResourceID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        ImageResourceID = imageResourceID;
        SoundResourceID = soundResourceID;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation, int soundResourceID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        SoundResourceID = soundResourceID;
    }

    public int getImageResourceID() {
        return ImageResourceID;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getSoundResourceID() {
        return SoundResourceID;
    }

    public boolean hasImage() {
        return ImageResourceID != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", SoundResourceID=" + SoundResourceID +
                ", ImageResourceID=" + ImageResourceID +
                '}';
    }
}
