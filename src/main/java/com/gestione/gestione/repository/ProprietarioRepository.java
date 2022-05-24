package com.gestione.gestione.repository;

import java.util.Optional;

import com.gestione.gestione.model.proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietarioRepository extends JpaRepository<proprietario, Long> {

    Optional<proprietario> findById(int proprietarioId);

}