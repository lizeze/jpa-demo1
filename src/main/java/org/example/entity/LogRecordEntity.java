package org.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "log_record")
@Entity
@Data
public class LogRecordEntity {

    @Id
    private Long id;

    private String message;
}
