package com.fiverr.veriffication.repository;


import com.fiverr.veriffication.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {}
