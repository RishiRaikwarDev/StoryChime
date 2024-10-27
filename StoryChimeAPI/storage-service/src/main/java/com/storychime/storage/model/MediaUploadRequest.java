package com.storychime.storage.model;

/**
 * Model class for media upload requests.
 * Contains the necessary fields for uploading media.
 */
public class MediaUploadRequest {
    private String mediaUrl; // URL of the media to be uploaded

    // Getters and setters
    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }
}
