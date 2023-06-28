package de.dqualizer.persistenceservice.rqa.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import de.dqualizer.persistenceservice.rqa.model.Rqa;

@CrossOrigin(origins = "*", maxAge = 3600)
@RepositoryRestResource
public interface RqaRepository extends MongoRepository<Rqa, String> {
    @Query("{id: '?ß'}")
    public Rqa findById(int Id);

    @Query("{name:'?0'}")
    public List<Rqa> findByName(@Param("name") String name);

}
