package com.gestione.gestione.repository;

import com.gestione.gestione.model.auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepository extends JpaRepository<auto, Long> {

}