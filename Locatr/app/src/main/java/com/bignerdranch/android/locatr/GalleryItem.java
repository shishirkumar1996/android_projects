package com.bignerdranch.android.locatr;

import android.net.Uri;

/**
 * Created by shishir on 9/12/17.
 */

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOwner;
    private double mLat;
    private double mLon;


    public double getLon() {
        return mLon;
    }

    public void setLon(double lon) {
        mLon = lon;
    }



    public double getLat() {
        return mLat;
    }

    public void setLat(double lat) {
        mLat = lat;
    }


    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String owner) {
        mOwner = owner;
    }

    public Uri getPhotoPageUri(){
        return Uri.parse("http://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }

    @Override
    public String toString() {
        return mCaption;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getCaption() {

        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }
}
