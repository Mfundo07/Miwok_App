package com.example.android.miwok;

/**
 * Created by Admin on 6/21/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;
    private int mPlayArrowResourceId;

    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId, int playArrowResourceId){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
        mPlayArrowResourceId = playArrowResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId,int audioResourceId, int playArrowResourceId){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
        mPlayArrowResourceId = playArrowResourceId;
    }

    public String getDefaultTranslation(){
        return  mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public  int getImageResourceId(){
        return mImageResourceId;
    }
    public int getPlayArrowResourceId(){return mPlayArrowResourceId;}
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;

    }

    /**
     *
     * @return
     */
    public int getAudioResourceId(){return mAudioResourceId;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}

