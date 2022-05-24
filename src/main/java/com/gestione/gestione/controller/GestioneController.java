package com.gestione.gestione.controller;

import com.gestione.gestione.model.*;
import com.gestione.gestione.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class GestioneController {

    @Autowired
    AutoRepository autoRepository;

    @Autowired
    ProprietarioRepository proprietarioRepository;

    @GetMapping("/Auto")
    public List<auto> getAllAuto() 
    {
    return autoRepository.findAll();
    }

    @GetMapping("/Proprietario")
    public List<proprietario> getAllProprietari() 
    {
    return proprietarioRepository.findAll();
    }
    
    @GetMapping("/Auto/{id}")
    public Optional<auto> getAutoById(@PathVariable(value = "id") Long autoId) 
    {
    return autoRepository.findById(autoId);
    }

    @GetMapping("/Proprietario/{id}")
    public Optional<proprietario> getProprietarioById(@PathVariable(value = "id") Long proprietarioId) 
    {
    return proprietarioRepository.findById(proprietarioId);
    }
   

    
}
