package com.odaimzabi.art_institute_chicago_search_engine.mappers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.odaimzabi.art_institute_chicago_search_engine.entities.Artwork;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class ArtworkEntityMapper {

  public Artwork mapJsonToArtwork(File jsonFile) throws IOException {

    return new ObjectMapper().readValue(jsonFile, Artwork.class);
  }
}
