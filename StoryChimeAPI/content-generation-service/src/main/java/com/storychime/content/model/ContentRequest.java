package com.storychime.content.model;

import javax.validation.constraints.NotBlank;

/**
 * Model class for content generation requests.
 */
public class ContentRequest {
    @NotBlank(message = "Text input cannot be blank.")
    private String text;  // The text input for content generation
    private String image; // The URL of an image associated with the content

    // Getters and setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
