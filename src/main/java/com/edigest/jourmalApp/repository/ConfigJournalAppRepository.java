package com.edigest.jourmalApp.repository;

import com.edigest.jourmalApp.entity.ConfigJournalAppEntity;
import com.edigest.jourmalApp.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfigJournalAppRepository extends MongoRepository<ConfigJournalAppEntity, String> {

}
