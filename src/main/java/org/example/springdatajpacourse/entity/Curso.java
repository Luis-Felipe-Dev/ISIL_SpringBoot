package org.example.springdatajpacourse.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String description;

    private double horario;

    private Date fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "usuarioCreacion")
    private User user;

    @ManyToOne
    @JoinColumn(name = "idSede")
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "idTema")
    private Tema tema;
}
