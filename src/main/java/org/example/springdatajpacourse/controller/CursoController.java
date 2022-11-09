package org.example.springdatajpacourse.controller;

import org.example.springdatajpacourse.entity.Curso;
import org.example.springdatajpacourse.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private CursoService cursoService;

    @PostMapping("/add")
    public void addCurso(@RequestBody Curso curso){
        cursoService.addCurso(curso);
    }

    @GetMapping({"/", "/getall"})
    public List<Curso> getAllCategories(){
        return cursoService.getAllCursos();
    }

    @GetMapping("/getbyid")
    public Curso getCursoById(Long id){
        return cursoService.getCursoById(id);
    }
}
