package org.example.springdatajpacourse.service;

import org.example.springdatajpacourse.entity.Curso;
import org.example.springdatajpacourse.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public void addCurso(Curso curso) {
        cursoRepository.save(curso);
    }

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Curso getCursoById(Long id) {

        Optional<Curso> curso = cursoRepository.findById(id);

        if (curso.isPresent()) {
            return curso.get();
        } else {
            return null;
        }
    }
}
