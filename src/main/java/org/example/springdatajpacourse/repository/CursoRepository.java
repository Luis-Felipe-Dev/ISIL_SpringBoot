package org.example.springdatajpacourse.repository;

import org.example.springdatajpacourse.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
