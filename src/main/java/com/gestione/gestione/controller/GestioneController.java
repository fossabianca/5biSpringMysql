package com.gestione.gestione.controller;

import com.gestione.gestione.model.*;
import com.gestione.gestione.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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
    
    @GetMapping("/Auto/id/{id}")
    public Optional<auto> getAutoById(@PathVariable(value = "id") int autoId) 
    {
    return autoRepository.findById(autoId);
    }

    @GetMapping("/Proprietario/id/{id}")
    public Optional<proprietario> getProprietarioById(@PathVariable(value = "id") int proprietarioId) 
    {
    return proprietarioRepository.findById(proprietarioId);
    }
   
    @GetMapping("/Proprietario/cognome/{cognome}")
    public proprietario getProprietarioByCognome(@PathVariable(value = "cognome") String cognome) 
    {
    return proprietarioRepository.findByCognome(cognome);
    }

    @GetMapping("/Proprietari/cognome/{cognome}")
    public List<proprietario> getProprietariByCognome(@PathVariable(value = "cognome") String cognome) 
    {
    return proprietarioRepository.getProprietariByCognome(cognome);
    }

    @GetMapping("/Proprietario/nome/{nome}")
    public proprietario getProprietarioByNome(@PathVariable(value = "nome") String nome) 
    {
    return proprietarioRepository.findByNome(nome);
    }
    
    @Transactional
    @PostMapping("/add/Proprietario/")
    public proprietario addProprietario(@RequestBody proprietario proprietario)
    {
        return proprietarioRepository.save(proprietario);
    }

    @Transactional
    @PostMapping("/add/Proprietari/")
    public List<proprietario> addProprietario(@RequestBody List<proprietario> proprietari)
    {
        return proprietarioRepository.saveAll(proprietari);
    }

    @Transactional
    @PutMapping("/update/Proprietario")
    public proprietario updateproprietario(@RequestBody proprietario proprietario)
    {
        proprietario proprietarioMemorizzato = proprietarioRepository.findById(proprietario.getId()).orElse(proprietario);
        proprietarioMemorizzato.setCognome(proprietario.getCognome());
        proprietarioMemorizzato.setNome(proprietario.getNome());
        proprietarioMemorizzato.setTelefono(proprietario.getTelefono());
        return proprietarioRepository.save(proprietarioMemorizzato);
    }

    @Transactional
    @DeleteMapping("/delete/Proprietario/{id}")
    public String deleteproprietario(@PathVariable(value = "id") int id)
    {
        proprietarioRepository.deleteById(id);;
        return "Eliminato proprietario con codice " + id;
    }


}
