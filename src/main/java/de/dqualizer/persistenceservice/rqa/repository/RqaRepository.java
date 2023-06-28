package de.dqualizer.persistenceservice.rqa.repository;

import de.dqualizer.persistenceservice.rqa.model.Rqa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface RqaRepository extends MongoRepository<Rqa, String> {
    @Query("{id: '?ß'}")
    public Rqa findById(int Id);

    @Query("{name:'?0'}")
    public List<Rqa> findByName(@Param("name") String name);

}
