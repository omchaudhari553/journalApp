package com.edigest.jourmalApp.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "config_journal_app")
@Data
public class ConfigJournalAppEntity {
    private String key;
    private String value;
}
