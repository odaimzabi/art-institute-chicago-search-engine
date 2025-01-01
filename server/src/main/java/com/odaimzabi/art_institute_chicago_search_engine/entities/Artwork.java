package com.odaimzabi.art_institute_chicago_search_engine.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Artwork {
  private Integer id;
  private String title;
  private ArtworkThumbnail thumbnail;
  private String image_id;

}
