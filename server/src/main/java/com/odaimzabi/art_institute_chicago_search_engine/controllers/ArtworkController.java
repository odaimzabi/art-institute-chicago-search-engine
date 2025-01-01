package com.odaimzabi.art_institute_chicago_search_engine.controllers;

import com.odaimzabi.art_institute_chicago_search_engine.entities.Artwork;
import com.odaimzabi.art_institute_chicago_search_engine.responses.ApiResponse;
import com.odaimzabi.art_institute_chicago_search_engine.services.ArtworkService;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "${api.prefix}/artworks")
public class ArtworkController {
  private final ArtworkService artworkService;

  @GetMapping()
  public ResponseEntity<ApiResponse> getArtworks(@NotNull @NotBlank @RequestParam(name="query") String query) {
    try {
      ArrayList<Artwork> artworks = this.artworkService.fetchArtworksByQuery(query);
      return ResponseEntity.ok(new ApiResponse("success", artworks));
    } catch (Exception e) {
      return ResponseEntity.status(INTERNAL_SERVER_ERROR)
          .body(new ApiResponse("Error: ", e.getMessage()));
    }
  }
}
