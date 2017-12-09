package com.bignerdranch.android.beatbox;

/**
 * Created by shishir on 8/12/17.
 */

public class Sound {
    private String mName;
    private String mAssetPath;
    private Integer mSoundId;

    public Sound(String assetPath){
        mAssetPath = assetPath;
        String[] components = assetPath.split("/");
        String filename = components[components.length-1];
        mName = filename.replace(".wav","");
    }


    public String getAssetPath() {
        return mAssetPath;
    }

    public String getName() {
        return mName;
    }


    public Integer getSoundId(){
        return mSoundId;
    }

    public void setSoundId(Integer soundId){
        mSoundId = soundId;
    }


}
