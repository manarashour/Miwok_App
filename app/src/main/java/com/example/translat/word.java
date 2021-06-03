package com.example.translat;

public class word {
    private String mDefultTranslation;
    private String mMiwokTranslation;
    private int mImage=no_image;
    private static final int no_image=-1;
    private int mAudioResourceId;
    public word(String defultTranslation,String miwokTranslation,int audioResourceId)
    {
        mDefultTranslation=defultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceId=audioResourceId;

    }
    public word(String defultTranslation,String miwokTranslation,int image,int audioResourceId)
    {
        mDefultTranslation=defultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImage=image;
        mAudioResourceId=audioResourceId;

    }

    public String getDefultTranslation(){return mDefultTranslation;}
    public String getMiwokTranslation(){return mMiwokTranslation;}
    public int getImage(){return mImage;}
    public boolean hasImage(){return mImage!=no_image;}
    public int getmAudioResourceId(){return mAudioResourceId;}

    @Override
    public String toString() {
        return "word{" +
                "mDefultTranslation='" + mDefultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImage=" + mImage +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
