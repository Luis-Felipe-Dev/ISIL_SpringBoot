package org.example.springdatajpacourse.controller;

import org.example.springdatajpacourse.entity.Sede;
import org.example.springdatajpacourse.service.SedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sede")
public class SedeController {
    @Autowired
    private SedeService sedeService;

    @PostMapping("/add")
    public void addSede(@RequestBody Sede sede){
        sedeService.addSede(sede);
    }

    @GetMapping({"/", "/getall"})
    public List<Sede> getAllSedes(){
        return sedeService.getAllSedes();
    }

    @GetMapping("/getbyid")
    public Sede getSedeById(Long id){
        return sedeService.getSedeById(id);
    }
}
