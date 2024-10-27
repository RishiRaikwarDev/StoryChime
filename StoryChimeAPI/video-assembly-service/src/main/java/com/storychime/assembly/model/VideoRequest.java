package com.storychime.assembly.model;

/**
 * Model class for video assembly requests.
 * Contains the necessary fields for assembling a video.
 */
public class VideoRequest {
    private String[] mediaUrls; // Array of media URLs to assemble

    // Getters and setters
    public String[] getMediaUrls() {
        return mediaUrls;
    }

    public void setMediaUrls(String[] mediaUrls) {
        this.mediaUrls = mediaUrls;
    }
}
