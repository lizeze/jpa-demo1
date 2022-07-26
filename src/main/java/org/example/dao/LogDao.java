package org.example.dao;

import org.example.entity.LogRecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogDao extends JpaRepository<LogRecordEntity, Long> {
}
