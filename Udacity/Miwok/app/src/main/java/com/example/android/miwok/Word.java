package com.example.android.miwok;

public class Word {

    private String mDeafaultTranstaltion;

    private String mMiwokTranslation;


    public Word(String mDeafaultTranstaltion, String mMiwokTranslation) {
        this.mDeafaultTranstaltion = mDeafaultTranstaltion;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDeafaultTranstaltion() {
        return mDeafaultTranstaltion;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
