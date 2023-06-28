package de.dqualizer.persistenceservice.rqa.repository;

import de.dqualizer.persistenceservice.rqa.model.Rqa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RqaRepository extends MongoRepository<Rqa, String> {
    public Rqa findById(int Id);
    public List<Rqa> findByName(@Param("name") String name);

}
