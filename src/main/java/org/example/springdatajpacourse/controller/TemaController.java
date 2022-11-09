package org.example.springdatajpacourse.controller;

import org.example.springdatajpacourse.entity.Tema;
import org.example.springdatajpacourse.service.TemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tema")
public class TemaController {
    @Autowired
    private TemaService temaService;

    @PostMapping("/add")
    public void addTema(@RequestBody Tema tema){
        temaService.addTema(tema);
    }

    @GetMapping({"/", "/getall"})
    public List<Tema> getAllTemas(){
        return temaService.getAllTemas();
    }

    @GetMapping("/getbyid")
    public Tema getTemaById(Long id){
        return temaService.getTemaById(id);
    }
}
