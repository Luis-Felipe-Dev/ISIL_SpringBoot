package org.example.springdatajpacourse.service;

import org.example.springdatajpacourse.entity.Tema;
import org.example.springdatajpacourse.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TemaService {
    @Autowired
    private TemaRepository temaRepository;

    public void addTema(Tema tema) {
        temaRepository.save(tema);
    }

    public List<Tema> getAllTemas() {
        return temaRepository.findAll();
    }

    public Tema getTemaById(Long id) {

        Optional<Tema> tema = temaRepository.findById(id);

        if (tema.isPresent()) {
            return tema.get();
        } else {
            return null;
        }
    }
}
