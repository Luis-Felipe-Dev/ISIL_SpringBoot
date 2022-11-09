package org.example.springdatajpacourse.repository;

import org.example.springdatajpacourse.entity.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long> {
}
