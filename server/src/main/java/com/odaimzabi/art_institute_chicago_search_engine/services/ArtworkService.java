package com.odaimzabi.art_institute_chicago_search_engine.services;

import com.odaimzabi.art_institute_chicago_search_engine.entities.Artwork;
import com.odaimzabi.art_institute_chicago_search_engine.mappers.ArtworkEntityMapper;
import com.odaimzabi.art_institute_chicago_search_engine.utils.FileReader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class ArtworkService {
  private final FileReader fileReader;
  private final ArtworkEntityMapper artworkEntityMapper;

  public ArrayList<Artwork> fetchArtworksByQuery(String query) throws IOException {
    ArrayList<Artwork> artworks = new ArrayList<>();
    ArrayList<File> jsonFiles = this.fileReader.readDirectory("/artworks", ".json");

    for (File jsonFile : jsonFiles) {
      Artwork artwork = this.artworkEntityMapper.mapJsonToArtwork(jsonFile);

      if (artwork.getTitle().toLowerCase().contains(query)) {
        artworks.add(artwork);
      }
    }

    return artworks;
  }
}
