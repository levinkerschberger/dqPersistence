package de.dqualizer.persistenceservice;

import de.dqualizer.persistenceservice.rqa.repository.RqaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PersistenceServiceApplication {

	@Autowired
	RqaRepository rqaRepository;

	public static void main(String[] args) {
		SpringApplication.run(PersistenceServiceApplication.class, args);
	}

}
