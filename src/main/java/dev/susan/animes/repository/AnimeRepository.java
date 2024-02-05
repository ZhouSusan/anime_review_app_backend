package dev.susan.animes.repository;

import dev.susan.animes.entity.Anime;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends MongoRepository<Anime, ObjectId> {
}
