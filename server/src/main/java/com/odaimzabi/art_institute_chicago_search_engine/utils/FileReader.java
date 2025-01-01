package com.odaimzabi.art_institute_chicago_search_engine.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

@Component
public class FileReader {

  public ArrayList<File> readDirectory(String directoryPath, String fileExt) throws IOException {
    ArrayList<File> files = new ArrayList<>();
    File loadedDirectory = new ClassPathResource(directoryPath).getFile();

    if (loadedDirectory.isDirectory()) {
      for (File file : Objects.requireNonNull(loadedDirectory.listFiles())) {
        if (file.isFile() && file.getName().endsWith(fileExt)) {
          files.add(file);
        }
      }
    }

    return files;
  }
}
