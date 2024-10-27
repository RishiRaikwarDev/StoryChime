package com.storychime.content.controller;

import com.storychime.content.model.ContentRequest;
import com.storychime.content.service.ContentService;
import com.storychime.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for handling content generation requests.
 * Exposes API endpoints for generating visual content from text.
 */
@RestController
@RequestMapping("/api/content")
public class ContentController {

    private static final Logger logger = LoggerFactory.getLogger(ContentController.class);

    @Autowired
    private ContentService contentService;

    /**
     * Generates content based on the provided request.
     *
     * @param request The content request containing text and media inputs.
     * @return A response entity containing the result of the content generation.
     * @throws CustomException if the input is invalid.
     */
    @PostMapping("/generate")
    public ResponseEntity<String> generateContent(@RequestBody ContentRequest request) {
        logger.info("Generating content for text: {}", request.getText());
        validateContentRequest(request);
        String result = contentService.processContent(request);
        return ResponseEntity.ok(result);
    }

    /**
     * Validates the content request to ensure it meets the required criteria.
     *
     * @param request The content request to validate.
     * @throws CustomException if the text input is null or empty.
     */
    private void validateContentRequest(ContentRequest request) {
        if (request.getText() == null || request.getText().isEmpty()) {
            throw new CustomException("Text input cannot be null or empty.");
        }
    }
}
