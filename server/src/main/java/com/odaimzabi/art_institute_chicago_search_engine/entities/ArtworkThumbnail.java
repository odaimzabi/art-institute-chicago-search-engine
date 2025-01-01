package com.odaimzabi.art_institute_chicago_search_engine.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArtworkThumbnail {
  private String lqip; //Base64 image data
  private Float width;
  private Float height;
  private String alt_text;

}
