package com.storychime.assembly.controller;

import com.storychime.assembly.model.VideoRequest;
import com.storychime.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for handling video assembly requests.
 * Exposes API endpoints for assembling videos from media URLs.
 */
@RestController
@RequestMapping("/api/video")
public class VideoAssemblyController {

    private static final Logger logger = LoggerFactory.getLogger(VideoAssemblyController.class);

    /**
     * Assembles a video from the provided media request.
     *
     * @param request The video request containing media URLs.
     * @return A response entity indicating the success of the video assembly.
     * @throws CustomException if the media URLs are invalid.
     */
    @PostMapping("/assemble")
    public ResponseEntity<String> assembleVideo(@RequestBody VideoRequest request) {
        logger.info("Assembling video with media URLs: {}", (Object) request.getMediaUrls());
        validateVideoRequest(request);
        // Logic to assemble video
        return ResponseEntity.ok("Video assembled successfully!");
    }

    /**
     * Validates the video request to ensure it meets the required criteria.
     *
     * @param request The video request to validate.
     * @throws CustomException if the media URLs are null or empty.
     */
    private void validateVideoRequest(VideoRequest request) {
        if (request.getMediaUrls() == null || request.getMediaUrls().length == 0) {
            throw new CustomException("Media URLs cannot be null or empty.");
        }
    }
}
