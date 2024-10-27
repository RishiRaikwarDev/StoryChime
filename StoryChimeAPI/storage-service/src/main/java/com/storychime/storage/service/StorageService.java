package com.storychime.storage.service;

import com.storychime.storage.model.MediaUploadRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service for handling media storage logic.
 * Contains the business logic for uploading and retrieving media.
 */
@Service
public class StorageService {

    private static final Logger logger = LoggerFactory.getLogger(StorageService.class);

    /**
     * Uploads media to the designated storage location.
     *
     * @param request The media upload request containing the media URL.
     */
    public void uploadMedia(MediaUploadRequest request) {
        logger.info("Uploading media to storage: {}", request.getMediaUrl());
        // Logic to interact with a storage service (e.g., AWS S3)
    }
}
