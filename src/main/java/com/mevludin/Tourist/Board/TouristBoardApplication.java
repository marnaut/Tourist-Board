package com.mevludin.Tourist.Board;

import com.mevludin.Tourist.Board.models.*;
import com.mevludin.Tourist.Board.repositories.MunicipalityRepository;
import com.mevludin.Tourist.Board.repositories.ReviewRepository;
import com.mevludin.Tourist.Board.repositories.SightRepository;
import com.mevludin.Tourist.Board.repositories.CountryRepository;
import org.apache.logging.log4j.spi.LoggerRegistry;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@SpringBootApplication

public class TouristBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristBoardApplication.class, args);
	}

	@Bean
	public CommandLineRunner mappingDemo(CountryRepository stateRepository, MunicipalityRepository municipalityRepository, SightRepository sightRepository, ReviewRepository reviewRepository){
		return args -> {
				try{
					Country country = new Country();
					country.setCountryName("Bosnia");
					country.setCountryAbbreviations("ba");
					stateRepository.save(country);


					Municipality municipality = new Municipality();
					municipality.setName("Zenica");
					municipality.setState(country);
					municipalityRepository.save(municipality);

					Sight sight = new Sight("Kuća Ive Andrića", "Bosansko-hercegovački Nobelovac", 11.304, 34.235, true, Importance.INEVITABLY, municipality);
					sightRepository.save(sight);

					Review review = new Review(5, sight);
					reviewRepository.save(review);
				} catch (Exception ex){
					System.out.println("Error : " + ex.getMessage());
				}

		};
	}
}
