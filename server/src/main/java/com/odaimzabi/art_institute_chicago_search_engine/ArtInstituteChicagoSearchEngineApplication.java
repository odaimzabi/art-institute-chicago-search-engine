package com.odaimzabi.art_institute_chicago_search_engine;

import com.odaimzabi.art_institute_chicago_search_engine.controllers.UserInformationController;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@RequiredArgsConstructor
@SpringBootApplication
public class ArtInstituteChicagoSearchEngineApplication {

	private final UserInformationController userInformationController;

    public static void main(String[] args) {
		SpringApplication.run(ArtInstituteChicagoSearchEngineApplication.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("Service initialized at: " + new Date());
		addAdditionalInfo();
	}

	public void addAdditionalInfo() {
		System.out.println("Some other method called.");
		System.out.println(userInformationController.userInfos);
	}

}
