package com.storychime.storage.controller;

import com.storychime.storage.model.MediaUploadRequest;
import com.storychime.storage.service.StorageService;
import com.storychime.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for handling storage and retrieval of media.
 * Exposes API endpoints for uploading media files.
 */
@RestController
@RequestMapping("/api/storage")
public class StorageController {

    private static final Logger logger = LoggerFactory.getLogger(StorageController.class);

    @Autowired
    private StorageService storageService;

    /**
     * Uploads media from the provided request.
     *
     * @param request The media upload request containing the media URL.
     * @return A response entity indicating the success of the upload.
     * @throws CustomException if the media URL is invalid.
     */
    @PostMapping("/upload")
    public ResponseEntity<String> uploadMedia(@RequestBody MediaUploadRequest request) {
        logger.info("Uploading media from URL: {}", request.getMediaUrl());
        validateMediaUploadRequest(request);
        storageService.uploadMedia(request);
        return ResponseEntity.ok("Media uploaded successfully!");
    }

    /**
     * Validates the media upload request to ensure it meets the required criteria.
     *
     * @param request The media upload request to validate.
     * @throws CustomException if the media URL is null or empty.
     */
    private void validateMediaUploadRequest(MediaUploadRequest request) {
        if (request.getMediaUrl() == null || request.getMediaUrl().isEmpty()) {
            throw new CustomException("Media URL cannot be null or empty.");
        }
    }
}
