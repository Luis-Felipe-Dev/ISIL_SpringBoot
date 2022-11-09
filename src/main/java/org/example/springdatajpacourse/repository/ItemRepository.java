package org.example.springdatajpacourse.repository;

import org.example.springdatajpacourse.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
