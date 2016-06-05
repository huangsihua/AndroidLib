package com.yunos.tv.androidlib.model;

import java.io.Serializable;

/**
 * Created by huangsihua on 15/8/4.
 */
public class EntityMediaItem implements Serializable {


    private  String description;
    private  String title;
    private  String urlPoster;
    /**
     * 媒资类型，1：图片，2：视频
     */
    private int type = 1;
    private long mediaId = 0;

    public EntityMediaItem(String description, String title, String urlPoster){
        this.description = description;
        this.title = title;
        this.urlPoster = urlPoster;
    }


    public EntityMediaItem(int type, String description, String title, String urlPoster){
        this.description = description;
        this.title = title;
        setUrlPoster(urlPoster);
        this.type = type;
    }

    public EntityMediaItem(int type, String description, String title, String urlPoster, long mediaId){
        this.description = description;
        this.title = title;
        setUrlPoster(urlPoster);
        this.type = type;
        setMediaId(mediaId);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlPoster() {
        return urlPoster;
    }

    public void setUrlPoster(String urlPoster) {
        this.urlPoster = urlPoster;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getMediaId() {
        return mediaId;
    }

    public void setMediaId(long mediaId) {
        this.mediaId = mediaId;
    }
}