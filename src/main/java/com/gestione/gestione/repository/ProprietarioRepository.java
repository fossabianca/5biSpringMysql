package com.gestione.gestione.repository;

import java.util.List;
import java.util.Optional;

import com.gestione.gestione.model.proprietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ProprietarioRepository extends JpaRepository<proprietario, Long> {

    Optional<proprietario> findById(int proprietarioId);

    public proprietario findByNome(String nome);

    public proprietario findByCognome(String cognome);
    @Query(value = "select * from proprietario p where p.cognome = :cognome", nativeQuery = true)
    public List<proprietario> getProprietariByCognome(@Param("cognome")String cognome);
}